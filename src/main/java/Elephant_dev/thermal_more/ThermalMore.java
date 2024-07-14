package Elephant_dev.thermal_more;

import Elephant_dev.thermal_more.data.ExtraLangGen;
import Elephant_dev.thermal_more.init.ThermalMoreCreativeTabs;
import Elephant_dev.thermal_more.init.ThermalMoreItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CompletableFuture;

@Mod(Elephant_dev.thermal_more.ThermalMore.MOD_ID)
@Mod.EventBusSubscriber(modid = ThermalMore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ThermalMore {

	public static final String MOD_ID = "thermal_more";
	public ThermalMore() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ThermalMoreItems.ITEMS.register(bus);
		ThermalMoreCreativeTabs.CREATIVE_TABS.register(bus);
	}
	@SubscribeEvent
	public static void gatherData(final GatherDataEvent event) {
		DataGenerator gen = event.getGenerator();
		PackOutput packOutput = gen.getPackOutput();
		gen.addProvider(event.includeClient(), new ExtraLangGen(packOutput));
	}
}
