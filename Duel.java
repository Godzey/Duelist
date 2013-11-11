package Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Duel extends JavaPlugin {

	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandlabel, String[] args) {
            Player s = (Player)sender;
            Player target = s.getServer().getPlayer(args[0]);
            
            
            
            if (cmd.getName().equalsIgnoreCase("duel")){
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
                            target.sendMessage(ChatColor.GREEN + s.getName() + "has requested a duel.");
                            target.sendMessage(ChatColor.GREEN + "Will you /duel accept this or /duel deny?");
                            s.sendMessage(ChatColor.RED + "If there is something wrong please contact Godzey at [Godzey@users.nor].");        
                            }       
                    return true;
            
	
            }
	return false;
}
}
