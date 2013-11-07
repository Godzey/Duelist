package github.godzey.dueling;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class DuelingPlayerListener implements Listener{

	private Dueling plugin;
	
	DuelingPlayerListener(Dueling plugin)
	{
		this.setPlugin(plugin);
	}
	
	@EventHandler(priority = EventPriority.LOW)
	public void onPlayerMove(final PlayerMoveEvent e)
	{
		Player player = e.getPlayer();
		
		if(player.getFoodLevel() < 17)
		{
			player.setFoodLevel(20);
			player.setSaturation(20F);
		}
	}

	public Dueling getPlugin() {
		return plugin;
	}

	public void setPlugin(Dueling plugin) {
		this.plugin = plugin;
	}
	
}
