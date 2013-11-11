package io.github.godzey.dueling;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class Dueling extends JavaPlugin implements Listener {
        
        public final Logger logger = Logger.getLogger("Minecraft");
        public Dueling plugin;
        public boolean enabled = false;
        public final DuelingPlayerListener pl = new DuelingPlayerListener(this);
        
        private DuelingCommandExecutor myExecutor;
        
        @Override
        public void onEnable() {
        	
        		logger.log(Level.INFO, String.format("[%s] Successfully enabled version %s!", getDescription().getName(), getDescription().getVersion()));
                getServer().getPluginManager().registerEvents(new DuelingPlayerListener(this), this);
                
                
                
                commandhandler();   
                
        }
        
        public void commandhandler(){
        	
        	
        	
        }
        
        public void setExecutor(String command, CommandExecutor ce){
        	
        	Bukkit.getPluginCommand(command).setExecutor(ce);
        	
        }

        @Override
        public void onDisable() {
                
                logger.log(Level.INFO, String.format("[%s] Successfully disabled version %s!", getDescription().getName(), getDescription().getVersion()));

        }

       
}
