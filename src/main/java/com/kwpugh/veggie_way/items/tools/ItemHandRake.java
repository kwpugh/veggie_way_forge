package com.kwpugh.veggie_way.items.tools;

import com.kwpugh.veggie_way.init.ItemInit;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class ItemHandRake extends ShovelItem
{
	Random random = new Random();

	public ItemHandRake(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	public boolean mineBlock(ItemStack stack, Level worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving)
	{
		Block block = state.getBlock();
		
		if (!worldIn.isClientSide && state.getDestroySpeed(worldIn, pos) != 0.0F)
		{
			if(block == Blocks.SAND)
			{
		        stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= 0.3)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.DRYING_AGENT.get(), 1)));
		        }
		        else if (r > 0.3)
		        {
		        	 //just drop the normal block, no drying agent
		        }		
			}
			
			if(block == Blocks.DIRT || block == Blocks.GRASS_BLOCK)
			{
				stack.hurtAndBreak(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
		         });

		        double r = random.nextDouble();
		        if (r <= 0.1)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.QUINOA_SEEDS.get(), 1)));
		        }
		        else if (r > 0.1 && r <= 0.2)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.SOYBEAN_SEEDS.get(), 1)));
		        }
		        else if (r > 0.2 && r <= 0.3)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.LENTIL_SEEDS.get(), 1)));
		        }
		        else if (r > 0.3 && r <= 0.4)
		        {
		        	worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.CORN_SEEDS.get(), 1)));
		        }
				else if (r > 0.4 && r <= 0.5)
				{
					worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.COTTON_SEEDS.get(), 1)));
				}
				else if (r > 0.5 && r <= 0.55)
				{
					worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.WHEAT_SEEDS, 1)));
				}
				else if (r > 0.55 && r <= 0.6)
				{
					worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.BEETROOT_SEEDS, 1)));
				}
				else if (r > 0.6 && r <= 0.65)
				{
					worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.CARROT, 1)));
				}
				else if (r > 0.65 && r <= 0.7)
				{
					worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.MELON_SEEDS, 1)));
				}
				else if (r > 0.7 && r <= 0.75)
				{
					worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PUMPKIN_SEEDS, 1)));
				}
		        else if (r > 0.75)
		        {
		        	 //Nothing right now
		        }
			} 
	    }

		return true;
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((Component.translatable("item.veggie_way.hand_rake.line1").withStyle(ChatFormatting.GREEN)));
		tooltip.add((Component.translatable("item.veggie_way.hand_rake.line2").withStyle(ChatFormatting.GREEN)));
	}
}

