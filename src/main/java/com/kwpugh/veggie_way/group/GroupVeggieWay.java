package com.kwpugh.veggie_way.group;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class GroupVeggieWay extends CreativeModeTab
{
	public GroupVeggieWay() 
	{
		super("veggie_way");
	}

	@Override
	public ItemStack makeIcon() 
	{
		return new ItemStack(Items.CARROT);
	}	
}
