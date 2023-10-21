package taichi221228.golden_age.block.ore;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import taichi221228.golden_age.block.ModdedBlock;

public class RawTinBlock extends ModdedBlock {
    public RawTinBlock() {
        super("raw_tin_block", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.RAW_COPPER_BLOCK)));
    }
}

