package hlft.ticc;

import hlft.ticc.init.TiCCBlocks;
import hlft.ticc.init.TiCCFluids;
import hlft.ticc.init.TiCCItems;
import hlft.ticc.init.TiCCModifiers;
import net.minecraftforge.eventbus.api.IEventBus;
import slimeknights.mantle.registration.deferred.BlockDeferredRegister;
import slimeknights.mantle.registration.deferred.FluidDeferredRegister;
import slimeknights.mantle.registration.deferred.ItemDeferredRegister;
import slimeknights.tconstruct.library.modifiers.util.ModifierDeferredRegister;

public class TiCCUtil {
    public static final ItemDeferredRegister ITEMS = new ItemDeferredRegister(TiCCMod.MODID);
    public static final BlockDeferredRegister BLOCKS = new BlockDeferredRegister(TiCCMod.MODID);
    public static final FluidDeferredRegister FLUIDS = new FluidDeferredRegister(TiCCMod.MODID);
    public static final ModifierDeferredRegister MODIFIERS = ModifierDeferredRegister.create(TiCCMod.MODID);

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
        BLOCKS.register(bus);
        FLUIDS.register(bus);
        MODIFIERS.register(bus);
    }

    public static void loadAll() {
        TiCCItems.load();
        TiCCBlocks.load();
        TiCCFluids.load();
        TiCCModifiers.load();
    }
}
