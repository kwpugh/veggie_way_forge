package com.kwpugh.veggie_way.util;

import com.kwpugh.veggie_way.init.BlockInit;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;

public class BlockRenders
{
	public static void defineRenders()
	{
		RenderType cutoutMipped = RenderType.getCutoutMipped();	
		RenderTypeLookup.setRenderLayer(BlockInit.PLANT_QUINOA.get(), cutoutMipped);
		RenderTypeLookup.setRenderLayer(BlockInit.PLANT_SOYBEAN.get(), cutoutMipped);
		RenderTypeLookup.setRenderLayer(BlockInit.PLANT_LENTIL.get(), cutoutMipped);
		RenderTypeLookup.setRenderLayer(BlockInit.PLANT_CORN.get(), cutoutMipped);
	}	
}
