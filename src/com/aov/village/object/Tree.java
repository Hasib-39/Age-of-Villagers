package com.aov.village.object;

public abstract class Tree extends VillageObject {
    protected Tree(String name, String theme) { super(name, theme); }
    @Override public String getType() { return "Tree"; }
}
