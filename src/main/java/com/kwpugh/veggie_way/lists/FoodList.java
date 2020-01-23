package com.kwpugh.veggie_way.lists;

import net.minecraft.item.Food;

public class FoodList 
{	
	public static Food apple_pie = (new Food.Builder()).hunger(7).saturation(.5F).setAlwaysEdible().fastToEat().build();
	public static Food melon_pie = (new Food.Builder()).hunger(7).saturation(.5F).setAlwaysEdible().fastToEat().build();
	public static Food sweet_berry_pie = (new Food.Builder()).hunger(7).saturation(.5F).setAlwaysEdible().fastToEat().build();
	
	public static Food pumpkin_soup = (new Food.Builder()).hunger(7).saturation(.5F).setAlwaysEdible().fastToEat().build();
	
	public static Food energyDrink = (new Food.Builder()).hunger(9).saturation(0.5F).setAlwaysEdible().fastToEat().build();
	public static Food superfoodShake = (new Food.Builder()).hunger(10).saturation(0.9F).setAlwaysEdible().fastToEat().build();
	public static Food superfoodSmoothie = (new Food.Builder()).hunger(10).saturation(0.9F).setAlwaysEdible().fastToEat().build();
	
	public static Food energyBar = (new Food.Builder()).hunger(12).saturation(1.0F).setAlwaysEdible().fastToEat().build();
	public static Food superfoodBar = (new Food.Builder()).hunger(14).saturation(1.5F).setAlwaysEdible().fastToEat().build();	
}
