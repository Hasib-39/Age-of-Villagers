package com.aov.village.shape;

final class ShapeUtils {
    private ShapeUtils() { }

    static String indent(int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < level; i++) sb.append("  ");
        return sb.toString();
    }
}
