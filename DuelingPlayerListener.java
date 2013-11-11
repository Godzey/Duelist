package io.github.godzey.dueling;

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

	public Dueling getPlugin() {
		return plugin;
	}

	public void setPlugin(Dueling plugin) {
		this.plugin = plugin;
	}
	
}
