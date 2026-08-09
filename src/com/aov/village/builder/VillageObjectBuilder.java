package com.aov.village.builder;

import com.aov.village.object.VillageObject;

/**
 * BUILDER PATTERN
 * ----------------
 * Separates the step-by-step construction of a VillageObject (adding
 * foundation, structure and detail shapes) from its final representation.
 * Each concrete village object (BrickHouse, MangoTree, Pond, ...) gets
 * its own builder that knows exactly which simple shapes to add and how.
 */
public interface VillageObjectBuilder {
    void reset();
    void buildFoundation();
    void buildStructure();
    void buildDetails();
    VillageObject getResult();
}
