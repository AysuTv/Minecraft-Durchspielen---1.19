package Listener;

import ItemManager.LobbyItems;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import tv.aysu.Durchspielen;

public class QuitL implements Listener {

    @EventHandler
    public void onQuitE(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        e.setQuitMessage("§c» " + p.getDisplayName());
        Durchspielen.getInstance().LobbySpieler.remove(p.getUniqueId());

    }
}