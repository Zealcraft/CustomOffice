package net.zealcraft.commands;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: tchoutchawn
 * Date: 8/18/13
 * Time: 8:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomOfficeCommands {
    public boolean onCommand(CommandSender sender, String label, String[] args) {
        if (args.length == 0)
            ;//TODO: send help

        String cmd = args[0].toLowerCase();

        try {
            Method m = getClass().getMethod(cmd, CommandSender.class, String[].class);
            if (m.isAnnotationPresent(Command.class)) {
                if (!sender.hasPermission("customoffice.command."+cmd)) {
                    sender.sendMessage("You do not have enough permissions.");
                    return true;
                }

                String[] myArgs = Arrays.copyOfRange(args, 1, args.length);

                return (Boolean) m.invoke(this, sender, myArgs);
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {}

        return false;//TODO: send help -> help(sender);
    }


    @Command
    public boolean test(CommandSender sender, String[] args) {


        sender.sendMessage("This is a test!!!!!");
        return true;
    }
}