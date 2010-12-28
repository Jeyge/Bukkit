
package org.bukkit.event.player;

import org.bukkit.event.Listener;

/**
 * Handles all events thrown in relation to a Player
 */
public class PlayerListener implements Listener {
    public PlayerListener() {
    }

    /**
     * Called when a player joins a server
     *
     * @param event Relevant event details
     */
    public void onPlayerJoin(PlayerEvent event) {
    }

    /**
     * Called when a player leaves a server
     *
     * @param event Relevant event details
     */
    public void onPlayerQuit(PlayerEvent event) {
    }

    /**
     * Called when a player sends a chat message
     *
     * @param event Relevant event details
     */
    public void onPlayerChat(PlayerChatEvent event) {
    }

    /**
     * Called when a player attempts to use a command
     *
     * @param event Relevant event details
     */
    public void onPlayerCommand(PlayerChatEvent event) {
    }
}