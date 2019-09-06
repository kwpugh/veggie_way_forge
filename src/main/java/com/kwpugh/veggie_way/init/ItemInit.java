package com.kwpugh.veggie_way.init;

import com.kwpugh.veggie_way.VeggieWay;
import com.kwpugh.veggie_way.items.CropQuinoa;
import com.kwpugh.veggie_way.items.DrinkBase;
import com.kwpugh.veggie_way.items.HandPick;
import com.kwpugh.veggie_way.items.HandTiller;
import com.kwpugh.veggie_way.items.ItemCaffeine;
import com.kwpugh.veggie_way.items.ItemCarbs;
import com.kwpugh.veggie_way.items.ItemDryingAgent;
import com.kwpugh.veggie_way.items.ItemEnergyPowder;
import com.kwpugh.veggie_way.items.ItemFructose;
import com.kwpugh.veggie_way.items.ItemProteins;
import com.kwpugh.veggie_way.items.ItemSuperfoodPowder;
import com.kwpugh.veggie_way.items.ItemVitamins;
import com.kwpugh.veggie_way.items.ItemWheatgerm;
import com.kwpugh.veggie_way.items.SeedQuinoa;
import com.kwpugh.veggie_way.lists.BlockList;
import com.kwpugh.veggie_way.lists.FoodList;
import com.kwpugh.veggie_way.lists.ItemList;

import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ItemInit
{
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents
	{
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event)
		{
			event.getRegistry().registerAll
			(				
				ItemList.hand_tiller = new HandTiller(ItemTier.IRON, 0, 0, new Item.Properties().group(VeggieWay.veggie_way)).setRegistryName(location("hand_tiller")),	
				ItemList.hand_pick = new HandPick(ItemTier.IRON, 0, 0, new Item.Properties().group(VeggieWay.veggie_way)).setRegistryName(location("hand_pick")),	
				
				ItemList.powder_sulfur = new Item(new Item.Properties().group(VeggieWay.veggie_way)).setRegistryName(location("powder_sulfur")),
				ItemList.powder_saltpeter = new Item(new Item.Properties().group(VeggieWay.veggie_way)).setRegistryName(location("powder_saltpeter")),
												
				ItemList.quinoa_seeds = new SeedQuinoa("quinoa_seeds", BlockList.plant_quinoa, (new Item.Properties().group(VeggieWay.veggie_way))),
				ItemList.quinoa = new CropQuinoa(new Item.Properties().group(VeggieWay.veggie_way)).setRegistryName(location("quinoa")),
				
				ItemList.drying_agent = new ItemDryingAgent(new Item.Properties().group(VeggieWay.veggie_way)).setRegistryName(location("drying_agent")),
						
				ItemList.carbs = new ItemCarbs(new Item.Properties().group(VeggieWay.veggie_way)).setRegistryName(location("carbs")),
				ItemList.fructose = new ItemFructose(new Item.Properties().group(VeggieWay.veggie_way)).setRegistryName(location("fructose")),
				ItemList.proteins = new ItemProteins(new Item.Properties().group(VeggieWay.veggie_way)).setRegistryName(location("proteins")),
				ItemList.vitamins = new ItemVitamins(new Item.Properties().group(VeggieWay.veggie_way)).setRegistryName(location("vitamins")),
				ItemList.caffeine = new ItemCaffeine(new Item.Properties().group(VeggieWay.veggie_way)).setRegistryName(location("caffeine")),
				ItemList.wheatgerm = new ItemWheatgerm(new Item.Properties().group(VeggieWay.veggie_way)).setRegistryName(location("wheatgerm")),
				
				ItemList.energy_powder = new ItemEnergyPowder(new Item.Properties().group(VeggieWay.veggie_way)).setRegistryName(location("energy_powder")),
				ItemList.superfood_powder = new ItemSuperfoodPowder(new Item.Properties().group(VeggieWay.veggie_way)).setRegistryName(location("superfood_powder")),
				
				ItemList.energy_drink = new DrinkBase(new Item.Properties().food(FoodList.energyDrink).group(VeggieWay.veggie_way)).setRegistryName(location("energy_drink")),
				ItemList.superfood_shake = new DrinkBase(new Item.Properties().food(FoodList.superfoodShake).group(VeggieWay.veggie_way)).setRegistryName(location("superfood_shake")),
				ItemList.superfood_smoothie = new DrinkBase(new Item.Properties().food(FoodList.superfoodSmoothie).group(VeggieWay.veggie_way)).setRegistryName(location("superfood_smoothie")),
				
				ItemList.energy_bar = new Item(new Item.Properties().food(FoodList.energyBar).group(VeggieWay.veggie_way)).setRegistryName(location("energy_bar")),
				ItemList.superfood_bar = new Item(new Item.Properties().food(FoodList.superfoodBar).group(VeggieWay.veggie_way)).setRegistryName(location("superfood_bar"))
				
			);		
			VeggieWay.logger.info("Items registered.");
		}
		
		private static ResourceLocation location(String name)
		{
			return new ResourceLocation(VeggieWay.modid, name);
		}
	}
}
