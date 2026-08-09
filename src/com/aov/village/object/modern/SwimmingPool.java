package com.aov.village.object.modern;

import com.aov.village.object.VillageObject;
import com.aov.village.object.WaterSource;

public class SwimmingPool extends WaterSource {
    public SwimmingPool() { super("Swimming Pool", "Modern"); }

    private SwimmingPool(SwimmingPool other) {
        super("Swimming Pool", "Modern");
        this.children.addAll(other.cloneChildren());
    }

    @Override public VillageObject deepClone() { return new SwimmingPool(this); }
}
