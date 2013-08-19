package net.zealcraft;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerLoginEvent;

public class CustomOfficeListener implements Listener {

   public CustomOfficeListener(CustomOfficePlugin plugin){
           plugin.getServer().getPluginManager().registerEvents(this, plugin);
   }

    @EventHandler
    public void normalLogin(PlayerLoginEvent event) {
        // Some code here
    }

    @EventHandler(priority = EventPriority.HIGH)
    public void highLogin(PlayerLoginEvent event) {

    }
}
