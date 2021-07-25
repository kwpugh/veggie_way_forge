package com.kwpugh.veggie_way.init;

import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.ItemLike;

public class Compostables
{
    public static void setup()
    {
    	registerCompostable(0.3F, ItemInit.LENTIL_SEEDS.get());
    	registerCompostable(0.3F, ItemInit.QUINOA_SEEDS.get());
    	registerCompostable(0.3F, ItemInit.SOYBEAN_SEEDS.get());
    	registerCompostable(0.3F, ItemInit.CORN_SEEDS.get());
    	
    	registerCompostable(0.65F, ItemInit.LENTIL.get());
    	registerCompostable(0.65F, ItemInit.QUINOA.get());
    	registerCompostable(0.65F, ItemInit.CORN.get());

    }

    public static void registerCompostable(float chance, ItemLike itemIn)
    {
        ComposterBlock.COMPOSTABLES.put(itemIn.asItem(), chance);
    }
}
