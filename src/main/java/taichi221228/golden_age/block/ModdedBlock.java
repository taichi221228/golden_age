package taichi221228.golden_age.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import taichi221228.golden_age.util.DeferredRegisterHelper;

import java.util.function.Supplier;

public class ModdedBlock {
    private final DeferredRegister<Block> BLOCKS = DeferredRegisterHelper.createDeferredBlockRegister();
    private final DeferredRegister<Item> ITEMS = DeferredRegisterHelper.createDeferredItemRegister();

    protected RegistryObject<Block> block;
    protected RegistryObject<Item> blockItem;

    public ModdedBlock(String name, Supplier<Block> blockSupplier) {
        this.block = BLOCKS.register(name, blockSupplier);
        this.blockItem = ITEMS.register(name, () -> new BlockItem(this.block.get(), new Item.Properties()));
    }

    public void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
