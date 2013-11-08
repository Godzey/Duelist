package io.github.godzey.dueling;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Dueling extends JavaPlugin implements Listener {
        
        public final Logger logger = Logger.getLogger("Minecraft");
        public Dueling plugin;
        public boolean enabled = false;
        public final DuelingPlayerListener pl = new DuelingPlayerListener(this);
        public commandUsed cmdUsed;
        
        public enum commandUsed {
                
        }
        
        @Override
        public void onEnable() {
                
                logger.log(Level.INFO, String.format("[%s] Successfully enabled version %s!", getDescription().getName(), getDescription().getVersion()));
                getServer().getPluginManager().registerEvents(new DuelingPlayerListener(this), this);

                this.getCommand("duel").setExecutor(this);
                this.getCommand("duel accept").setExecutor(this);
                this.getCommand("duel deny").setExecutor(this);
        }

        @Override
        public void onDisable() {
                
                logger.log(Level.INFO, String.format("[%s] Successfully disabled version %s!", getDescription().getName(), getDescription().getVersion()));

        }

        @Override
        public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args) {
                Player s = (Player)sender;
                Player target = s.getServer().getPlayer(args[0]);
                
                
                
                if (commandlabel.equalsIgnoreCase("duel")){
                        if(args.length==0){
                                s.sendMessage(ChatColor.GREEN + "This player isn't reconized");
                                s.sendMessage(ChatColor.RED + "[Duelist development line" + "]");	//TO-DO print out line number for easy fixes.
                                s.sendMessage(ChatColor.RED + "If there is something wrong please contact Godzey at [Godzey@1337.no].");
                                
                                }
                        else if(args.length==1){
                                s.sendMessage(ChatColor.GREEN + "This player is offline");
                                s.sendMessage(ChatColor.RED + "[Duelist development command 2]");
                                s.sendMessage(ChatColor.RED + "If there is something wrong please contact Godzey at [Godzey@1337.no].");
                                }
                        else if(args.length==2){
                                s.sendMessage(ChatColor.GREEN + "You have dueled" + target);
                                s.sendMessage(ChatColor.GREEN + "Waiting for" + target + "to respond");
                                target.sendMessage(ChatColor.GREEN + sender.getName() + "has requested a duel.");
                                target.sendMessage(ChatColor.GREEN + "Will you /duel accept this or /duel deny?");
                                s.sendMessage(ChatColor.RED + "If there is something wrong please contact Godzey at [Godzey@1337.no].");        
                                }       
                        return true;
                }
                
                if (commandlabel.equalsIgnoreCase("duel accept")){
                	if(args.length==0){
                		s.sendMessage(ChatColor.GREEN + "Nobody has challenged you for a duel");
                		s.sendMessage(ChatColor.RED + "[Duelist development command 3]");
                		s.sendMessage(ChatColor.RED + "If there is something wrong please contact Godzey at [Godzey@1337.no].");
                		}
                	else if(args.length==1){
                		s.sendMessage(ChatColor.GREEN + "Nobody has challenged you for a duel");
                		s.sendMessage(ChatColor.RED + "[Duelist development command 4]");
                		s.sendMessage(ChatColor.RED + "If there is something wrong please contact Godzey at [Godzey@1337.no].");
                	}
                	else if(args.length==2){
                		s.sendMessage(ChatColor.GREEN + "You have accepted a duel");
                		s.sendMessage(ChatColor.GREEN + "Get ready to fight");
                		s.sendMessage(ChatColor.RED + "[Duelist development command 5]");
                		s.sendMessage(ChatColor.RED + "If there is something wrong please contact Godzey at [Godzey@1337.no].");
                	}
                	return true;
                }
                
                if (commandlabel.equalsIgnoreCase("duel deny")){
                	if(args.length==0){
                		s.sendMessage(ChatColor.GREEN + "Nobody has challenged you for a duel");
                		s.sendMessage(ChatColor.RED + "[Duelist development command 6]");
                		s.sendMessage(ChatColor.RED + "If there is something wrong please contact Godzey at [Godzey@1337.no].");
                		}
                	else if(args.length==1){
                		s.sendMessage(ChatColor.GREEN + "Nobody has challenged you for a duel");
                		s.sendMessage(ChatColor.RED + "[Duelist development command 7]");
                		s.sendMessage(ChatColor.RED + "If there is something wrong please contact Godzey at [Godzey@1337.no].");
                	}
                	else if(args.length==2){
                		s.sendMessage(ChatColor.GREEN + "You have denied a duel");
                		s.sendMessage(ChatColor.GREEN + "Contact a moderator if you are getting spammed");
                		s.sendMessage(ChatColor.RED + "[Duelist development command 8]");
                		s.sendMessage(ChatColor.RED + "If there is something wrong please contact Godzey at [Godzey@1337.no].");
                	}
                	return true;
                }
                
                        
                return false;
        }
}
