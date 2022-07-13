package Listener;

import ItemManager.LobbyItems;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import tv.aysu.Durchspielen;

public class JoinL implements Listener {

    @EventHandler
    public void onJoinE(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        e.setJoinMessage("§a» " + p.getDisplayName());
        p.setMaxHealth(6);
        //if(AysuServer.getInstance().getUser(p.getUniqueId()).getLanguage().equals(Language.GERMAN)) {
            LobbyItems.setLobbyItemsDE(p);
       // } else {
            LobbyItems.setLobbyItemsENG(p);
       // }
        Durchspielen.getInstance().LobbySpieler.add(p.getUniqueId());
    }
}
