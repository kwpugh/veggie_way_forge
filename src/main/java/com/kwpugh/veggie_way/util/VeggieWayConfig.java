package com.kwpugh.veggie_way.util;



import net.minecraftforge.common.ForgeConfigSpec;

public class VeggieWayConfig 
{
	public static ForgeConfigSpec.IntValue apple_pie_hunger;
	public static ForgeConfigSpec.IntValue apple_pie_saturation;
	
	public static ForgeConfigSpec.IntValue melon_pie_hunger;
	public static ForgeConfigSpec.IntValue melon_pie_saturation;
	
	public static ForgeConfigSpec.IntValue berry_pie_hunger;
	public static ForgeConfigSpec.IntValue berry_pie_saturation;
	
	public static ForgeConfigSpec.IntValue pumpkin_soup_hunger;
	public static ForgeConfigSpec.IntValue pumpkin_soup_saturation;
	
	public static ForgeConfigSpec.IntValue energy_drink_hunger;
	public static ForgeConfigSpec.IntValue energy_drink_saturation;
	
	public static ForgeConfigSpec.IntValue shake_hunger;
	public static ForgeConfigSpec.IntValue shake_saturation;
	
	public static ForgeConfigSpec.IntValue smoothie_hunger;
	public static ForgeConfigSpec.IntValue smoothie_saturation;
	
	public static ForgeConfigSpec.IntValue energyBar_hunger;
	public static ForgeConfigSpec.IntValue energyBar_saturation;
	
	public static ForgeConfigSpec.IntValue superFoodBar_hunger;
	public static ForgeConfigSpec.IntValue superFoodBar_saturation;
	
	public static ForgeConfigSpec.Builder server_output;
	
	
	public static void init(ForgeConfigSpec.Builder server)
	{	
		server_output = server.comment("Normal Food Hunger and Saturation Values");
		
		apple_pie_hunger = server
				.comment("Hunger value:")
				.defineInRange("apple_pie_hunger", 7, 0, 30);
		apple_pie_saturation = server
				.comment("Saturation value:")
				.defineInRange("apple_pie_saturation", 1, 0, 10);

		melon_pie_hunger = server
				.comment("Hunger value:")
				.defineInRange("melon_pie_hunger", 7, 0, 30);
		melon_pie_saturation = server
				.comment("Saturation value:")
				.defineInRange("melon_pie_saturation", 1, 0, 10);
		
		berry_pie_hunger = server
				.comment("Hunger value:")
				.defineInRange("berry_pie_hunger", 7, 0, 30);
		berry_pie_saturation = server
				.comment("Saturation value:")
				.defineInRange("berry_pie_saturation", 1, 0, 10);		

		pumpkin_soup_hunger = server
				.comment("Hunger value:")
				.defineInRange("pumpkin_soup_hunger", 7, 0, 30);
		pumpkin_soup_saturation = server
				.comment("Saturation value:")
				.defineInRange("pumpkin_soup_saturation", 1, 0, 10);

		server_output = server.comment("Super Food Hunger and Saturation Values");
		
		energy_drink_hunger = server
				.comment("Hunger value:")
				.defineInRange("energy_drink_hunger", 9, 0, 30);
		energy_drink_saturation = server
				.comment("Saturation value:")
				.defineInRange("energy_drink_saturation", 1, 0, 10);

		shake_hunger = server
				.comment("Hunger value:")
				.defineInRange("shake_hunger", 10, 0, 30);
		shake_saturation = server
				.comment("Saturation value:")
				.defineInRange("shake_saturation", 1, 0, 10);

		smoothie_hunger = server
				.comment("Hunger value:")
				.defineInRange("smoothie_hunger", 10, 0, 30);
		smoothie_saturation = server
				.comment("Saturation value:")
				.defineInRange("smoothie_saturation", 1, 0, 10);
		
		energyBar_hunger = server
				.comment("Hunger value:")
				.defineInRange("energyBar_hunger", 13, 0, 30);
		energyBar_saturation = server
				.comment("Saturation value:")
				.defineInRange("energyBar_saturation", 3, 0, 10);		

		superFoodBar_hunger = server
				.comment("Hunger value:")
				.defineInRange("superFoodBar_hunger", 13, 0, 30);
		superFoodBar_saturation = server
				.comment("Saturation value:")
				.defineInRange("superFoodBar_saturation", 3, 0, 10);
	}
}