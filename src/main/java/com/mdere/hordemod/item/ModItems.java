package com.mdere.hordemod.item;

import com.mdere.hordemod.HordeMod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, HordeMod.MOD_ID);

    // public static final RegistryObject<Item> SPAWN_TOTEM = ITEMS.register("spawn_totem",
    //     () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HORDE_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
