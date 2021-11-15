package com.mdere.hordemod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab HORDE_TAB = new CreativeModeTab("hordeModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SPAWN_TOTEM.get());
        }
    };
}
