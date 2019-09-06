package com.kwpugh.veggie_way.items;

import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.ItemStack;

public class HandScraper extends BucketItem
{
	public HandScraper(Fluid containedFluidIn, Properties builder)
	{
		super(containedFluidIn, builder);
	}
	
    @Override
    public boolean hasContainerItem(ItemStack stack)
    {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack)
    {
        return stack.copy();
    }
}
