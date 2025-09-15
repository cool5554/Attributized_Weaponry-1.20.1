package net.cool554.attributiezed_weaponry.item;

import net.cool554.attributiezed_weaponry.AttributizedWeaponry;
import net.cool554.attributiezed_weaponry.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AttributizedWeaponry.MODID);

    public static final RegistryObject<CreativeModeTab> CURRENCY_TAB = CREATIVE_MODE_TABS.register("currency_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.DIAMOND_COIN.get()))
                    .title(Component.translatable("creativetab.currency_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(Moditems.COPPER_COIN.get());
                        output.accept(Moditems.IRON_COIN.get());
                        output.accept(Moditems.DIAMOND_COIN.get());
                        output.accept(Moditems.NETHERITE_COIN.get());
                        output.accept(Moditems.EMERALD_COIN.get());
                        output.accept(Moditems.GOLD_COIN.get());


                    }))
                    .build());
    public static final RegistryObject<CreativeModeTab> LORE_ITEMS_TAB = CREATIVE_MODE_TABS.register("lore_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.DIAMOND_COIN.get()))
                    .title(Component.translatable("creativetab.lore_items_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.FAE_CORE.get());



                    }))
                    .build());






    public static void register(IEventBus eventBus) {
            CREATIVE_MODE_TABS.register(eventBus);
    }
}
