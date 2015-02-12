package me.skyler.skylerpgm;

import me.skyler.skylerpgm.utils.LogUtils;

import org.bukkit.plugin.java.JavaPlugin;


public class SkylerPGM extends JavaPlugin {

	private static SkylerPGM plugin;
	public String prefix = "[SkylerPGM]";
	
	public static SkylerPGM getPlugin() {
		return plugin;
	}

	public void onEnable() {
		LogUtils.infoMSG(getPrefix() + " SkylerPGM is Enabled");
	}

	public void onDisable() {
		LogUtils.infoMSG(getPrefix() + " SkylerPGM is Disabled");
	}
	
	public String getPrefix(){
		return this.prefix;
	}
}
