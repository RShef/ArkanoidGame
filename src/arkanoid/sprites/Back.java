package arkanoid.sprites;

import biuoop.DrawSurface;


/**
 *
 * Created by RoyShefi on 17/05/2016.
 */
public class Back implements Sprite {
    private SpriteCollection s;

    public Back (SpriteCollection s) {
        this.s = s;
    }

    /**
     * Draws the background.
     * <p>
     * @param d the draw surface.
     */
    @Override
    public void drawOn(DrawSurface d) {
        for (Sprite s : this.s.getSprites()) {
            s.drawOn(d);
        }

    }

    @Override
    /**
     * Rubbish.
     */
    public void timePassed() {

    }
}
