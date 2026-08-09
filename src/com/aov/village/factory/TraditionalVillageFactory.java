package com.aov.village.factory;

import com.aov.village.builder.VillageObjectDirector;
import com.aov.village.builder.traditional.BananaTreeBuilder;
import com.aov.village.builder.traditional.MudHouseBuilder;
import com.aov.village.builder.traditional.PondBuilder;
import com.aov.village.object.House;
import com.aov.village.object.Tree;
import com.aov.village.object.WaterSource;

/** Concrete Factory: Traditional Village -> Mud House + Banana Tree + Pond. */
public class TraditionalVillageFactory implements VillageThemeFactory {
    private final VillageObjectDirector director = new VillageObjectDirector();

    @Override public String getThemeName() { return "Traditional"; }

    @Override public House createHouse() {
        return (House) director.construct(new MudHouseBuilder());
    }

    @Override public Tree createTree() {
        return (Tree) director.construct(new BananaTreeBuilder());
    }

    @Override public WaterSource createWaterSource() {
        return (WaterSource) director.construct(new PondBuilder());
    }
}
