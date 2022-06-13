package net.tudorcraft.tudorcraft.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    private static FoodComponent.Builder createModStew(int hunger) {
        return (new FoodComponent.Builder()).hunger(hunger).saturationModifier(0.6F);
    }
    public static final FoodComponent VEGETABLE_STEW;
    public static final FoodComponent SUGAR_BOWL;

    static {
        VEGETABLE_STEW = createModStew(8).build();
        SUGAR_BOWL = createModStew(0).build();
    }
}
