package com.mdere.hordemod.block.custom;

import com.mdere.hordemod.block.ModBlocks;
import com.mdere.hordemod.block.entity.SpawnBlockEntity;
import com.mdere.hordemod.blockentity.ModBlockEntities;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class SpawnTotemBlock extends Block implements EntityBlock {
    public SpawnTotemBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void setPlacedBy(Level pLevel, BlockPos pPos, BlockState pState, LivingEntity pPlacer, ItemStack pStack) {
        if (!pLevel.isClientSide()) {
            BlockPos belowPos = pPos.below();
            BlockPos eastPos = belowPos.east();
            BlockPos westPos = belowPos.west();
            BlockPos northPos = belowPos.north();
            BlockPos southPos = belowPos.south();
            BlockState pNewState = ModBlocks.SPAWN_TOTEM_GROUND_BLOCK.get().defaultBlockState();
            pLevel.setBlock(belowPos, pNewState, 2);
            pLevel.setBlock(eastPos, pNewState, 2);
            pLevel.setBlock(westPos, pNewState, 2);
            pLevel.setBlock(southPos, pNewState, 2);
            pLevel.setBlock(northPos, pNewState, 2);
            pLevel.setBlock(northPos.east(), pNewState, 2);
            pLevel.setBlock(northPos.west(), pNewState, 2);
            pLevel.setBlock(southPos.east(), pNewState, 2);
            pLevel.setBlock(southPos.west(), pNewState, 2);   
        }
        super.setPlacedBy(pLevel, pPos, pState, pPlacer, pStack);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return ModBlockEntities.SPAWN_BLOCK_ENTITY.get().create(pPos, pState);
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState,
            BlockEntityType<T> pBlockEntityType) {
        return pLevel.isClientSide ? null
            : (level0, pos, state0, blockEntity) -> 
                ((SpawnBlockEntity)blockEntity).tick();
    }
}
