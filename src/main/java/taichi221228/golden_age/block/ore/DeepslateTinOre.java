package taichi221228.golden_age.block.ore;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import taichi221228.golden_age.block.ModdedBlock;

public class DeepslateTinOre extends ModdedBlock {
    public DeepslateTinOre() {
        super("deepslate_tin_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COPPER_ORE)));
    }
}

