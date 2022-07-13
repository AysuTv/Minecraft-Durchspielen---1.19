package tv.aysu;

import Commands.GameCMD;
import Inventorys.ChallangeInventory;
import ItemManager.LobbyItems;
import Listener.ChallangeListener;
import Listener.InviteListener;
import Listener.JoinL;
import Listener.QuitL;
import Timer.Timer;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.*;

public final class Durchspielen extends JavaPlugin {
    private static Durchspielen instance;

    public List<UUID> LobbySpieler = new ArrayList<>();
    public List<UUID> IngameSpieler = new ArrayList<>();

    public Map<Player, String> Team = new HashMap();

    @Override
    public void onEnable() {
        instance = this;
        initListener();
        initCMDS();
        ChallangeInventory.generateChallangeInventory();
        //WorldCreator.name("Lobby");
        Timer.TimerRun();
    }

    @Override
    public void onDisable() {
    }

    public void initListener() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new JoinL(), this);
        pm.registerEvents(new QuitL(), this);


        pm.registerEvents(new ChallangeListener(), this);
        pm.registerEvents(new ChallangeInventory(), this);

        pm.registerEvents(new InviteListener(), this);
        pm.registerEvents(new LobbyItems(), this);


    }

    public void initCMDS() {
        Durchspielen.getInstance().getCommand("Game").setExecutor((CommandExecutor)new GameCMD());
    }

    public static Durchspielen getInstance() {
        return instance;
    }

    public List<UUID> getIngameSpieler() {
        return IngameSpieler;
    }
}
