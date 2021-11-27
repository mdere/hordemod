package com.mdere.hordemod.item;

import com.mdere.hordemod.block.ModBlocks;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab HORDE_TAB = new CreativeModeTab("hordeModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.SPAWN_TOTEM_BLOCK.get());
        }
    };
}
