
package dk.sdu.cbs.game;

/**
 * Represents a large asteroid that splits upon collision.
 */
public class LargeAsteroid extends Asteroid {
    public LargeAsteroid(int x, int y, int velocity) {
        super(x, y, velocity, 2);
    }

    @Override
    public void onCollision(GameObject other) {
        System.out.println("Large asteroid split into smaller asteroids.");
    }
}
