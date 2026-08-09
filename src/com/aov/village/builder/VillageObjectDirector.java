package com.aov.village.builder;

import com.aov.village.object.VillageObject;

/**
 * BUILDER PATTERN - Director
 * ---------------------------
 * Knows the correct ORDER of construction steps but nothing about
 * shapes or colors. Any builder can be plugged in.
 */
public class VillageObjectDirector {
    public VillageObject construct(VillageObjectBuilder builder) {
        builder.reset();
        builder.buildFoundation();
        builder.buildStructure();
        builder.buildDetails();
        return builder.getResult();
    }
}
