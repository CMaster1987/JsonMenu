package cl.c_master.jsonmenu.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.gui.screen.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

//import cl.c_master.jsonmenu.JsonMenuClient;

@Mixin(TitleScreen.class)
public class MixinTitleScreen extends Screen {

    public MixinTitleScreen(Text title)
    {
        super(title);
    }

    @Inject(at = @At("HEAD"), method = "render(IV)V")
    public void onRender(CallbackInfo c)
    {
        //Nota: Eliminar esto porque SPAMMEA MUCHO EL REGISTRO!!!

        //JsonMenuClient.LOG.info("Esto funciona?");
        //JsonMenuClient.LOG.info("Si no sale, es porque no funciona!");

        drawStringWithShadow(new MatrixStack(), this.textRenderer, "Esto funciona? - Probablemente", this.width / 2 / 2, 60, 16777215);
    }
}
