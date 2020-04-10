package com.kwpugh.veggie_way.init;

import com.kwpugh.veggie_way.VeggieWay;
import com.kwpugh.veggie_way.blocks.PlantQuinoa;
import com.kwpugh.veggie_way.blocks.PlantSoybean;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit
{
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, VeggieWay.modid);
	
	public static final RegistryObject<Block> PLANT_QUINOA = BLOCKS.register("plant_quinoa", () -> new PlantQuinoa("plant_quinoa", Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f, 0.0f).lightValue(15).sound(SoundType.CROP)));
	public static final RegistryObject<Block> PLANT_SOYBEAN = BLOCKS.register("plant_soybean", () -> new PlantSoybean("plant_soybean", Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f, 0.0f).lightValue(15).sound(SoundType.CROP)));
}
