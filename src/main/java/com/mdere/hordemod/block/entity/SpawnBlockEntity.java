package com.mdere.hordemod.block.entity;

import com.mdere.hordemod.blockentity.ModBlockEntities;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SpawnBlockEntity extends BlockEntity {

    public SpawnBlockEntity(BlockPos pWorldPosition, BlockState pBlockState) {
        super(ModBlockEntities.SPAWN_BLOCK_ENTITY.get(), pWorldPosition, pBlockState);
    }

    @Override
    public CompoundTag save(CompoundTag pTag) {
        super.save(pTag);
        return pTag;
    }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
    }

    @Override
    public void onLoad() {
        super.onLoad();
    }

    @Override
    public void handleUpdateTag(CompoundTag tag) {
        load(tag);
    }

    @Override
    public void setRemoved() {
        super.setRemoved();
    }

    @Override
    public CompoundTag getUpdateTag() {
        return save(new CompoundTag());
    }

    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return new ClientboundBlockEntityDataPacket(
            this.worldPosition, -1, save(new CompoundTag()));
    }

    @Override
    public void onDataPacket(Connection net, ClientboundBlockEntityDataPacket pkt) {
        load(pkt.getTag());
    }

    public void tick() {}



    // @SubscribeEvent
    // public static void registerTE(RegistryEvent.Register<BlockEntityType<?>> evt) {
    //   BlockEntityType<?> type = BlockEntityType.Builder.of(supplier, validBlocks).build(null);
    //   type.setRegistryName("mymod", "mybe");
    //   evt.getRegistry().register(type);
    // }

    
}
