package com.kwpugh.veggie_way;

import java.util.stream.Collectors;

import net.minecraftforge.event.server.ServerStartingEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.kwpugh.veggie_way.group.GroupVeggieWay;
import com.kwpugh.veggie_way.init.BlockInit;
import com.kwpugh.veggie_way.init.Compostables;
import com.kwpugh.veggie_way.init.ItemInit;
import com.kwpugh.veggie_way.config.Config;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod("veggie_way")
public class VeggieWay
{
	public static final String modid = "veggie_way";
	public static final Logger logger = LogManager.getLogger(modid);
	public static final CreativeModeTab veggie_way = new GroupVeggieWay();

    public VeggieWay()
    {
    	Config.loadConfig(Config.config, FMLPaths.CONFIGDIR.get().resolve("veggie_way.toml").toString());
    	BlockInit.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    	ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    	Compostables.setup();

        logger.info("VeggieWay common setup");
    }

    private void clientSetup(final FMLClientSetupEvent event)
    {
    	logger.info("VeggieWay client setup");
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        InterModComms.sendTo("veggie_way", "helloworld", () -> { logger.info("Hello world from VeggieWay"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
    	logger.info("VeggieWay IMC", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    	logger.info("VeggieWay server setup");
    }
}
