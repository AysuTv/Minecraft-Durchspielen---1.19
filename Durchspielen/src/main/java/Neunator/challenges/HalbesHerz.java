package Neunator.challenges;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;

public class HalbesHerz implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player p = (Player) sender;
            p.setMaxHealth(1););
            p.removePotionEffect(PotionEffectType.SLOW);
            p.removePotionEffect(PotionEffectType.BLINDNESS);
            p.removePotionEffect(PotionEffectType.JUMP);
            p.setGameMode(GameMode.SURVIVAL);
            p.setInvulnerable(false);
        }else
            sender.sendMessage("Du Kannst den Befehl hier nicht ausführen!");
        return false;
    }
}
