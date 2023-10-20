package taichi221228.golden_age;

import net.minecraftforge.eventbus.api.IEventBus;
import taichi221228.golden_age.block.ModdedBlock;
import taichi221228.golden_age.block.ore.DeepslateTinOre;
import taichi221228.golden_age.block.ore.TinOre;

import java.util.Arrays;
import java.util.List;

public class Registrar {
    private static final List<ModdedBlock> moddedBlocks = Arrays.asList(new DeepslateTinOre(), new TinOre());

    public static void registerAll(IEventBus eventBus) {
        for (ModdedBlock moddedBlock : moddedBlocks) {
            moddedBlock.register(eventBus);
        }
    }
}
