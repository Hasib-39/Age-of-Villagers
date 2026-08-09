package com.aov.village.object.desert;

import com.aov.village.object.House;
import com.aov.village.object.VillageObject;

public class AdobeHouse extends House {
    public AdobeHouse() { super("Adobe House", "Desert"); }

    private AdobeHouse(AdobeHouse other) {
        super("Adobe House", "Desert");
        this.children.addAll(other.cloneChildren());
    }

    @Override public VillageObject deepClone() { return new AdobeHouse(this); }
}
