package net.zealcraft.commands;

import net.citizensnpcs.api.npc.NPC;

/**
 * Created with IntelliJ IDEA.
 * User: tchoutchawn
 * Date: 8/18/13
 * Time: 6:07 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CommandSender extends org.bukkit.command.CommandSender{
    public void sendMessage(String message);
    public void sendMessage(String[] messages);
    public boolean hasPermission(String name);
    public NPC getNPC();
}
