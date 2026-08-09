package com.aov.village.render;

import com.aov.village.object.VillageObject;

/**
 * STRATEGY PATTERN
 * -----------------
 * Decouples HOW a village object gets displayed/rendered from the
 * object itself. The game could later add a GraphicalRenderStrategy
 * or JsonExportRenderStrategy without touching VillageObject at all.
 */
public interface RenderStrategy {
    void render(VillageObject object);
}
