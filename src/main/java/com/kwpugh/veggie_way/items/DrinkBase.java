package com.kwpugh.veggie_way.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.Item.Properties;

public class DrinkBase extends Item
{	
	public DrinkBase(Properties properties)
	{
		super(properties);
	}
	   
	public UseAnim getUseAnimation(ItemStack stack)
	{
		return UseAnim.DRINK;
	}
	
	@Override
    public ItemStack finishUsingItem(ItemStack stack, Level worldIn, LivingEntity entityLiving)
	{
        if(entityLiving instanceof Player)
        {
        	Player player = (Player) entityLiving;
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(Items.GLASS_BOTTLE));
        }
        return super.finishUsingItem(stack, worldIn, entityLiving);
    }
}


