package com.aov.village.object.modern;

import com.aov.village.object.Tree;
import com.aov.village.object.VillageObject;

public class MangoTree extends Tree {
    public MangoTree() { super("Mango Tree", "Modern"); }

    private MangoTree(MangoTree other) {
        super("Mango Tree", "Modern");
        this.children.addAll(other.cloneChildren());
    }

    @Override public VillageObject deepClone() { return new MangoTree(this); }
}
