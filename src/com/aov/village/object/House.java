package com.aov.village.object;

public abstract class House extends VillageObject {
    protected House(String name, String theme) { super(name, theme); }
    @Override public String getType() { return "House"; }
}
