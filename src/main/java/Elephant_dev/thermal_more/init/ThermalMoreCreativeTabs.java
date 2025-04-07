package Elephant_dev.thermal_more.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ThermalMoreCreativeTabs {
    public static final CreativeModeTab Augment_Tab = new CreativeModeTab("augment_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ThermalMoreItems.integral_component_20.get());
        }
    };
}
