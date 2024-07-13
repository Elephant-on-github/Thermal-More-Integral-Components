package Elephant_dev.thermal_more.init;

import Elephant_dev.thermal_more.item.UpgradeAugmentItem;
import cofh.core.common.item.CountedItem;
import cofh.core.common.item.ItemCoFH;
import cofh.core.util.helpers.AugmentDataHelper;
import cofh.lib.util.DeferredRegisterCoFH;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;
import java.util.function.Supplier;

import static cofh.lib.util.constants.NBTTags.TAG_AUGMENT_BASE_MOD;
import static cofh.lib.util.constants.NBTTags.TAG_AUGMENT_TYPE_UPGRADE;
import static cofh.thermal.lib.util.ThermalAugmentRules.flagUniqueAugment;

@Mod.EventBusSubscriber(modid = Elephant_dev.thermal_more.ThermalMore.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class ThermalMoreItems {

    public static DeferredRegisterCoFH<Item> ITEMS = DeferredRegisterCoFH.create(ForgeRegistries.ITEMS, Elephant_dev.thermal_more.ThermalMore.MOD_ID);

    public static Rarity yellow = Rarity.UNCOMMON;
    public static Rarity dark_aqua = Rarity.create("extra_dark_aqua", style -> style.withColor(ChatFormatting.DARK_AQUA));
    public static Rarity dark_purple = Rarity.create("extra_dark_purple", style -> style.withColor(ChatFormatting.DARK_PURPLE));
    public static Rarity red = Rarity.create("extra_red", style -> style.withColor(ChatFormatting.RED));
    public static Rarity blue = Rarity.create("extra_blue", style -> style.withColor(ChatFormatting.BLUE));
    // augments
    public static final RegistryObject<ItemCoFH> integral_component = ITEMS.register("upgrade_augment", () -> new UpgradeAugmentItem(new Item.Properties().rarity(blue),
            AugmentDataHelper.builder()
                    .type(TAG_AUGMENT_TYPE_UPGRADE)
                    .mod(TAG_AUGMENT_BASE_MOD, 6F)
                    .build()));

    public static void augmentFlags() {
        flagUniqueAugment(ITEMS.get("integral_augment"));
    }

    public static Supplier<ItemCoFH> item(Consumer<Item.Properties> consumer) {
        return item(consumer, false);
    }

    public static Supplier<ItemCoFH> item(Consumer<Item.Properties> consumer, boolean count) {
        Item.Properties props = new Item.Properties();
        consumer.accept(props);
        if (count) {
            return () -> new CountedItem(props);
        }
        return () -> new ItemCoFH(props);
    }
}
