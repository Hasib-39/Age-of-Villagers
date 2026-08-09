package com.aov.village.builder.modern;

import com.aov.village.builder.VillageObjectBuilder;
import com.aov.village.object.VillageObject;
import com.aov.village.object.modern.BrickHouse;
import com.aov.village.shape.Circle;
import com.aov.village.shape.Rectangle;
import com.aov.village.shape.Square;
import com.aov.village.shape.Triangle;

public class BrickHouseBuilder implements VillageObjectBuilder {
    private BrickHouse house;

    @Override public void reset() { house = new BrickHouse(); }

    @Override public void buildFoundation() {
        house.addShape(new Rectangle(6, 4, "Grey-Concrete"));
    }

    @Override public void buildStructure() {
        house.addShape(new Rectangle(6, 5, "Red-Brick"));
        house.addShape(new Square(1.2, "Brown-Wood-Door"));
    }

    @Override public void buildDetails() {
        house.addShape(new Triangle(6, 3, "Dark-Red-Roof"));
        house.addShape(new Circle(0.4, "Glass-Window"));
    }

    @Override public VillageObject getResult() { return house; }
}
