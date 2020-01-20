package com.kwpugh.veggie_way.items;

import java.util.List;

import com.kwpugh.veggie_way.util.VeggieWayConfig;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.UseAction;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public class ItemSuperfoodSmoothie extends Item
{	
	public ItemSuperfoodSmoothie(Properties properties)
	{
		super(properties);
	}

	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
	{	
		
	    if (entityLiving instanceof PlayerEntity && !((PlayerEntity)entityLiving).abilities.isCreativeMode)
	    {
	    	if(VeggieWayConfig.enableFoodEffects.get())
	    	{
	    		entityLiving.addPotionEffect(new EffectInstance(Effects.STRENGTH, 1200, 2, false, false));
	    	}
	    	
	    	stack.shrink(1);
	    }

	    return stack.isEmpty() ? new ItemStack(Items.GLASS_BOTTLE) : stack;    
	}
	  
	public UseAction getUseAction(ItemStack stack)
	{
		return UseAction.DRINK;
	}
	
    @Override
	public void addInformation(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag)
	{
		super.addInformation(stack, world, list, flag);				
	} 
}