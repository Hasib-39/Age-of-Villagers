package com.aov.village.object.traditional;

import com.aov.village.object.Tree;
import com.aov.village.object.VillageObject;

public class BananaTree extends Tree {
    public BananaTree() { super("Banana Tree", "Traditional"); }

    private BananaTree(BananaTree other) {
        super("Banana Tree", "Traditional");
        this.children.addAll(other.cloneChildren());
    }

    @Override public VillageObject deepClone() { return new BananaTree(this); }
}
