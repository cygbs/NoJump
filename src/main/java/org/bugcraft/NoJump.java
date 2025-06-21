package org.bugcraft;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.event.EventPriority;

public class NoJump extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("NoJump plugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("NoJump plugin has been disabled!");
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerJump(PlayerJumpEvent event) {
        event.setCancelled(true);
        // event.getPlayer().sendMessage("NoJump!");
    }
}
