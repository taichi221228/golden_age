package taichi221228.golden_age;

import net.minecraftforge.eventbus.api.IEventBus;
import taichi221228.golden_age.block.ModdedBlock;
import taichi221228.golden_age.block.ore.DeepslateTinOre;
import taichi221228.golden_age.block.ore.RawTinBlock;
import taichi221228.golden_age.block.ore.TinBlock;
import taichi221228.golden_age.block.ore.TinOre;
import taichi221228.golden_age.item.ModdedItem;
import taichi221228.golden_age.item.ore.CopperNugget;
import taichi221228.golden_age.item.ore.RawTin;
import taichi221228.golden_age.item.ore.TinIngot;
import taichi221228.golden_age.item.ore.TinNugget;

import java.util.Arrays;
import java.util.List;

public class Registrar {
    private static final List<ModdedBlock> moddedBlocks = Arrays.asList(new DeepslateTinOre(), new RawTinBlock(), new TinBlock(), new TinOre());
    private static final List<ModdedItem> moddedItems = Arrays.asList(new CopperNugget(), new RawTin(), new TinIngot(), new TinNugget());

    public static void registerAll(IEventBus eventBus) {
        for (ModdedBlock moddedBlock : moddedBlocks) {
            moddedBlock.register(eventBus);
        }
        for (ModdedItem moddedItem : moddedItems) {
            moddedItem.register(eventBus);
        }
    }
}
