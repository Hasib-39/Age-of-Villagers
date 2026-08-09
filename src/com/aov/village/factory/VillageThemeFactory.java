package com.aov.village.factory;

import com.aov.village.object.House;
import com.aov.village.object.Tree;
import com.aov.village.object.WaterSource;

/**
 * ABSTRACT FACTORY PATTERN
 * -------------------------
 * Declares creation methods for a whole FAMILY of related products
 * (House + Tree + WaterSource) that must all belong to the same theme.
 * Adding a new theme = adding one new class that implements this
 * interface; NOTHING here or in any existing factory needs to change.
 */
public interface VillageThemeFactory {
    String getThemeName();
    House createHouse();
    Tree createTree();
    WaterSource createWaterSource();
}
