package taichi221228.golden_age.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import taichi221228.golden_age.GoldenAge;

public class TagsHelper {
    public static TagKey<Block> createBlockTags(String name) {
        return BlockTags.create(new ResourceLocation(GoldenAge.MODID, name));
    }

    public static TagKey<Item> createItemTags(String name) {
        return ItemTags.create(new ResourceLocation(GoldenAge.MODID, name));
    }
}
