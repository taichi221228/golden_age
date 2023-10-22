package taichi221228.golden_age.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import taichi221228.golden_age.util.DeferredRegisterHelper;

public class ModdedItem {
    private final DeferredRegister<Item> ITEMS = DeferredRegisterHelper.createDeferredItemRegister();

    protected RegistryObject<Item> item;

    public ModdedItem(String name) {
        this.item = ITEMS.register(name, () -> new Item(new Item.Properties()));
    }

    public void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
