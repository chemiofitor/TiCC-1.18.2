package hlft.ticc.init;

import hlft.ticc.TiCCUtil;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import slimeknights.mantle.registration.ModelFluidAttributes;
import slimeknights.mantle.registration.object.FluidObject;

public class TiCCFluids {
    public static final FluidObject<ForgeFlowingFluid> MOLTEN_CHLORIUM  = TiCCUtil.FLUIDS.register("molten_chlorium", hotBuilder().temperature(800), Material.LAVA, 14);
    public static final FluidObject<ForgeFlowingFluid> GLOWSTONE = TiCCUtil.FLUIDS.register("glowstone", hotBuilder().temperature(200), Material.LAVA,  15);
    public static final FluidObject<ForgeFlowingFluid> REDSTONE = TiCCUtil.FLUIDS.register("redstone", hotBuilder().temperature(700), Material.LAVA,  10);
    public static final FluidObject<ForgeFlowingFluid> MOLTEN_POWERED_TIN = TiCCUtil.FLUIDS.register("molten_powered_tin", hotBuilder().temperature(300), Material.LAVA,  14);
    private static FluidAttributes.Builder hotBuilder() {
        return ModelFluidAttributes.builder().density(2000).viscosity(10000).temperature(1000).sound(SoundEvents.BUCKET_FILL_LAVA, SoundEvents.BUCKET_EMPTY_LAVA);
    }

    public static void load() {}
}
