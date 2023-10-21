package taichi221228.golden_age.block.ore;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import taichi221228.golden_age.block.ModdedBlock;

public class TinBlock extends ModdedBlock {
    public TinBlock() {
        super("tin_block", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)));
    }
}
