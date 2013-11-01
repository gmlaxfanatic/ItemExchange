package com.untamedears.ItemExchange;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;

import com.untamedears.EnderExpansion.Enderplugin;

public class EESupport {
	private static Enderplugin eeInstance = null;
	
	public static void checkEESupport() {
		Plugin plugin = Bukkit.getPluginManager().getPlugin("EnderExpansion");
		
		if(plugin instanceof Enderplugin) {
			plugin = (Enderplugin) plugin;
		}
	}
	
	public static boolean isSupported() {
		return eeInstance != null;
	}
	
	public static Inventory getInventory(Block b) {
		return Enderplugin.getchestInventory(b.getLocation());
	}
}
