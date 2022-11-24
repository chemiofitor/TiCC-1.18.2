package hlft.ticc.item;

import hlft.ticc.TiCCMod;
import hlft.ticc.init.TiCCBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class TiCCTabs {
    public static CreativeModeTab MAIN = new CreativeModeTab(TiCCMod.MODID) {
        @NotNull
        @Override
        public ItemStack makeIcon() {
            return TiCCBlocks.IRON_FRAME.asItem().getDefaultInstance();
        }
    };
}
