package Listener;

import Inventorys.ChallangeInventory;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class ChallangeListener implements Listener {

    @EventHandler
    public void onChallangeAuswahl(PlayerInteractEvent e) {
        if(e.getItem() != null) {
            if(e.getItem().getItemMeta() != null) {
                if(e.getItem().hasItemMeta()) {
                    if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§8» §3Challange")) {
                        e.getPlayer().openInventory(ChallangeInventory.getChallangeInventory());
                    }
                }
            }
        }
    }
}
