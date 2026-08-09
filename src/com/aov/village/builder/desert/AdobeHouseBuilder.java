package com.aov.village.builder.desert;

import com.aov.village.builder.VillageObjectBuilder;
import com.aov.village.object.VillageObject;
import com.aov.village.object.desert.AdobeHouse;
import com.aov.village.shape.Circle;
import com.aov.village.shape.Rectangle;
import com.aov.village.shape.Square;

public class AdobeHouseBuilder implements VillageObjectBuilder {
    private AdobeHouse house;

    @Override public void reset() { house = new AdobeHouse(); }

    @Override public void buildFoundation() {
        house.addShape(new Rectangle(5, 3, "Sand-Base"));
    }

    @Override public void buildStructure() {
        house.addShape(new Rectangle(5, 4, "Adobe-Clay-Wall"));
        house.addShape(new Square(1.0, "Wood-Door"));
    }

    @Override public void buildDetails() {
        house.addShape(new Rectangle(5, 0.4, "Flat-Roof-Beam"));
        house.addShape(new Circle(0.3, "Small-Window"));
    }

    @Override public VillageObject getResult() { return house; }
}
