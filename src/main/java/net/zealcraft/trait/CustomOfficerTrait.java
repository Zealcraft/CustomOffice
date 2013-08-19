package net.zealcraft.trait;

import net.citizensnpcs.api.trait.Trait;
import net.citizensnpcs.api.util.DataKey;
import net.citizensnpcs.trait.Toggleable;
import net.zealcraft.CustomOffice;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;

/**
 * Created with IntelliJ IDEA.
 * User: tchoutchawn
 * Date: 8/18/13
 * Time: 9:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomOfficerTrait extends Trait {
    private CustomOffice plugin=null;

    public CustomOfficerTrait() {
        super("customofficer");
        plugin = (CustomOffice) Bukkit.getServer().getPluginManager().getPlugin("CustomOffice");
    }

    //Here you should load up any values you have previously saved.
    //This does NOT get called when applying the trait for the first time, only loading onto an existing npc at server start.
    //This is called AFTER onAttach so you can load defaults in onAttach and they will be overridden here.
    //This is called BEFORE onSpawn so do not try to access npc.getBukkitEntity(). It will be null.
    public void load(DataKey key) {
    }

    //Save settings for this NPC. These values will be added to the citizens saves.yml under this NPC.
    public void save(DataKey key) {

    }



    //Run code when your trait is attached to a NPC.
    //This is called BEFORE onSpawn so do not try to access npc.getBukkitEntity(). It will be null.
    @Override
    public void onAttach() {
        //plugin.getServer().getLogger().info(npc.getName() + "has been assigned MyTrait!");

        //This will send a empty key to the Load method, forcing it to load the config.yml defaults.
        //Load will get called again with a real key if this NPC has previously been saved
    }

    // Run code when the NPC is despawned. This is called before the entity actually despawns so npc.getBukkitEntity() is still valid.
    @Override
    public void onDespawn() {
    }

    //Run code when the NPC is spawned. Note that npc.getBukkitEntity() will be null until this method is called.
    //This is called AFTER onAttach and AFTER Load when the server is started.
    @Override
    public void onSpawn() {

    }

    //run code when the NPC is removed. Use this to tear down any repeating tasks.
    @Override
    public void onRemove() {
    }

}