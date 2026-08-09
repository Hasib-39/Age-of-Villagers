package com.aov.village.factory;

import com.aov.village.builder.VillageObjectDirector;
import com.aov.village.builder.desert.AdobeHouseBuilder;
import com.aov.village.builder.desert.CactusTreeBuilder;
import com.aov.village.builder.desert.OasisBuilder;
import com.aov.village.object.House;
import com.aov.village.object.Tree;
import com.aov.village.object.WaterSource;

/**
 * Concrete Factory: Desert Village -> Adobe House + Cactus Tree + Oasis.
 * NOTE: this whole file is the ONLY new code required to add a brand-new
 * theme to the game; VillageThemeFactory, the Registry, the Facade and
 * every existing factory/builder/product class are untouched (Open/Closed
 * Principle in action).
 */
public class DesertVillageFactory implements VillageThemeFactory {
    private final VillageObjectDirector director = new VillageObjectDirector();

    @Override public String getThemeName() { return "Desert"; }

    @Override public House createHouse() {
        return (House) director.construct(new AdobeHouseBuilder());
    }

    @Override public Tree createTree() {
        return (Tree) director.construct(new CactusTreeBuilder());
    }

    @Override public WaterSource createWaterSource() {
        return (WaterSource) director.construct(new OasisBuilder());
    }
}
