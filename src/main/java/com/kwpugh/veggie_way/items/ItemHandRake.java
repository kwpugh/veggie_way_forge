package com.kwpugh.veggie_way.items;

import java.util.List;

import javax.annotation.Nullable;

import com.kwpugh.veggie_way.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemHandRake extends ShovelItem
{
	public ItemHandRake(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving)
	{
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
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.DRYING_AGENT.get(), 1)));
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
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.QUINOA_SEEDS.get(), 1)));
		        }
		        else if (r > 0.1 && r <= 0.2)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.SOYBEAN_SEEDS.get(), 1)));
		        }
		        else if (r > 0.2 && r <= 0.3)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.LENTIL_SEEDS.get(), 1)));
		        }
		        else if (r > 0.3 && r <= 0.4)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemInit.CORN_SEEDS.get(), 1)));
		        }
		        else if (r > 0.4)
		        {
		        	 //Nothing right now
		        }
			} 
	    }

		return true;
	}
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.veggie_way.hand_rake.line1").applyTextStyle(TextFormatting.GREEN)));
		tooltip.add((new TranslationTextComponent("item.veggie_way.hand_rake.line2").applyTextStyle(TextFormatting.GREEN)));
	}
}

