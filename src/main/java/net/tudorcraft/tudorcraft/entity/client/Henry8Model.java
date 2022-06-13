package net.tudorcraft.tudorcraft.entity.client;

import net.minecraft.util.Identifier;
import net.tudorcraft.tudorcraft.TudorCraft;
import net.tudorcraft.tudorcraft.entity.custom.Henry7Entity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class Henry8Model extends AnimatedGeoModel {

    @Override
    public void setLivingAnimations(Object o, Integer integer, AnimationEvent animationEvent) {

    }

    @Override
    public Identifier getModelResource(Object object) {
        return new Identifier(TudorCraft.MOD_ID, "geo/henry8.geo.json");
    }

    @Override
    public Identifier getTextureResource(Object object) {
        return new Identifier(TudorCraft.MOD_ID, "textures/entity/henry8.png");
    }

    @Override
    public Identifier getAnimationResource(Object animatable) {
        return new Identifier(TudorCraft.MOD_ID, "animations/henry8.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void setLivingAnimations(Henry7Entity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("Head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}