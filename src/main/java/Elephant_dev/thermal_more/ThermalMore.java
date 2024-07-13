package Elephant_dev.thermal_more;

import Elephant_dev.thermal_more.init.ThermalMoreCreativeTabs;
import Elephant_dev.thermal_more.init.ThermalMoreItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Elephant_dev.thermal_more.ThermalMore.MOD_ID)
@Mod.EventBusSubscriber(modid = ThermalMore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ThermalMore {

	public static final String MOD_ID = "thermal_more";
	public ThermalMore() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		ThermalMoreItems.ITEMS.register(bus);
		ThermalMoreCreativeTabs.CREATIVE_TABS.register(bus);
	}

}
