package com.kwpugh.veggie_way.items;

import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

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
    
	@Override
	public void addInformation(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag)
	{
		super.addInformation(stack, world, list, flag);				
		list.add(new StringTextComponent(TextFormatting.BLUE + "Plant on Farmland to grow Quinoa Plant"));
		list.add(new StringTextComponent(TextFormatting.GREEN + "Right-click to harvest when plant is mature"));
	} 
}
