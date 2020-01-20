package com.kwpugh.veggie_way.util;

import net.minecraftforge.common.ForgeConfigSpec;

public class VeggieWayConfig 
{
	public static ForgeConfigSpec.BooleanValue enableFoodEffects;

	public static ForgeConfigSpec.Builder server_output;
		
	public static void init(ForgeConfigSpec.Builder server)
	{	
		server_output = server.comment("Special Food Effects");
		
		enableFoodEffects = server
				.comment("Should the special effects be enabled for the food?")
				.define("enable_food_effects", true);	
	}
}