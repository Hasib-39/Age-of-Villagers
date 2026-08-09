package com.aov.village.builder.traditional;

import com.aov.village.builder.VillageObjectBuilder;
import com.aov.village.object.VillageObject;
import com.aov.village.object.traditional.MudHouse;
import com.aov.village.shape.Circle;
import com.aov.village.shape.Rectangle;
import com.aov.village.shape.Square;
import com.aov.village.shape.Triangle;

public class MudHouseBuilder implements VillageObjectBuilder {
    private MudHouse house;

    @Override public void reset() { house = new MudHouse(); }

    @Override public void buildFoundation() {
        house.addShape(new Rectangle(5, 3, "Brown-Soil-Base"));
    }

    @Override public void buildStructure() {
        house.addShape(new Rectangle(5, 4, "Mud-Wall"));
        house.addShape(new Square(1.0, "Wood-Door"));
    }

    @Override public void buildDetails() {
        house.addShape(new Triangle(5, 2.5, "Straw-Roof"));
        house.addShape(new Circle(0.3, "Small-Window"));
    }

    @Override public VillageObject getResult() { return house; }
}
