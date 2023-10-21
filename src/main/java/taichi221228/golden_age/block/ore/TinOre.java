package taichi221228.golden_age.block.ore;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import taichi221228.golden_age.block.ModdedBlock;

public class TinOre extends ModdedBlock {
    public TinOre() {
        super("tin_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE).requiresCorrectToolForDrops()));
    }
}

