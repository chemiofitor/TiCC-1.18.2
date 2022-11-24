package hlft.ticc;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TiCCMod.MODID)
public class TiCCMod {
    public static final String MODID = "ticc";

    public TiCCMod() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        TiCCUtil.loadAll();
        TiCCUtil.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static ResourceLocation asRes(String path) {
        return new ResourceLocation(MODID, path);
    }
}
