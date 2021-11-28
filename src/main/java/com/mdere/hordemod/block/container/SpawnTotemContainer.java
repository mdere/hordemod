package com.mdere.hordemod.block.container;

import com.mdere.hordemod.container.ModContainers;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.level.Level;

// Referenced: https://github.com/McJty/YouTubeTutorial17/blob/main/src/main/java/com/mcjty/blocks/GeneratorContainer.java

public class SpawnTotemContainer extends AbstractContainerMenu {

    public SpawnTotemContainer(int windowId, Level world, BlockPos pos, Inventory inv, Player player) {
        super(ModContainers.SPAWN_TOTEM_CONTAINER.get(), windowId);
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return false;
    }

    
}
