package hlft.ticc.init;

import hlft.ticc.TiCCUtil;
import hlft.ticc.block.FrameBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import slimeknights.mantle.registration.object.ItemObject;

import static hlft.ticc.init.TiCCItems.itemPro;

public class TiCCBlocks {
    public static final ItemObject<GlassBlock> QUARTZ_GLASS = TiCCUtil.BLOCKS.register("quartz_glass", () ->
            new GlassBlock(copyBlock(Blocks.GLASS).strength(1.1F)), block -> new BlockItem(block, itemPro()));

    public static final ItemObject<Block> WOODEN_FRAME = TiCCUtil.BLOCKS.register("wooden_frame",
            FrameBlock::wooden, block -> new BlockItem(block, itemPro()));
    public static final ItemObject<Block> IRON_FRAME = TiCCUtil.BLOCKS.register("iron_frame",
            FrameBlock::metal, block -> new BlockItem(block, itemPro()));
    public static final ItemObject<Block> LEAD_FRAME = TiCCUtil.BLOCKS.register("lead_frame",
            FrameBlock::metal, block -> new BlockItem(block, itemPro()));
    public static final ItemObject<Block> COPPER_FRAME = TiCCUtil.BLOCKS.register("copper_frame",
            FrameBlock::metal, block -> new BlockItem(block, itemPro()));
    public static final ItemObject<Block> STEEL_FRAME = TiCCUtil.BLOCKS.register("steel_frame",
            FrameBlock::metal, block -> new BlockItem(block, itemPro()));
    public static final ItemObject<Block> CHLORIUM_FRAME = TiCCUtil.BLOCKS.register("chlorium_frame",
            FrameBlock::metal, block -> new BlockItem(block, itemPro()));

    public static BlockBehaviour.Properties copyBlock(Block block) {
        return BlockBehaviour.Properties.copy(block);
    }
    public static void load() {}
}
