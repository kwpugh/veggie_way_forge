package com.kwpugh.veggie_way.lists;

import com.kwpugh.veggie_way.util.VeggieWayConfig;

import net.minecraft.item.Food;

public class FoodList 
{
	static int cactusChunkHunger = VeggieWayConfig.cactus_chunk_hunger.get();
	static int cactusChunkSaturation = VeggieWayConfig.cactus_chunk_saturation.get();

	static int melonChunkHunger = VeggieWayConfig.melon_chunk_hunger.get();
	static int melonChunkSaturation = VeggieWayConfig.melon_chunk_saturation.get();
	
	static int pumpkinChunkHunger = VeggieWayConfig.pumpkin_chunk_hunger.get();
	static int pumpkinChunkSaturation = VeggieWayConfig.pumpkin_chunk_saturation.get();
	
	static int applePieHunger = VeggieWayConfig.apple_pie_hunger.get();
	static int applePieSaturation = VeggieWayConfig.apple_pie_saturation.get();
	
	static int melonPieHunger = VeggieWayConfig.melon_pie_hunger.get();
	static int melonPieSaturation = VeggieWayConfig.melon_pie_saturation.get();
	
	static int berryPieHunger = VeggieWayConfig.berry_pie_hunger.get();
	static int berryPieSaturation = VeggieWayConfig.berry_pie_saturation.get();
	
	static int pumpkinSoupHunger = VeggieWayConfig.pumpkin_soup_hunger.get();
	static int pumpkinSoupSaturation = VeggieWayConfig.pumpkin_soup_saturation.get();

	static int melonSoupHunger = VeggieWayConfig.melon_soup_hunger.get();
	static int melonSoupSaturation = VeggieWayConfig.cactus_soup_saturation.get();
	
	static int cactusSoupHunger = VeggieWayConfig.cactus_soup_hunger.get();
	static int cactusSoupSaturation = VeggieWayConfig.cactus_soup_saturation.get();

	static int carrotSoupHunger = VeggieWayConfig.carrot_soup_hunger.get();
	static int carrotSoupSaturation = VeggieWayConfig.carrot_soup_saturation.get();
	
	static int superPetalsHunger = VeggieWayConfig.super_petals_hunger.get();
	static int superPetalsSaturation = VeggieWayConfig.super_petals_saturation.get();
	
	static int energyDrinkHunger = VeggieWayConfig.energy_drink_hunger.get();
	static int energyDrinkSaturation = VeggieWayConfig.energy_drink_saturation.get();
	
	static int shakeHunger = VeggieWayConfig.shake_hunger.get();
	static int shakeSaturation = VeggieWayConfig.shake_saturation.get();
	
	static int smoothieHunger = VeggieWayConfig.smoothie_hunger.get();
	static int smoothieSaturation = VeggieWayConfig.smoothie_saturation.get();
	
	static int energyBarHunger = VeggieWayConfig.energyBar_hunger.get();
	static int energyBarSaturation = VeggieWayConfig.energyBar_saturation.get();
	
	static int superFoodHunger = VeggieWayConfig.superFoodBar_hunger.get();
	static int superFoodSaturation = VeggieWayConfig.superFoodBar_saturation.get();
	
	public static Food cactus_chunk = (new Food.Builder()).hunger(cactusChunkHunger).saturation(cactusChunkSaturation).setAlwaysEdible().fastToEat().build();
	public static Food pumpkin_chunk = (new Food.Builder()).hunger(pumpkinChunkHunger).saturation(pumpkinChunkSaturation).setAlwaysEdible().fastToEat().build();
	public static Food melon_chunk = (new Food.Builder()).hunger(melonChunkHunger).saturation(melonChunkSaturation).setAlwaysEdible().fastToEat().build();
	
	public static Food apple_pie = (new Food.Builder()).hunger(applePieHunger).saturation(applePieSaturation).setAlwaysEdible().fastToEat().build();
	public static Food melon_pie = (new Food.Builder()).hunger(melonPieHunger).saturation(melonPieSaturation).setAlwaysEdible().fastToEat().build();
	public static Food sweet_berry_pie = (new Food.Builder()).hunger(berryPieHunger).saturation(berryPieSaturation).setAlwaysEdible().fastToEat().build();
	
	public static Food pumpkin_soup = (new Food.Builder()).hunger(pumpkinSoupHunger).saturation(pumpkinSoupSaturation).setAlwaysEdible().fastToEat().build();
	public static Food cactus_soup = (new Food.Builder()).hunger(cactusSoupHunger).saturation(cactusSoupSaturation).setAlwaysEdible().fastToEat().build();
	public static Food melon_soup = (new Food.Builder()).hunger(melonSoupHunger).saturation(melonSoupSaturation).setAlwaysEdible().fastToEat().build();
	public static Food carrot_soup = (new Food.Builder()).hunger(carrotSoupHunger).saturation(carrotSoupSaturation).setAlwaysEdible().fastToEat().build();
	
	public static Food super_petals = (new Food.Builder()).hunger(superPetalsHunger).saturation(superPetalsSaturation).setAlwaysEdible().fastToEat().build();
	
	public static Food energy_drink = (new Food.Builder()).hunger(energyDrinkHunger).saturation(energyDrinkSaturation).setAlwaysEdible().fastToEat().build();
	public static Food superfood_shake = (new Food.Builder()).hunger(shakeHunger).saturation(shakeSaturation).setAlwaysEdible().fastToEat().build();
	public static Food superfood_smoothie = (new Food.Builder()).hunger(smoothieHunger).saturation(smoothieSaturation).setAlwaysEdible().fastToEat().build();
	
	public static Food energy_bar = (new Food.Builder()).hunger(energyBarHunger).saturation(energyBarSaturation).setAlwaysEdible().fastToEat().build();
	public static Food superfood_bar = (new Food.Builder()).hunger(superFoodHunger).saturation(superFoodSaturation).setAlwaysEdible().fastToEat().build();	
}
