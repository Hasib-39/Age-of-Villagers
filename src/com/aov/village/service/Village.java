package com.aov.village.service;

import com.aov.village.object.VillageObject;
import com.aov.village.render.RenderStrategy;

import java.util.ArrayList;
import java.util.List;

/** A player's village: a name, a theme, and the objects placed in it. */
public class Village {
    private final String name;
    private final String theme;
    private final List<VillageObject> objects = new ArrayList<>();

    public Village(String name, String theme) {
        this.name = name;
        this.theme = theme;
    }

    public void addObject(VillageObject object) { objects.add(object); }

    public String getName() { return name; }
    public String getTheme() { return theme; }
    public List<VillageObject> getObjects() { return objects; }

    public void render(RenderStrategy strategy) {
        System.out.println("===== Village: " + name + " (Theme: " + theme + ") =====");
        for (VillageObject obj : objects) {
            strategy.render(obj);
            System.out.println();
        }
    }
}
