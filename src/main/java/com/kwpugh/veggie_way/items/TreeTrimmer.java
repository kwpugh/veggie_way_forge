package com.kwpugh.veggie_way.items;

import java.util.List;

import com.kwpugh.veggie_way.lists.ItemList;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShovelItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class TreeTrimmer extends ShovelItem
{

	public TreeTrimmer(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving)
	{
		PlayerEntity player = (PlayerEntity) entityLiving;
		Block block = state.getBlock();
		
		if (!worldIn.isRemote)
		{
			if(block == Blocks.SPRUCE_LEAVES)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         
		        
		        double r = random.nextDouble();
		        if (r <= 0.15)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.FEATHER, 1)));
		        }
		        else if (r > 0.15)
		        {
		        	 //just drop the normal block, no drops
		        }		
			}	
	    }

		if (!worldIn.isRemote)
		{
			if(block == Blocks.BIRCH_LEAVES)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         
		        
		        double r = random.nextDouble();
		        if (r <= 0.15)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.STRING, 1)));
		        }
		        else if (r > 0.15)
		        {
		        	 //just drop the normal block, no drops
		        }		
			}	
	    }
		
		if (!worldIn.isRemote)
		{
			if(block == Blocks.OAK_LEAVES)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         
		        
		        double r = random.nextDouble();
		        if (r <= 0.25)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.APPLE, 1)));
		        }
		        else if (r > 0.25)
		        {
		        	 //just drop the normal block, no drops
		        }		
			}	
	    }
		
		if (!worldIn.isRemote)
		{
			if(block == Blocks.ACACIA_LEAVES)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         
		        
		        double r = random.nextDouble();
		        if (r <= 0.05)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.RABBIT_FOOT, 1)));
		        }
		        else if (r > 0.05)
		        {
		        	 //just drop the normal block, no drops
		        }		
			}	
	    }

		if (!worldIn.isRemote)
		{
			if(block == Blocks.JUNGLE_LEAVES)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         
		        
		        double r = random.nextDouble();
		        if (r <= 0.1)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.SPIDER_EYE, 1)));
		        }
		        else if (r > 0.1)
		        {
		        	 //just drop the normal block, no drops
		        }		
			}	
	    }
		
		if (!worldIn.isRemote)
		{
			if(block == Blocks.DARK_OAK_LEAVES)
			{
		        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
		            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
		         });
		         
		        
		        double r = random.nextDouble();
		        if (r <= 0.1)
		        {
		        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemList.pearl_fragment, 1)));
		        }
		        else if (r > 0.1)
		        {
		        	 //just drop the normal block, no drops
		        }		
			}	
	    }
		
		if(block == Blocks.TALL_SEAGRASS)
		{
	        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
	            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
	         });
	         
	        double r = random.nextDouble();
	        if (r <= 0.05)
	        {
	        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PRISMARINE_CRYSTALS, 1)));
	        }
	        else if (r > 0.05)
	        {
	        	 //just drop the normal block, no drops
	        }		
		}
		
		if(block == Blocks.KELP_PLANT)
		{
	        stack.damageItem(1, entityLiving, (p_220038_0_) -> {
	            p_220038_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
	         });
	         
	        double r = random.nextDouble();
	        if (r <= 0.05)
	        {
	        	worldIn.addEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items.PRISMARINE_SHARD, 1)));
	        }
	        else if (r > 0.05)
	        {
	        	 //just drop the normal block, no drops
	        }		
		}
		
		return true;
	} 
	
	@Override
	public void addInformation(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag)
	{
		super.addInformation(stack, world, list, flag);				
		list.add(new StringTextComponent(TextFormatting.GREEN + "Used to obtain resources from leaves"));
	}
}
