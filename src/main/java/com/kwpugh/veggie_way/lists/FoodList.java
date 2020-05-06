package com.kwpugh.veggie_way.lists;

import com.kwpugh.veggie_way.util.VeggieWayConfig;

import net.minecraft.item.Food;

public class FoodList 
{
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
	
	public static Food fried_egg = (new Food.Builder()).hunger(friedEggHunger).saturation((float) friedEggSaturation).setAlwaysEdible().fastToEat().build();
	public static Food chocolate_bar = (new Food.Builder()).hunger(chocolateBarHunger).saturation((float)chocolateBarSaturation).setAlwaysEdible().fastToEat().build();
	public static Food cactus_chunk = (new Food.Builder()).hunger(cactusChunkHunger).saturation((float)cactusChunkSaturation).setAlwaysEdible().fastToEat().build();
	public static Food pumpkin_chunk = (new Food.Builder()).hunger(pumpkinChunkHunger).saturation((float)pumpkinChunkSaturation).setAlwaysEdible().fastToEat().build();
	public static Food melon_chunk = (new Food.Builder()).hunger(melonChunkHunger).saturation((float) melonChunkSaturation).setAlwaysEdible().fastToEat().build();
	
	public static Food apple_pie = (new Food.Builder()).hunger(applePieHunger).saturation((float)applePieSaturation).setAlwaysEdible().fastToEat().build();
	public static Food melon_pie = (new Food.Builder()).hunger(melonPieHunger).saturation((float)melonPieSaturation).setAlwaysEdible().fastToEat().build();
	public static Food sweet_berry_pie = (new Food.Builder()).hunger(berryPieHunger).saturation((float)berryPieSaturation).setAlwaysEdible().fastToEat().build();
	
	public static Food pumpkin_soup = (new Food.Builder()).hunger(pumpkinSoupHunger).saturation((float)pumpkinSoupSaturation).setAlwaysEdible().fastToEat().build();
	public static Food cactus_soup = (new Food.Builder()).hunger(cactusSoupHunger).saturation((float)cactusSoupSaturation).setAlwaysEdible().fastToEat().build();
	public static Food melon_soup = (new Food.Builder()).hunger(melonSoupHunger).saturation((float)melonSoupSaturation).setAlwaysEdible().fastToEat().build();
	public static Food carrot_soup = (new Food.Builder()).hunger(carrotSoupHunger).saturation((float)carrotSoupSaturation).setAlwaysEdible().fastToEat().build();
	
	public static Food super_petals = (new Food.Builder()).hunger(superPetalsHunger).saturation((float)superPetalsSaturation).setAlwaysEdible().fastToEat().build();
	
	public static Food energy_drink = (new Food.Builder()).hunger(energyDrinkHunger).saturation((float)energyDrinkSaturation).setAlwaysEdible().fastToEat().build();
	public static Food superfood_shake = (new Food.Builder()).hunger(shakeHunger).saturation((float)shakeSaturation).setAlwaysEdible().fastToEat().build();
	public static Food superfood_smoothie = (new Food.Builder()).hunger(smoothieHunger).saturation((float)smoothieSaturation).setAlwaysEdible().fastToEat().build();
	
	public static Food energy_bar = (new Food.Builder()).hunger(energyBarHunger).saturation((float)energyBarSaturation).setAlwaysEdible().fastToEat().build();
	public static Food superfood_bar = (new Food.Builder()).hunger(superFoodHunger).saturation((float)superFoodSaturation).setAlwaysEdible().fastToEat().build();	
}
