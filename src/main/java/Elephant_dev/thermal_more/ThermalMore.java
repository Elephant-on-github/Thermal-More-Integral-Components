package Elephant_dev.thermal_more;

import Elephant_dev.thermal_more.init.ThermalMoreItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Elephant_dev.thermal_more.ThermalMore.MOD_ID)
@Mod.EventBusSubscriber(modid = ThermalMore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ThermalMore {

	public static final String MOD_ID = "thermal_more";

	public ThermalMore() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		ThermalMoreItems.ITEMS.register(modEventBus);

		modEventBus.addListener(this::commonSetup);

		MinecraftForge.EVENT_BUS.register(this);
	}

	private void commonSetup(final FMLCommonSetupEvent event) {

	}

}
