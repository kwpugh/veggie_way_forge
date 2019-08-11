package com.kwpugh.veggie_way.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;

public class DrinkBase extends Item
{	
	public DrinkBase(Properties properties)
	{
		super(properties);
	}
  
	public UseAction getUseAction(ItemStack stack)
	{
		return UseAction.DRINK;
	}
}