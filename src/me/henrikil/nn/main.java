package me.henrikil.nn;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.plugin.java.JavaPlugin;
public class main extends JavaPlugin implements Listener{
public void onEnable() {
  getLogger().info(ChatColor.AQUA + "NameNotify enabled. by henrikil:)");
  Bukkit.getServer().getPluginManager().registerEvents(this, this);
}

        @EventHandler
        public void onChat(AsyncPlayerChatEvent e){
                for(Player nn:Bukkit.getServer().getOnlinePlayers()){
                        if(nn.equals(e.getPlayer()))continue;
                        if(e.getMessage().contains(nn.getName())){
                                nn.playSound(nn.getLocation(), Sound.NOTE_PLING, 10, 1);
  }
}
}}