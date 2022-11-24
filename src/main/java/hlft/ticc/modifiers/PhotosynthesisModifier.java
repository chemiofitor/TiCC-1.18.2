package hlft.ticc.modifiers;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.nbt.IToolStackView;

public class PhotosynthesisModifier extends Modifier {

    @Override
    public void onInventoryTick(IToolStackView tool, int level, net.minecraft.world.level.Level world, LivingEntity holder, int itemSlot, boolean isSelected, boolean isCorrectSlot, ItemStack stack) {
        if (!world.isClientSide && holder.tickCount % 20 == 0 && holder.getUseItem() != stack) {
            BlockPos pos = holder.blockPosition().above();
            if (RANDOM.nextFloat() < 0.15 * level && (world.isRainingAt(pos) || (world.isDay()) && world.canSeeSky(pos))) {
                if (tool.getDamage() > 0)
                    tool.setDamage(tool.getDamage() - 1);
            }
        }
    }
}
