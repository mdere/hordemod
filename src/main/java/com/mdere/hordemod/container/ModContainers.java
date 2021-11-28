package com.mdere.hordemod.container;

import com.mdere.hordemod.HordeMod;
import com.mdere.hordemod.block.container.SpawnTotemContainer;

import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainers {
    public static final DeferredRegister<MenuType<?>> CONTAINERS =
        DeferredRegister.create(ForgeRegistries.CONTAINERS, HordeMod.MOD_ID);
    
    public static final RegistryObject<MenuType<AbstractContainerMenu>> SPAWN_TOTEM_CONTAINER = CONTAINERS.register(
        "spawn_totem_container",
        () -> IForgeContainerType.create((windowId, inv, data) -> {
        BlockPos pos = data.readBlockPos();
        // Level world = inv.player.getCommandSenderWorld();
        Level world = inv.player.getCommandSenderWorld();
        return new SpawnTotemContainer(windowId, world, pos, inv, inv.player);
    }));
    
    public static void register(IEventBus event) {
        CONTAINERS.register(event);
    }

}
