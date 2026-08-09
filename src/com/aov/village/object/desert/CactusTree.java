package com.aov.village.object.desert;

import com.aov.village.object.Tree;
import com.aov.village.object.VillageObject;

public class CactusTree extends Tree {
    public CactusTree() { super("Cactus Tree", "Desert"); }

    private CactusTree(CactusTree other) {
        super("Cactus Tree", "Desert");
        this.children.addAll(other.cloneChildren());
    }

    @Override public VillageObject deepClone() { return new CactusTree(this); }
}
