package cn.ksmcbrigade.tkf.mixin;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.toasts.ToastComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ToastComponent.ToastInstance.class)
public class ToastInstanceMixin {
    @Inject(method = "render",at = @At("HEAD"),cancellable = true)
    public void render(int p_282887_, GuiGraphics p_283668_, CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(false);
    }
}
