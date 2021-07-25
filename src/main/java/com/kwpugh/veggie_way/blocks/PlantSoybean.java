package com.kwpugh.veggie_way.blocks;

import java.util.List;

import javax.annotation.Nullable;

import com.kwpugh.veggie_way.init.ItemInit;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.BlockGetter;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class PlantSoybean extends CropBlock
{ 
    public PlantSoybean(String name, Properties builder)
    {
        super(builder);
        this.registerDefaultState(this.stateDefinition.any().setValue(this.getAgeProperty(), Integer.valueOf(0)));
    }
    
    protected boolean mayPlaceOn(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return state.getBlock() == Blocks.FARMLAND;
    }
    
    @OnlyIn(Dist.CLIENT)
    protected ItemLike getBaseSeedId() {
        return ItemInit.SOYBEAN_SEEDS.get();
    }

    public ItemStack getCloneItemStack(BlockGetter worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(this.getBaseSeedId());
    }
    
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable BlockGetter worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslatableComponent("block.veggie_way.soybean_plant").withStyle(ChatFormatting.GREEN)));
	}
}