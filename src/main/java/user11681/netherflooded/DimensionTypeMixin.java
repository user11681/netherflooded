package user11681.netherflooded;

import net.minecraft.world.dimension.DimensionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(DimensionType.class)
abstract class DimensionTypeMixin {
    @ModifyConstant(method = "<clinit>",
                    constant = @Constant(intValue = 1,
                                         ordinal = 6))
    private static int makeNotWarm(int ultrawarm) {
        return 0;
    }
}
