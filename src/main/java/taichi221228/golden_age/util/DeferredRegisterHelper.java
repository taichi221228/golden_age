package taichi221228.golden_age.util;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import taichi221228.golden_age.GoldenAge;

public class DeferredRegisterHelper {
    private static <T> DeferredRegister<T> createDeferredRegister(IForgeRegistry<T> registryType) {
        return DeferredRegister.create(registryType, GoldenAge.MODID);
    }

    public static DeferredRegister<Block> createDeferredBlockRegister() {
        return createDeferredRegister(ForgeRegistries.BLOCKS);
    }

    public static DeferredRegister<Item> createDeferredItemRegister() {
        return createDeferredRegister(ForgeRegistries.ITEMS);
    }
}
