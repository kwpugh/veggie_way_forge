package com.kwpugh.veggie_way.lists;

import com.kwpugh.veggie_way.config.VeggieWayConfig;

import net.minecraft.world.food.FoodProperties;

public class FoodList 
{
	static int cornHunger = VeggieWayConfig.crop_hunger.get();
	static double cornSaturation = VeggieWayConfig.crop_saturation.get();

	static int cookedCarrotHunger = VeggieWayConfig.cooked_carrot_hunger.get();
	static double cookedCarrotSaturation = VeggieWayConfig.cooked_carrot_saturation.get();
	
	static int cookedBeetrootHunger = VeggieWayConfig.cooked_beetroot_hunger.get();
	static double cookedBeetrootSaturation = VeggieWayConfig.cooked_beetroot_saturation.get();
	
	static int friedEggHunger = VeggieWayConfig.fried_egg_hunger.get();
	static double friedEggSaturation = VeggieWayConfig.fried_egg_saturation.get();
	
	static int chocolateBarHunger = VeggieWayConfig.chocolate_bar_hunger.get();
	static double chocolateBarSaturation = VeggieWayConfig.chocolate_bar_saturation.get();
	
	static int cactusChunkHunger = VeggieWayConfig.cactus_chunk_hunger.get();
	static double cactusChunkSaturation = VeggieWayConfig.cactus_chunk_saturation.get();

	static int melonChunkHunger = VeggieWayConfig.melon_chunk_hunger.get();
	static double melonChunkSaturation = VeggieWayConfig.melon_chunk_saturation.get();
	
	static int pumpkinChunkHunger = VeggieWayConfig.pumpkin_chunk_hunger.get();
	static double pumpkinChunkSaturation = VeggieWayConfig.pumpkin_chunk_saturation.get();
	
	static int applePieHunger = VeggieWayConfig.apple_pie_hunger.get();
	static double applePieSaturation = VeggieWayConfig.apple_pie_saturation.get();
	
	static int melonPieHunger = VeggieWayConfig.melon_pie_hunger.get();
	static double melonPieSaturation = VeggieWayConfig.melon_pie_saturation.get();
	
	static int berryPieHunger = VeggieWayConfig.berry_pie_hunger.get();
	static double berryPieSaturation = VeggieWayConfig.berry_pie_saturation.get();
	
	static int pumpkinSoupHunger = VeggieWayConfig.pumpkin_soup_hunger.get();
	static double pumpkinSoupSaturation = VeggieWayConfig.pumpkin_soup_saturation.get();

	static int melonSoupHunger = VeggieWayConfig.melon_soup_hunger.get();
	static double melonSoupSaturation = VeggieWayConfig.cactus_soup_saturation.get();
	
	static int cactusSoupHunger = VeggieWayConfig.cactus_soup_hunger.get();
	static double cactusSoupSaturation = VeggieWayConfig.cactus_soup_saturation.get();

	static int carrotSoupHunger = VeggieWayConfig.carrot_soup_hunger.get();
	static double carrotSoupSaturation = VeggieWayConfig.carrot_soup_saturation.get();
	
	static int superPetalsHunger = VeggieWayConfig.super_petals_hunger.get();
	static double superPetalsSaturation = VeggieWayConfig.super_petals_saturation.get();
	
	static int energyDrinkHunger = VeggieWayConfig.energy_drink_hunger.get();
	static double energyDrinkSaturation = VeggieWayConfig.energy_drink_saturation.get();
	
	static int shakeHunger = VeggieWayConfig.shake_hunger.get();
	static double shakeSaturation = VeggieWayConfig.shake_saturation.get();
	
	static int smoothieHunger = VeggieWayConfig.smoothie_hunger.get();
	static double smoothieSaturation = VeggieWayConfig.smoothie_saturation.get();
	
	static int energyBarHunger = VeggieWayConfig.energyBar_hunger.get();
	static double energyBarSaturation = VeggieWayConfig.energyBar_saturation.get();
	
	static int superFoodHunger = VeggieWayConfig.superFoodBar_hunger.get();
	static double superFoodSaturation = VeggieWayConfig.superFoodBar_saturation.get();
	
