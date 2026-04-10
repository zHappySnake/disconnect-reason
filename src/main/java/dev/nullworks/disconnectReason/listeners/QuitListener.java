package dev.nullworks.disconnectReason.listeners;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class QuitListener implements Listener {

    @EventHandler
    private void onQuit(PlayerQuitEvent event) {
        event.quitMessage(
                Component.text(event.getPlayer().getName(), NamedTextColor.YELLOW)
                        .append(Component.text(" left the game (" + event.getReason() + ")", NamedTextColor.GRAY))
        );
    }
}
