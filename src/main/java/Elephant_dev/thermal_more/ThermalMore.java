package Elephant_dev.thermal_more;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CompletableFuture;

@Mod(Elephant_dev.thermal_more.ThermalMore.MOD_ID)
@Mod.EventBusSubscriber(modid = ThermalMore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ThermalMore {

	public static final String MOD_ID = "thermal_more";
	public static final Logger LOGGER = LogManager.getLogger();

	@SubscribeEvent
	public static void gatherData(final GatherDataEvent event) {
		DataGenerator gen = event.getGenerator();
		ExistingFileHelper fileHelper = event.getExistingFileHelper();
		PackOutput packOutput = gen.getPackOutput();
		CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
	}

}
