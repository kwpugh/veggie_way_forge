package com.kwpugh.veggie_way.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.world.World;

public class ItemPowerDrink extends Item
{

	public ItemPowerDrink(Properties properties)
	{
		super(properties);
	}

	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
	{
	    if (entityLiving instanceof PlayerEntity && !((PlayerEntity)entityLiving).abilities.isCreativeMode)
	    {
	    	stack.shrink(1);
	    }

	    return stack.isEmpty() ? new ItemStack(Items.GLASS_BOTTLE) : stack;    
	}
	  
	public UseAction getUseAction(ItemStack stack)
	{
		return UseAction.DRINK;
	}
}
