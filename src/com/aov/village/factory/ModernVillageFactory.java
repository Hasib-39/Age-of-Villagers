package com.aov.village.factory;

import com.aov.village.builder.VillageObjectDirector;
import com.aov.village.builder.modern.BrickHouseBuilder;
import com.aov.village.builder.modern.MangoTreeBuilder;
import com.aov.village.builder.modern.SwimmingPoolBuilder;
import com.aov.village.object.House;
import com.aov.village.object.Tree;
import com.aov.village.object.WaterSource;

/** Concrete Factory: Modern Village -> Brick House + Mango Tree + Swimming Pool. */
public class ModernVillageFactory implements VillageThemeFactory {
    private final VillageObjectDirector director = new VillageObjectDirector();

    @Override public String getThemeName() { return "Modern"; }

    @Override public House createHouse() {
        return (House) director.construct(new BrickHouseBuilder());
    }

    @Override public Tree createTree() {
        return (Tree) director.construct(new MangoTreeBuilder());
    }

    @Override public WaterSource createWaterSource() {
        return (WaterSource) director.construct(new SwimmingPoolBuilder());
    }
}
