package com.aov.village.object;

public abstract class WaterSource extends VillageObject {
    protected WaterSource(String name, String theme) { super(name, theme); }
    @Override public String getType() { return "Water Source"; }
}
