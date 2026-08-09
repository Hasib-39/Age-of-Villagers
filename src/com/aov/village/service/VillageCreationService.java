package com.aov.village.service;

import com.aov.village.factory.VillageThemeFactory;
import com.aov.village.registry.VillageFactoryRegistry;

/**
 * FACADE PATTERN
 * ---------------
 * Hides the Registry + Abstract Factory + Builder + Director machinery
 * behind one simple call so client code (UI, game engine, tests, ...)
 * doesn't need to know any of the internal wiring.
 */
public class VillageCreationService {
    private final VillageFactoryRegistry registry = VillageFactoryRegistry.getInstance();

    public Village createVillage(String villageName, String themeName) {
        VillageThemeFactory factory = registry.getFactory(themeName);
        Village village = new Village(villageName, factory.getThemeName());
        village.addObject(factory.createHouse());
        village.addObject(factory.createTree());
        village.addObject(factory.createWaterSource());
        return village;
    }
}
