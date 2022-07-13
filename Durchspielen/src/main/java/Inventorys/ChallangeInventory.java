package Inventorys;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import tv.aysu.Durchspielen;
import utils.ItemBuilder;

public class ChallangeInventory implements Listener {

    // NoCraftingTable, HalbesHerz, Block-Mob-Randomizer, The floor is Lava, Force Mob Challange, Force-Block, MLG-Challange, Default, Schaden = randomEffect, Halloween Challange, Keine Rüstung, jump spawn, clear hit, speed run challange

    public static Inventory ChallangeInventory = Bukkit.createInventory((InventoryHolder) null, 45, "§8» §3Challange Inventory");

    public static void generateChallangeInventory() {

        List<String> HalbesHerzChallange = new ArrayList<String>();
        HalbesHerzChallange.add("§b» §7Du hast die gesamte Challange lang nur ein halbes Herz!");

        List<String> SlotsChallange = new ArrayList<String>();
        SlotsChallange.add("§b» §7Du hast die gesamte Challange lang nur 3 Slots zu verfügung!");

        List<String> DefaultChallangeLore = new ArrayList<String>();
        DefaultChallangeLore.add("§b» §7Spiele ganz normal Minecraft durch ohne Challange!");

        List<String> MLGLore = new ArrayList<String>();
        MLGLore.add("§b» §7Jede 5 Minuten musst du einen MLG machen!");

        List<String> Randomizer = new ArrayList<String>();
        Randomizer.add("§b» §7Jeden Block den du abbaust dropt ein Random Item!");

        List<String> HalloweenChallange = new ArrayList<String>();
        HalloweenChallange.add("§b» §7Du hast während der gesamten Challange einen Kürbis auf dem Kopf!");

        List<String> TheFloorIsLavaChallange = new ArrayList<String>();
        TheFloorIsLavaChallange.add("§b» §7Jeder Block unter dir verwandelt sich nach einer Zeit zu Lava!");

        List<String> NoCraftingChallange = new ArrayList<String>();
        NoCraftingChallange.add("§b» §7Spiele Minecraft durch ohne eine Werkbank!");

        List<String> HitClear = new ArrayList<String>();
        HitClear.add("§b» §7Dein Inventar wird bei jedem schaden geleert!");

        List<String> JumpSpawn = new ArrayList<String>();
        JumpSpawn.add("§b» §7Dein Inventar wird bei jedem schaden geleert!");

        List<String> NoArmor = new ArrayList<String>();
        NoArmor.add("§b» §7Die ganze Challange ist Rüstung verboten!");

        ChallangeInventory.setItem(0, (new ItemBuilder(Material.GRASS, 1, (byte) 0)).setDisplayName("§8» §bDefault Challange").setLore(DefaultChallangeLore).createItemStack());
        ChallangeInventory.setItem(1, (new ItemBuilder(Material.SKELETON_SKULL, 1, (byte) 0)).setDisplayName("§8» §bHalbes Herz Challange").setLore(HalbesHerzChallange).createItemStack());
        ChallangeInventory.setItem(2, (new ItemBuilder(Material.BARRIER, 1, (byte) 0)).setDisplayName("§8» §b3 Slots Challange").setLore(SlotsChallange).createItemStack());
        ChallangeInventory.setItem(3, (new ItemBuilder(Material.TNT, 1, (byte) 0)).setDisplayName("§8» §bMLG Challange").setLore(MLGLore).createItemStack());
        ChallangeInventory.setItem(4, (new ItemBuilder(Material.DIAMOND, 1, (byte) 0)).setDisplayName("§8» §bRandomizer Challange").setLore(Randomizer).createItemStack());
        ChallangeInventory.setItem(5, (new ItemBuilder(Material.PUMPKIN, 1, (byte) 0)).setDisplayName("§8» §bHalloween Challange").setLore(HalloweenChallange).createItemStack());
        ChallangeInventory.setItem(6, (new ItemBuilder(Material.LAVA_BUCKET, 1, (byte) 0)).setDisplayName("§8» §bThe floor is lava Challange").setLore(TheFloorIsLavaChallange).createItemStack());
        ChallangeInventory.setItem(7, (new ItemBuilder(Material.CRAFTING_TABLE, 1, (byte) 0)).setDisplayName("§8» §bWerkbank = Verboten Challange").setLore(NoCraftingChallange).createItemStack());
        ChallangeInventory.setItem(8, (new ItemBuilder(Material.WOODEN_SWORD, 1, (byte) 0)).setDisplayName("§8» §bHit = Clear Challange").setLore(HitClear).createItemStack());
        ChallangeInventory.setItem(9, (new ItemBuilder(Material.SLIME_BALL, 1, (byte) 0)).setDisplayName("§8» §bJump = Mob Challange").setLore(JumpSpawn).createItemStack());
        ChallangeInventory.setItem(10, (new ItemBuilder(Material.LEATHER_CHESTPLATE, 1, (byte) 0).setLeatherArmorColor(Color.BLUE)).setDisplayName("§8» §bRüstung verboten Challange").setLore(NoArmor).createItemStack());


        //Premium bereich//
        ChallangeInventory.setItem(27, (new ItemBuilder(Material.WHITE_STAINED_GLASS_PANE, 1, (byte) 0)).setDisplayName("").createItemStack());
        ChallangeInventory.setItem(28, (new ItemBuilder(Material.WHITE_STAINED_GLASS_PANE, 1, (byte) 0)).setDisplayName("").createItemStack());
        ChallangeInventory.setItem(29, (new ItemBuilder(Material.WHITE_STAINED_GLASS_PANE, 1, (byte) 0)).setDisplayName("").createItemStack());
        ChallangeInventory.setItem(30, (new ItemBuilder(Material.WHITE_STAINED_GLASS_PANE, 1, (byte) 0)).setDisplayName("").createItemStack());
        ChallangeInventory.setItem(31, (new ItemBuilder(Material.PAPER, 1, (byte) 0)).setDisplayName("§8» §6Premium-Challanges").setLore("§7Diese Challanges sind nur für Premium Spieler zugänglich!").createItemStack());
        ChallangeInventory.setItem(32, (new ItemBuilder(Material.WHITE_STAINED_GLASS_PANE, 1, (byte) 0)).setDisplayName("").createItemStack());
        ChallangeInventory.setItem(33, (new ItemBuilder(Material.WHITE_STAINED_GLASS_PANE, 1, (byte) 0)).setDisplayName("").createItemStack());
        ChallangeInventory.setItem(34, (new ItemBuilder(Material.WHITE_STAINED_GLASS_PANE, 1, (byte) 0)).setDisplayName("").createItemStack());
        ChallangeInventory.setItem(35, (new ItemBuilder(Material.WHITE_STAINED_GLASS_PANE, 1, (byte) 0)).setDisplayName("").createItemStack());
    }

