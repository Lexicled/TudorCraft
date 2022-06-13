package net.tudorcraft.tudorcraft.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.tudorcraft.tudorcraft.TudorCraft;
import net.tudorcraft.tudorcraft.entity.custom.Henry7Entity;
import net.tudorcraft.tudorcraft.entity.custom.Henry8Entity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class Henry8Renderer extends GeoEntityRenderer<Henry8Entity> {

    public Henry8Renderer(EntityRendererFactory.Context ctx) {
        super(ctx, new Henry8Model());
    }

    @Override
    public Identifier getTextureResource(Henry8Entity instance) {
        return new Identifier(TudorCraft.MOD_ID, "textures/entity/henry8.png");
    }
}