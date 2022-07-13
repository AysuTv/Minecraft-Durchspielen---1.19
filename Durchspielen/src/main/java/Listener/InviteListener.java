package Listener;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import tv.aysu.Durchspielen;

public class InviteListener implements Listener  {

    @EventHandler
    public void onTeamInvite(EntityDamageByEntityEvent e) {
        Player Target = (Player) e.getEntity();
        Player Inviter = (Player) e.getDamager();
        if(e.getEntity().getType() == EntityType.PLAYER) {
            if(Durchspielen.getInstance().LobbySpieler.contains(Inviter.getUniqueId())) {
              if(Inviter.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_SWORD)) {
                  Inviter.performCommand("/game invite " + Target.getName());
                }
              }
        } else {
            e.setCancelled(true);
        }
    }
}
