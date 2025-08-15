package net.cool554.attributiezed_weaponry.item;

import net.cool554.attributiezed_weaponry.AttributizedWeaponry;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AttributizedWeaponry.MODID);


    public static final RegistryObject<Item> COPPER_COIN = ITEMS.register("copper_coin",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRON_COIN = ITEMS.register("iron_coin",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_COIN = ITEMS.register("diamond_coin",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_COIN = ITEMS.register("emerald_coin",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_COIN = ITEMS.register("netherite_coin",
            ()-> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
