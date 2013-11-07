package org.godzey.dueling;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class DuelingPlayerListener implements Listener{

	@SuppressWarnings("unused")
	private Dueling plugin;
	
	DuelingPlayerListener(Dueling plugin)
	{
		this.plugin = plugin;
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
	
}
