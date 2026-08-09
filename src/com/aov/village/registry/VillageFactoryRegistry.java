package com.aov.village.registry;

import com.aov.village.factory.VillageThemeFactory;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * SINGLETON PATTERN + Registry
 * ------------------------------
 * One global, lazily-created access point that maps a theme name
 * ("Modern", "Traditional", "Desert", ...) to its VillageThemeFactory.
 * New themes are plugged in at the composition root (see Main.java)
 * via registerFactory(); this class itself never needs to change.
 */
public final class VillageFactoryRegistry {
    private static volatile VillageFactoryRegistry instance;
    private final Map<String, VillageThemeFactory> factories = new HashMap<>();

    private VillageFactoryRegistry() { }

    public static VillageFactoryRegistry getInstance() {
        if (instance == null) {
            synchronized (VillageFactoryRegistry.class) {
                if (instance == null) {
                    instance = new VillageFactoryRegistry();
                }
            }
        }
        return instance;
    }

    public void registerFactory(VillageThemeFactory factory) {
        factories.put(factory.getThemeName().toLowerCase(), factory);
    }

    public VillageThemeFactory getFactory(String themeName) {
        VillageThemeFactory factory = factories.get(themeName.toLowerCase());
        if (factory == null) {
            throw new IllegalArgumentException("No factory registered for theme: " + themeName);
        }
        return factory;
    }

    public Set<String> getAvailableThemes() {
        return Collections.unmodifiableSet(factories.keySet());
    }
}
