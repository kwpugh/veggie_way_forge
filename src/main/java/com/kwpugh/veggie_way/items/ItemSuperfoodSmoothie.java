package com.kwpugh.veggie_way.items;

import java.util.List;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.Level;

import net.minecraft.world.item.Item.Properties;

public class ItemSuperfoodSmoothie extends Item
{	
	public ItemSuperfoodSmoothie(Properties properties)
	{
		super(properties);
	}
	
    @Override
	public void appendHoverText(ItemStack stack, Level world, List<Component> list, TooltipFlag flag)
	{
		super.appendHoverText(stack, world, list, flag);				
	} 
}