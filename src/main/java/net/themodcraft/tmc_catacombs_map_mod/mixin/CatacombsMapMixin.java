package net.themodcraft.tmc_catacombs_map_mod.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.themodcraft.tmc_catacombs_map_mod.client.ui.CatacombsMapHUD;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class CatacombsMapMixin {
    private static final CatacombsMapHUD mapHUD = new CatacombsMapHUD();

    @Inject(
            method = "render",
            at = @At("RETURN")
    )
    private void renderCatacombsMap(DrawContext context, float tickDelta, CallbackInfo ci) {
        mapHUD.render(context);
    }
}
