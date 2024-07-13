package Elephant_dev.thermal_more.data;

import Elephant_dev.thermal_more.ThermalMore;
import Elephant_dev.thermal_more.init.ThermalMoreItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ExtraLangGen extends LanguageProvider {

    public ExtraLangGen(PackOutput gen) {
        super(gen, ThermalMore.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
       // augments
        addItem(ThermalMoreItems.integral_component, "Draconic Integral Component");
        add("thermal_extra.augment.upgrade", "Improves base attributes. Other augments may be more effective as a result.");
    }
}
