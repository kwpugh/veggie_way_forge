package com.kwpugh.veggie_way.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

public class BoneFragment extends Item
{

	public BoneFragment(Properties properties)
	{
		super(properties);
	}

	@Override
	public void addInformation(ItemStack stack, World world, List<ITextComponent> list, ITooltipFlag flag)
	{
		super.addInformation(stack, world, list, flag);				
		list.add(new StringTextComponent(TextFormatting.GREEN + "Crafted into vanilla bone"));
		list.add(new StringTextComponent(TextFormatting.BLUE + "A drop from gravel with a hand tiller"));
	}
}
