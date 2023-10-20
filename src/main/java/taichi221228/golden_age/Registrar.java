package taichi221228.golden_age;

import net.minecraftforge.eventbus.api.IEventBus;
import taichi221228.golden_age.block.ore.TinOre;


public class Registrar {
    public static void registerAll(IEventBus eventBus) {
        final TinOre tinOre = new TinOre();
        tinOre.register(eventBus);
    }
}
