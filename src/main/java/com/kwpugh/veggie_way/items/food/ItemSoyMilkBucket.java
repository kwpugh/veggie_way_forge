package com.kwpugh.veggie_way.items.food;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class ItemSoyMilkBucket extends Item
{
    public ItemSoyMilkBucket(Properties properties)
    {
        super(properties);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack)
    {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stackIn)
    {
        ItemStack stack = stackIn.copy();
        stack.setDamageValue(getDamage(stack) + 1);

        if(stack.getDamageValue() >= stack.getMaxDamage())
        {
            stack.shrink(1);
        }

        return stack;
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
    {
        super.appendHoverText(stack, worldIn, tooltip, flagIn);
    }
}