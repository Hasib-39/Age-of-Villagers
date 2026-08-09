package com.aov.village.object.traditional;

import com.aov.village.object.House;
import com.aov.village.object.VillageObject;

public class MudHouse extends House {
    public MudHouse() { super("Mud House", "Traditional"); }

    private MudHouse(MudHouse other) {
        super("Mud House", "Traditional");
        this.children.addAll(other.cloneChildren());
    }

    @Override public VillageObject deepClone() { return new MudHouse(this); }
}
