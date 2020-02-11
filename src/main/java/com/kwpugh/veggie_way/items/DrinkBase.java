package com.kwpugh.veggie_way.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

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
	
	@Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
	{
        if(entityLiving instanceof PlayerEntity)
        {
        	PlayerEntity player = (PlayerEntity) entityLiving;
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(Items.GLASS_BOTTLE));
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }
}


