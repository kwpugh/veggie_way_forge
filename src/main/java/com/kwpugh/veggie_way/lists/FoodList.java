package com.kwpugh.veggie_way.lists;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodList 
{
	public static Food energyDrink = (new Food.Builder()).hunger(8).saturation(0.5F).setAlwaysEdible().effect(new EffectInstance(Effects.SPEED, 1200, 0), 1.0F).build();
	public static Food superfoodShake = (new Food.Builder()).hunger(10).saturation(0.75F).setAlwaysEdible().effect(new EffectInstance(Effects.STRENGTH, 1200, 0), 1.0F).build();
	public static Food superfoodSmoothie = (new Food.Builder()).hunger(10).saturation(0.75F).setAlwaysEdible().effect(new EffectInstance(Effects.STRENGTH, 1200, 0), 1.0F).build();
	
	public static Food energyBar = (new Food.Builder()).hunger(12).saturation(1.0F).setAlwaysEdible().effect(new EffectInstance(Effects.RESISTANCE, 1200, 2), 1.0F).build();
	public static Food superfoodBar = (new Food.Builder()).hunger(14).saturation(1.5F).setAlwaysEdible().effect(new EffectInstance(Effects.INSTANT_HEALTH, 1200, 0), 1.0F).build();
}
