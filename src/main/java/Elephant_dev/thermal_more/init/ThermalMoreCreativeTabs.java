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
            .icon(() -> new ItemStack(ThermalMoreItems.integral_component.get()))
            .title(Component.translatable("creative_tab.thermal_extra.augments"))
            .displayItems((feature, output) -> {
                output.accept(ThermalMoreItems.integral_component.get());
                output.accept(Items.DIAMOND);
            })
            .build()
    );
}
