package com.aov.village.app;

import com.aov.village.factory.DesertVillageFactory;
import com.aov.village.factory.ModernVillageFactory;
import com.aov.village.factory.TraditionalVillageFactory;
import com.aov.village.object.VillageObject;
import com.aov.village.registry.VillageFactoryRegistry;
import com.aov.village.render.ConsoleRenderStrategy;
import com.aov.village.render.RenderStrategy;
import com.aov.village.service.Village;
import com.aov.village.service.VillageCreationService;

/**
 * Demo / composition root for Age of Villagers (AoV) village creation module.
 */
public class Main {
    public static void main(String[] args) {
        // ---- Composition root: register the themes available today (Singleton Registry) ----
        VillageFactoryRegistry registry = VillageFactoryRegistry.getInstance();
        registry.registerFactory(new ModernVillageFactory());
        registry.registerFactory(new TraditionalVillageFactory());

        // Extensibility proof: a brand-new "Desert" theme is added here with
        // ONE line, and DesertVillageFactory.java was the only new file needed.
        // No existing class (Registry, Facade, other factories/builders/products)
        // was modified. This satisfies the assignment's Open/Closed requirement.
        registry.registerFactory(new DesertVillageFactory());

        VillageCreationService villageService = new VillageCreationService();
        RenderStrategy renderer = new ConsoleRenderStrategy();

        Village modernVillage = villageService.createVillage("Green Meadows", "Modern");
        Village traditionalVillage = villageService.createVillage("Old Town", "Traditional");
        Village desertVillage = villageService.createVillage("Sandy Dunes", "Desert");

        modernVillage.render(renderer);
        traditionalVillage.render(renderer);
        desertVillage.render(renderer);

        // ---- PROTOTYPE PATTERN demo: clone an existing tree instead of rebuilding it ----
        VillageObject originalTree = modernVillage.getObjects().get(1); // Mango Tree
        VillageObject clonedTree = originalTree.deepClone();
        modernVillage.addObject(clonedTree);
        System.out.println("Cloned a \"" + clonedTree.getName() + "\" via the Prototype pattern. \""
                + modernVillage.getName() + "\" now has " + modernVillage.getObjects().size() + " objects.");

        System.out.println();
        System.out.println("Registered themes in the game: " + registry.getAvailableThemes());
    }
}
