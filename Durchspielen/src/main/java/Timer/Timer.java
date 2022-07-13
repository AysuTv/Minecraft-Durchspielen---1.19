package Timer;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import tv.aysu.Durchspielen;

public class Timer {

    /* Commented code block
    public static int game;
    public static int gametime;
    public static void TimerRun() {
        gametime = Bukkit.getScheduler().scheduleSyncRepeatingTask((Plugin) Durchspielen.getInstance(), (Runnable) new Runnable() {
            @Override
            public void run() {
                ++gametime;
                for(Player p : Bukkit.getOnlinePlayers()) {
                    if(Durchspielen.getInstance().getIngameSpieler().contains(p.getUniqueId())) {
                        p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§6" + returnTime(gametime)));
                    }
                }
            }
        }, 0L, 20L);
    }


    public static String returnTime(Integer integer) {
        Integer minutes = 0;
        Integer stunden = 0;

        while(integer >= 60) {
            integer -= 60;
            minutes++;
        }

        while(minutes >= 60) {
            minutes -= 60;
            stunden++;
        }
        if(integer < 9) {
            return "§6" + stunden + ":" + minutes + ":0" + integer;
        } else if(minutes < 9) {
            return "§6" + stunden + ":0" + minutes + ":" + integer;
        } else if(minutes < 9 && integer < 9) {
            return "§6" + stunden + ":0" + minutes + ":0" + integer;
        }
          return "" + stunden + ":" + minutes + ":" + integer;
    }
*/
}