package ItemManager;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.inventory.ItemStack;
import tv.aysu.Durchspielen;
import utils.ItemBuilder;

public class LobbyItems implements Listener {




    static ItemStack ChallangeDE = new ItemBuilder(Material.BELL, 1).setDisplayName("§8» §3Challange").setLore("§7Wähle deine Challange!").createItemStack();
    static ItemStack TeamInviteDE = new ItemBuilder(Material.DIAMOND_SWORD, 1).setDisplayName("§8» §3Spieler einladen").setLore("§7Schlage um Spieler einzuladen!").createItemStack();
    static ItemStack AchievementsDE = new ItemBuilder(Material.NETHER_STAR, 1).setDisplayName("§8» §3Achievements").setLore("§7Siehe deine Achievements!").createItemStack();

    static ItemStack ChallangeENG = new ItemBuilder(Material.BELL, 1).setDisplayName("§8» §3Challange").setLore("§7Chose your Challange!").createItemStack();
    static ItemStack TeamInviteENG = new ItemBuilder(Material.DIAMOND_SWORD, 1).setDisplayName("§8» §3Invite player").setLore("§7Hit a player to invite him!").createItemStack();
    static ItemStack AchievementsENG = new ItemBuilder(Material.NETHER_STAR, 1).setDisplayName("§8» §3Achievements").setLore("§7Shows your achievements!").createItemStack();

    public static void setLobbyItemsDE(Player p) {
        p.getInventory().clear();
        p.getInventory().setItem(2, ChallangeDE);
        p.getInventory().setItem(4, TeamInviteDE);
        p.getInventory().setItem(6, AchievementsDE);
    }

    public static void setLobbyItemsENG(Player p) {
        p.getInventory().clear();
        p.getInventory().setItem(2, ChallangeENG);
        p.getInventory().setItem(4, TeamInviteENG);
        p.getInventory().setItem(6, AchievementsENG);
    }

    @EventHandler
    public void HungerChange(FoodLevelChangeEvent e) {
        Player p = (Player) e.getEntity();
        if(Durchspielen.getInstance().LobbySpieler.contains(e.getEntity().getUniqueId())) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void ArmorStandMani(PlayerArmorStandManipulateEvent e) {
        if(e.getPlayer().hasPermission("aysu.admin")) {
            if(!e.getPlayer().getGameMode().equals(GameMode.CREATIVE)) {
                e.setCancelled(true);
            }
        } else {
            if(Durchspielen.getInstance().LobbySpieler.contains(e.getPlayer().getUniqueId())) {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onInventoryClickE(InventoryClickEvent e) {
        if(e.getWhoClicked().hasPermission("aysu.admin")) {
            if(!e.getWhoClicked().getGameMode().equals(GameMode.CREATIVE)) {
                e.setCancelled(true);
            }
        } else {
            if(Durchspielen.getInstance().LobbySpieler.contains(e.getWhoClicked().getUniqueId())) {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onWeatherChange(WeatherChangeEvent e) {
            e.setCancelled(true);
    }

    @EventHandler
    public void onAnimalSpawn(CreatureSpawnEvent e) {
        if(e.getSpawnReason() == CreatureSpawnEvent.SpawnReason.NATURAL) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void BlockBreak(BlockBreakEvent e) {
        if(e.getPlayer().hasPermission("aysu.admin")) {
            if(!e.getPlayer().getGameMode().equals(GameMode.CREATIVE)) {
                e.setCancelled(true);
            }
        } else {
            if(Durchspielen.getInstance().LobbySpieler.contains(e.getPlayer().getUniqueId())) {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void BlockPlace(BlockPlaceEvent e) {
        if(e.getPlayer().hasPermission("aysu.admin")) {
            if(!e.getPlayer().getGameMode().equals(GameMode.CREATIVE)) {
                e.setCancelled(true);
            }
        } else {
            if(Durchspielen.getInstance().LobbySpieler.contains(e.getPlayer().getUniqueId())) {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onItemdrop(PlayerDropItemEvent e) {
        if(e.getPlayer().hasPermission("aysu.admin")) {
            if(!e.getPlayer().getGameMode().equals(GameMode.CREATIVE)) {
                e.setCancelled(true);
            }
        } else {
            if(Durchspielen.getInstance().LobbySpieler.contains(e.getPlayer().getUniqueId())) {
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onItemdrop(EntityDamageEvent e) {
        if(Durchspielen.getInstance().LobbySpieler.contains(e.getEntity().getUniqueId())) {
            e.setCancelled(true);
        }
    }



}
