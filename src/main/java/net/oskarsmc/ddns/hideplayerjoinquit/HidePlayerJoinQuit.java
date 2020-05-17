package net.oskarsmc.ddns.hideplayerjoinquit;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class HidePlayerJoinQuit extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("======== HidePlayerJoinQuit ========");
        getLogger().info("Author: OskarZyg");
        getLogger().info("Website: http://konzen.ddns.net");
        getLogger().info("Loading...");
        try {
            Bukkit.getPluginManager().registerEvents(this, this);
            getLogger().info("Loading complete!");
        } catch (Exception e) {
            getLogger().severe("Error while loading. Printing stack trace!");
            e.printStackTrace();
        }
        getLogger().info("======== HidePlayerJoinQuit ========");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(null);
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage(null);
    }
}
