package dev.nullworks.disconnectReason;

import dev.nullworks.disconnectReason.listeners.QuitListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Enabling DisconnectReason");

        registerListeners();
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Disabling DisconnectReason");
    }

    private void registerListeners() {
        PluginManager pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(new QuitListener(), this);
    }
}
