package com.aov.village.builder.modern;

import com.aov.village.builder.VillageObjectBuilder;
import com.aov.village.object.VillageObject;
import com.aov.village.object.modern.SwimmingPool;
import com.aov.village.shape.Rectangle;
import com.aov.village.shape.Square;

public class SwimmingPoolBuilder implements VillageObjectBuilder {
    private SwimmingPool pool;

    @Override public void reset() { pool = new SwimmingPool(); }

    @Override public void buildFoundation() {
        pool.addShape(new Rectangle(8, 4, "White-Tile-Deck"));
    }

    @Override public void buildStructure() {
        pool.addShape(new Rectangle(7, 3, "Aqua-Water"));
    }

    @Override public void buildDetails() {
        pool.addShape(new Square(1, "Blue-Tile-Border"));
    }

    @Override public VillageObject getResult() { return pool; }
}