    public static Inventory getChallangeInventory() {
        return ChallangeInventory;
    }

    public String getChallange(InventoryClickEvent e) {
        if(e.getCurrentItem() != null) {
            if(e.getCurrentItem().getItemMeta() != null) {
                return "§6" + e.getCurrentItem().getItemMeta().getDisplayName().replaceAll("§8» §b", "");
            }
        }
        return "§6Fehler";
    }

    @EventHandler
    public void onClickE(InventoryClickEvent e) {
            Player p = (Player) e.getWhoClicked();
            if(Durchspielen.getInstance().LobbySpieler.contains(e.getWhoClicked().getUniqueId())) {
                e.setCancelled(true);
            }
            if(e.getCurrentItem() != null) {
                if(e.getCurrentItem().getItemMeta() != null) {
                    if(!e.getCurrentItem().getType().equals(Material.WHITE_STAINED_GLASS_PANE)) {
                        if(!e.getCurrentItem().getItemMeta().getDisplayName().equals("§8» §6Premium-Challanges")) {
                        //if(AysuServer.getInstance().getUser(e.getWhoClicked().getUniqueId()).getLanguage().equals(Language.GERMAN)) {
                        p.sendMessage("§8» §7Du hast erfolgreich die §6" + getChallange(e) + " §7ausgewählt!");
                        // } else {
                        p.sendMessage("§8» §7You choosed the §6" + getChallange(e));
                    } else {
                            p.sendMessage("§7Diese Challanges sind nur für Premium Spieler verfügbar! §6Shop: Aysu.tv/shop");
                        }
                    }
                }
            }
        }
}
