package hlft.ticc.init;

import hlft.ticc.TiCCUtil;
import hlft.ticc.modifiers.PhotosynthesisModifier;
import slimeknights.tconstruct.library.modifiers.util.StaticModifier;

public class TiCCModifiers {
    public static final StaticModifier<PhotosynthesisModifier> PHOTOSYNTHESIS = TiCCUtil.MODIFIERS.register("photosynthesis", PhotosynthesisModifier::new);

    public static void load() {}
}
