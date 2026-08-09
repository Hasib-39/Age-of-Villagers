package com.aov.village.object;

import com.aov.village.shape.CompositeShape;
import com.aov.village.shape.Shape;

/**
 * The abstract "product" root that every concrete village object
 * (House, Tree, WaterSource) descends from. Serves as:
 *  - the Composite root (built out of Shapes),
 *  - the common return type used by the Abstract Factory,
 *  - the Prototype participant (deepClone()).
 */
public abstract class VillageObject extends CompositeShape {

    protected final String theme;

    protected VillageObject(String name, String theme) {
        super(name);
        this.theme = theme;
    }

    public String getTheme() { return theme; }

    /** e.g. "House", "Tree", "Water Source" */
    public abstract String getType();

    /** PROTOTYPE PATTERN: clone this object (and every shape inside it) cheaply. */
    public abstract VillageObject deepClone();

    /** Bridges the generic Shape#cloneShape() contract onto the more specific deepClone(). */
    @Override public Shape cloneShape() { return deepClone(); }
}
