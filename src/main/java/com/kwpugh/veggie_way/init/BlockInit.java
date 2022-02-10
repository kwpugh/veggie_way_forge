package com.kwpugh.veggie_way.init;

import com.kwpugh.veggie_way.VeggieWay;
import com.kwpugh.veggie_way.blocks.PlantCorn;
import com.kwpugh.veggie_way.blocks.PlantLentil;
import com.kwpugh.veggie_way.blocks.PlantQuinoa;
import com.kwpugh.veggie_way.blocks.PlantSoybean;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, VeggieWay.modid);
	
	public static final RegistryObject<Block> PLANT_QUINOA = BLOCKS.register("plant_quinoa", () -> new PlantQuinoa("plant_quinoa", Block.Properties.of(Material.PLANT).noCollission().randomTicks().strength(0.0f, 0.0f).sound(SoundType.CROP)));
	public static final RegistryObject<Block> PLANT_SOYBEAN = BLOCKS.register("plant_soybean", () -> new PlantSoybean("plant_soybean", Block.Properties.of(Material.PLANT).noCollission().randomTicks().strength(0.0f, 0.0f).sound(SoundType.CROP)));
	public static final RegistryObject<Block> PLANT_LENTIL = BLOCKS.register("plant_lentil", () -> new PlantLentil("plant_lentil", Block.Properties.of(Material.PLANT).noCollission().randomTicks().strength(0.0f, 0.0f).sound(SoundType.CROP)));
	public static final RegistryObject<Block> PLANT_CORN = BLOCKS.register("plant_corn", () -> new PlantCorn("plant_corn", Block.Properties.of(Material.PLANT).noCollission().randomTicks().strength(0.0f, 0.0f).sound(SoundType.CROP)));
	public static final RegistryObject<Block> PLANT_COTTON = BLOCKS.register("plant_cotton", () -> new PlantCorn("plant_cotton", Block.Properties.of(Material.PLANT).noCollission().randomTicks().strength(0.0f, 0.0f).sound(SoundType.CROP)));
}
