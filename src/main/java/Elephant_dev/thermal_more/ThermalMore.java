package Elephant_dev.thermal_more;

import cofh.core.client.event.CoreClientEvents;
import Elephant_dev.thermal_more.data.*;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CompletableFuture;

@Mod(Elephant_dev.thermal_more.ThermalMore.ThermalMoreItems)
@Mod.EventBusSubscriber(modid = ThermalMore.ThermalMoreItems, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ThermalMore {

	public static final String ThermalMoreItems = "thermal_more";
	public static final Logger LOGGER = LogManager.getLogger();

	@SubscribeEvent
	public static void gatherData(final GatherDataEvent event) {
		DataGenerator gen = event.getGenerator();
		ExistingFileHelper fileHelper = event.getExistingFileHelper();
		PackOutput packOutput = gen.getPackOutput();
		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
	}

}
