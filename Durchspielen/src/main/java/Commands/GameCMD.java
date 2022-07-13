package Commands;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import tv.aysu.Durchspielen;

public class GameCMD implements CommandExecutor, Listener {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        final Player p = (Player) sender;
        if(cmd.getName().equals("Game")) {
            if(args.length == 1) {
                if(args[0].equalsIgnoreCase("start")) {
                    p.sendMessage("§a» §7Du hast das Game gestartet!");
                    Durchspielen.getInstance().getIngameSpieler().add(p.getUniqueId());

                } else if(args[0].equalsIgnoreCase("quit")) {
                    p.sendMessage("§c» §7Du hast das Game verlassen!");
                }

            } else if(args.length == 2) {
                Player target = Bukkit.getPlayer(args[1]);
                if(args[0].equalsIgnoreCase("invite")) {
                    if(target != null) {
                        if(args[1].equalsIgnoreCase(target.getName())) {
                            if(!args[1].equalsIgnoreCase(p.getName())) {
                                p.sendMessage("§a» §7Du hast " + target.getDisplayName() + " §7in dein Team eingeladen!");
                                target.sendMessage("§a» §7Du wurdest von " + p.getDisplayName() + " §7in sein Team eingeladen!");
                                Durchspielen.getInstance().Team.put(p.getPlayer(), p.getName());

                                TextComponent Davor = new TextComponent("§8[");
                                TextComponent Dannach = new TextComponent("§8]");

                                TextComponent Annehmen = new TextComponent("§aAnnehmen");
                                Annehmen.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§aKlicke um die Anfrage anzunehmen").create()));
                                Annehmen.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/Game accept " + p.getName()));

                                TextComponent Davor2 = new TextComponent("§8[§a");
                                TextComponent Ablehnen = new TextComponent("§cAblehnen");
                                Ablehnen.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§aKlicke um die Anfrage abzulehnen").create()));
                                Ablehnen.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/Game deny " + p.getName()));

                                p.spigot().sendMessage(Davor, Annehmen, Dannach, Davor2, Ablehnen, Dannach);

                            } else {
                                p.sendMessage("§c» §cDu kannst dich nicht selbst einladen!");
                            }

                        } else {
                            p.sendMessage("§c» §cDieser Spieler ist nicht online");
                        }

                    } else {
                        p.sendMessage("§c» §cDieser Spieler ist nicht online");
                     }
                    } else if(args[0].equalsIgnoreCase("Annehmen")) {
                        if(!Durchspielen.getInstance().Team.containsKey(target)) {
                             Durchspielen.getInstance().Team.put(target, p.getName());
                            p.sendMessage("§c» §7Du hast die Einladung von §3" + p.getDisplayName() + "angenommen!");
                    } else {
                            p.sendMessage("§cDu bist bereits in diesem Team!");
                        }
                }

                } else {
                    p.sendMessage("§3§m-----------------------");
                    p.sendMessage("§7§a▶ §7/Game start");
                    p.sendMessage("§7§a▶ §7/Game quit");
                    p.sendMessage("§7§a▶ §7/Game invite <Spieler>");
                    p.sendMessage("§7§a▶ §7/Game <Spieler> accept|deny");
                    p.sendMessage("§3§m-----------------------");
            }
        }
        return true;
    }
}
