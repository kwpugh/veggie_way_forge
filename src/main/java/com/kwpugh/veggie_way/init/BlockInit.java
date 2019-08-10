package com.kwpugh.veggie_way.init;

import com.kwpugh.veggie_way.VeggieWay;
import com.kwpugh.veggie_way.blocks.PlantQuinoa;
import com.kwpugh.veggie_way.lists.BlockList;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class BlockInit
{
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents
	{
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event)
		{
			event.getRegistry().registerAll
			(
				BlockList.plant_quinoa = new PlantQuinoa("plant_quinoa", Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f, 0.0f).lightValue(15).sound(SoundType.CROP)).setRegistryName(location("plant_quinoa"))
			);
			
			VeggieWay.logger.info("Blocks registered.");
		}
	}
	
	private static ResourceLocation location(String name)
	{
		return new ResourceLocation(VeggieWay.modid, name);
	}	
}
