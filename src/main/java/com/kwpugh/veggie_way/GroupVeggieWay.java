package com.kwpugh.veggie_way;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class GroupVeggieWay extends ItemGroup
{
	public GroupVeggieWay() 
	{
		super("veggie_way");
	}

	@Override
	public ItemStack createIcon() 
	{
		return new ItemStack(Items.CARROT);
	}	
}
