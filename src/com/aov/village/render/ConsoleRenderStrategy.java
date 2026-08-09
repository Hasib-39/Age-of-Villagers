package com.aov.village.render;

import com.aov.village.object.VillageObject;

/** Concrete Strategy: prints the object tree straight to the console. */
public class ConsoleRenderStrategy implements RenderStrategy {
    @Override
    public void render(VillageObject object) {
        System.out.println("[" + object.getType() + "] " + object.getName() + " (" + object.getTheme() + " theme)");
        object.draw(1);
        System.out.printf("  Total footprint area: %.2f sq. units%n", object.getArea());
    }
}
