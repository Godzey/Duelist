package org.godzey.dueling;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Dueling extends JavaPlugin {
	
	public final Logger logger = Logger.getLogger("Minecraft");
	public Dueling plugin;
	public boolean enabled = false;
	public final DuelingPlayerListener pl = new DuelingPlayerListener(this);
	public commandUsed cmdUsed;
	
	public enum commandUsed {
		
	}
	
	@Override
	public void onEnable() {
		
		log.log(Level.INFO, String.format("[%s] Successfully enabled version %s!", getDescription().getName(), getDescription().getVersion()));
		getServer().getPluginManager().registerEvents(new DuelingPlayerListener(this), this);

	}

	@Override
	public void onDisable() {
		
		log.log(Level.INFO, String.format("[%s] Successfully disabled version %s!", getDescription().getName(), getDescription().getVersion()));

	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args) {
		Player s = (Player)sender;
		Player target = s.getServer().getPlayer(args[0]);
		
		
		
		if (commandlabel.equalsIgnoreCase("duel")){
			if(args.length==0){
				s.sendMessage(ChatColor.GREEN + "This player isn't reconized");
				s.sendMessage(ChatColor.BLUE + "[Duelist development command 1]");
				s.sendMessage(ChatColor.BLUE + "If there is something wrong please contact Godzey at [Godzey@1337.no].");
				
				}
			else if(args.length==1){
				s.sendMessage(ChatColor.GREEN + "This player is offline");
				s.sendMessage(ChatColor.BLUE + "[Duelist development command 2]");
				s.sendMessage(ChatColor.BLUE + "If there is something wrong please contact Godzey at [Godzey@1337.no].");
				}
			else if(args.length==2){
				s.sendMessage(ChatColor.GREEN + "You have dueled" + target);
				s.sendMessage(ChatColor.GREEN + "Waiting for" + target + "to respond");
				target.sendMessage(ChatColor.GREEN + sender.getName() + "has requested a duel.");
				target.sendMessage(ChatColor.GREEN + "Will you /duel accept this or /duel deny?");
				s.sendMessage(ChatColor.BLUE + "If there is something wrong please contact Godzey at [Godzey@1337.no].");	
				}
			else if (target = p){
				s.sendMessage(ChatColor.GREEN + "You can't duel yourself, dummy <3");
			}
			
		}
			
		return false;
	}
}
