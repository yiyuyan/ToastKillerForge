package cn.ksmcbrigade.tkf.mixin;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.toasts.Toast;
import net.minecraft.client.gui.components.toasts.ToastComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ToastComponent.class)
public class ToastMixin {
    @Inject(method = "addToast",at = @At("HEAD"), cancellable = true)
    public void add(Toast p_94923_, CallbackInfo ci){
        ci.cancel();
    }

    @Inject(method = "render",at = @At("HEAD"), cancellable = true)
    public void add(GuiGraphics p_283249_, CallbackInfo ci){
        ci.cancel();
    }
}
