package net.tudorcraft.tudorcraft.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.tudorcraft.tudorcraft.TudorCraft;
import net.tudorcraft.tudorcraft.entity.custom.Henry7Entity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class Henry7Renderer extends GeoEntityRenderer<Henry7Entity> {

    public Henry7Renderer(EntityRendererFactory.Context ctx) {
        super(ctx, new Henry7Model());
    }

    @Override
    public Identifier getTextureLocation(Henry7Entity instance) {
        return new Identifier(TudorCraft.MOD_ID, "textures/entity/henry7.png");
    }
}
