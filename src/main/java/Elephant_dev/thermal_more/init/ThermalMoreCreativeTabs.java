package Elephant_dev.thermal_more.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ThermalMoreCreativeTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Elephant_dev.thermal_more.ThermalMore.MOD_ID);

    public static RegistryObject<CreativeModeTab> tab_augments = CREATIVE_TABS.register("augments", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ThermalMoreItems.integral_component_15.get()))
            .title(Component.translatable("creative_tab.thermal_more.augments"))
            .displayItems((feature, output) -> {
                output.accept(ThermalMoreItems.integral_component_15.get());
                output.accept(ThermalMoreItems.integral_component_20.get());
                output.accept(ThermalMoreItems.integral_component_25.get());
                output.accept(ThermalMoreItems.integral_component_30.get());
                output.accept(ThermalMoreItems.integral_component_35.get());
                output.accept(ThermalMoreItems.integral_component_40.get());
                output.accept(ThermalMoreItems.integral_component_45.get());
                output.accept(ThermalMoreItems.integral_component_50.get());
                output.accept(ThermalMoreItems.integral_component_100.get());
            })
            .build()
    );
}
