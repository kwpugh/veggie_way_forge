package com.kwpugh.veggie_way.items;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SeedQuinoa extends BlockNamedItem
{
	public SeedQuinoa(String name, Block crop, Properties builder)
	{
        super(crop, builder);

        this.setRegistryName("veggie_way:quinoa_seeds");       
    }
	
    public List<ModelResourceLocation> getVariants() {
        return Lists.newArrayList(new ModelResourceLocation("veggie_way:quinoa_seeds", "inventory"));
    }
 
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.veggie_way.quinoa_seeds.line1").applyTextStyle(TextFormatting.GREEN)));
	}
}
