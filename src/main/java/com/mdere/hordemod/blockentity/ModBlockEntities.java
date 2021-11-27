package com.mdere.hordemod.blockentity;

import com.mdere.hordemod.HordeMod;
import com.mdere.hordemod.block.entity.SpawnBlockEntity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister
        .create(ForgeRegistries.BLOCK_ENTITIES, HordeMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<SpawnBlockEntity>> SPAWN_BLOCK_ENTITY =
        BLOCK_ENTITIES.register(
            "spawn_block_entity",
            () -> BlockEntityType.Builder.of(
                SpawnBlockEntity::new,
                ModBlockEntities.SPAWN_BLOCK_ENTITY.get()));

    private void BlockEntityInit() {
        
    }
}
