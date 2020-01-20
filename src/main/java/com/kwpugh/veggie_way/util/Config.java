package com.kwpugh.veggie_way.util;

import java.io.File;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import com.kwpugh.veggie_way.VeggieWay;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber
public class Config {
	private static final ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec config;
	
	static
	{
		VeggieWayConfig.init(builder);
		
		config = builder.build();
	}
	
	public static void loadConfig(ForgeConfigSpec config, String path)
	{
		VeggieWay.logger.info("Loading VeggieWay config: " + path);
		final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
		VeggieWay.logger.info("Built VeggieWay config:" + path);
		
		file.load();
		
		VeggieWay.logger.info("Loaded VeggieWay config: " + path);
		config.setConfig(file);
		
	}
}