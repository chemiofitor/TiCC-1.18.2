package hlft.ticc.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.AbstractGlassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class FrameBlock extends AbstractGlassBlock {
    protected FrameBlock(Properties pProperties) {
        super(pProperties);
    }

    public static FrameBlock metal() {
        return new FrameBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.METAL)
                .strength(2F)
                .sound(SoundType.ANCIENT_DEBRIS)
                .requiresCorrectToolForDrops()
        );
    }

    public static FrameBlock wooden() {
        return new FrameBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD)
                .strength(1F)
                .sound(SoundType.WOOD))
        {
            @Override
            public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                return 3;
            }

            @Override
            public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                return true;
            }
        };
    }
}
