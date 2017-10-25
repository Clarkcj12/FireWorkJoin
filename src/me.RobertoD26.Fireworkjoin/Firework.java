package me.RobertoD26.Fireworkjoin;
import java.util.logging.Logger;

import org.bukkit.Color;
import org.bukkit.EntityEffect;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Sound;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    public final Logger logger = Logger.getLogger("Minecraft");
    public static Main plugin;
    
    public void onDisable(){
        PluginDescriptionFile pdfFile = this.getDescription();
        this.logger.info(pdfFile.getName() + " Has Been Disabled!");
    }
    
    public void onEnable(){
        PluginDescriptionFile pdfFile = this.getDescription();
        this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " Has Been Enabeled!");
        getServer().getPluginManager().registerEvents(this. this);
        System.out.println("Welcome To FireworkJoin By RobertoD26 and Clarkcj");
    }
    
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        player p = e.getPlayer();
        Firework fw - (Firework)
                p.getWorld().spawnEntity
                (p.getLocation(), EntityType.FIREWORK);
        p.playerSound(p.getLocation(), Sound.ORB_PICKUP, 1, 10);
        FireworkMeta fm = fw.getFireworkMeta();
        Type tp = Type.CREEPER;
        Color color = Color.BLUE;
        FireworkEffect effect =
                FireworkEffect.builder().
                flicker(true).
                with(tp).
                withColor(Color.GREEN).
                withFade(Color.RED).
                trail(true).
                build();
        fm.addEffect(effect);
        fm.setPower(5);
        fw.setFireworkMeta(fm);
        fw.playEffect(EntityEffect.WOLF_SMOKE);
    }
}
