package hlft.ticc.init;

import net.minecraft.world.item.Item;

import static hlft.ticc.item.TiCCTabs.MAIN;

public class TiCCItems {
    public static Item.Properties itemPro() {
        return new Item.Properties().tab(MAIN);
    }

    public static void load() {}
}
