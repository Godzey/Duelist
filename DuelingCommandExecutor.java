package io.github.godzey.dueling;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public abstract class DuelingCommandExecutor implements CommandExecutor {
	
private Dueling plugin;

public DuelingCommandExecutor(Dueling plugin) {
	this.plugin = plugin;
	
}

@Override
public boolean onCommand(CommandSender sender, Command command, String label, String [] args) {
	
	myExecutor = new DuelingCommandExecutor(this);
	getCommand("duel").setExecutor(myExecutor);
	
}

return false;

}
}
