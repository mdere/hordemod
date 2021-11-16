package com.mdere.hordemod.block;

import java.util.function.Supplier;

import com.mdere.hordemod.HordeMod;
import com.mdere.hordemod.item.ModCreativeModeTab;
import com.mdere.hordemod.item.ModItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, HordeMod.MOD_ID);
    
    public static final RegistryObject<Block> SPAWN_TOTEM_GROUND_BLOCK = registerBlock("spawn_totem_ground_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(12f).requiresCorrectToolForDrops()));

    public static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
            new Item.Properties().tab(tab)));
    }

    public static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
            new Item.Properties().tab(ModCreativeModeTab.HORDE_TAB)));
    }
    
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