	public static FoodProperties fried_egg = (new FoodProperties.Builder()).nutrition(friedEggHunger).saturationMod((float) friedEggSaturation).alwaysEat().fast().build();
	public static FoodProperties chocolate_bar = (new FoodProperties.Builder()).nutrition(chocolateBarHunger).saturationMod((float)chocolateBarSaturation).alwaysEat().fast().build();
	public static FoodProperties cactus_chunk = (new FoodProperties.Builder()).nutrition(cactusChunkHunger).saturationMod((float)cactusChunkSaturation).alwaysEat().fast().build();
	public static FoodProperties pumpkin_chunk = (new FoodProperties.Builder()).nutrition(pumpkinChunkHunger).saturationMod((float)pumpkinChunkSaturation).alwaysEat().fast().build();
	public static FoodProperties melon_chunk = (new FoodProperties.Builder()).nutrition(melonChunkHunger).saturationMod((float) melonChunkSaturation).alwaysEat().fast().build();

	public static FoodProperties cooked_carrot = (new FoodProperties.Builder()).nutrition(cookedCarrotHunger).saturationMod((float) cookedCarrotSaturation).alwaysEat().fast().build();
	public static FoodProperties cooked_beetroot= (new FoodProperties.Builder()).nutrition(cookedBeetrootHunger).saturationMod((float) cookedBeetrootSaturation).alwaysEat().fast().build();
	
	public static FoodProperties soybean = (new FoodProperties.Builder()).nutrition(cornHunger).saturationMod((float) cornSaturation).alwaysEat().fast().build();
	public static FoodProperties quinoa = (new FoodProperties.Builder()).nutrition(cornHunger).saturationMod((float) cornSaturation).alwaysEat().fast().build();
	public static FoodProperties lentil = (new FoodProperties.Builder()).nutrition(cornHunger).saturationMod((float) cornSaturation).alwaysEat().fast().build();
	public static FoodProperties corn = (new FoodProperties.Builder()).nutrition(cornHunger).saturationMod((float) cornSaturation).alwaysEat().fast().build();
	
	public static FoodProperties apple_pie = (new FoodProperties.Builder()).nutrition(applePieHunger).saturationMod((float)applePieSaturation).alwaysEat().fast().build();
	public static FoodProperties melon_pie = (new FoodProperties.Builder()).nutrition(melonPieHunger).saturationMod((float)melonPieSaturation).alwaysEat().fast().build();
	public static FoodProperties sweet_berry_pie = (new FoodProperties.Builder()).nutrition(berryPieHunger).saturationMod((float)berryPieSaturation).alwaysEat().fast().build();
	
	public static FoodProperties pumpkin_soup = (new FoodProperties.Builder()).nutrition(pumpkinSoupHunger).saturationMod((float)pumpkinSoupSaturation).alwaysEat().fast().build();
	public static FoodProperties cactus_soup = (new FoodProperties.Builder()).nutrition(cactusSoupHunger).saturationMod((float)cactusSoupSaturation).alwaysEat().fast().build();
	public static FoodProperties melon_soup = (new FoodProperties.Builder()).nutrition(melonSoupHunger).saturationMod((float)melonSoupSaturation).alwaysEat().fast().build();
	public static FoodProperties carrot_soup = (new FoodProperties.Builder()).nutrition(carrotSoupHunger).saturationMod((float)carrotSoupSaturation).alwaysEat().fast().build();
	
	public static FoodProperties super_petals = (new FoodProperties.Builder()).nutrition(superPetalsHunger).saturationMod((float)superPetalsSaturation).alwaysEat().fast().build();
	
	public static FoodProperties energy_drink = (new FoodProperties.Builder()).nutrition(energyDrinkHunger).saturationMod((float)energyDrinkSaturation).alwaysEat().fast().build();
	public static FoodProperties superfood_shake = (new FoodProperties.Builder()).nutrition(shakeHunger).saturationMod((float)shakeSaturation).alwaysEat().fast().build();
	public static FoodProperties superfood_smoothie = (new FoodProperties.Builder()).nutrition(smoothieHunger).saturationMod((float)smoothieSaturation).alwaysEat().fast().build();
	
	public static FoodProperties energy_bar = (new FoodProperties.Builder()).nutrition(energyBarHunger).saturationMod((float)energyBarSaturation).alwaysEat().fast().build();
	public static FoodProperties superfood_bar = (new FoodProperties.Builder()).nutrition(superFoodHunger).saturationMod((float)superFoodSaturation).alwaysEat().fast().build();	
}
