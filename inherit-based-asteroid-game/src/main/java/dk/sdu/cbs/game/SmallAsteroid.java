
package dk.sdu.cbs.game;

/**
 * Represents a small asteroid that is destroyed upon collision.
 */
public class SmallAsteroid extends Asteroid {
    public SmallAsteroid(int x, int y, int velocity) {
        super(x, y, velocity, 1);
    }

    @Override
    public void onCollision(GameObject other) {
        System.out.println("Small asteroid destroyed.");
    }
}
