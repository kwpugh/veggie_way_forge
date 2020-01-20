package com.kwpugh.veggie_way.items;

import com.kwpugh.veggie_way.lists.ItemList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class HandRake extends ShovelItem
{
	public HandRake(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving)
	{
		PlayerEntity player = (PlayerEntity) entityLiving;
		Block block = state.getBlock();
		
		if (!worldIn.isRemote && state.getBlockHardness(worldIn, pos) != 0.0F)
		{
			if(block == Blocks.SAND)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= 0.3)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.drying_agent, 1)));
		        }
		        else if (r > 0.3)
		        {
		        	 //just drop the normal block, no drying agent
		        }		
			}
			
			if(block == Blocks.DIRT || block == Blocks.GRASS_BLOCK)
			{
				stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= 0.1)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.quinoa_seeds, 1)));
		        }
		        else if (r > 0.1)
		        {
		        	 //just drop the normal block, no quinoa
		        }			
			} 
	    }

		return true;
	}
}

