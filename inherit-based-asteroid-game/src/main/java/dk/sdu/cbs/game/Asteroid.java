
package dk.sdu.cbs.game;

/**
 * Represents an asteroid in the game.
 */
public class Asteroid extends GameObject {
    protected int size; // Size of the asteroid

    public Asteroid(int x, int y, int velocity, int size) {
        super(x, y, velocity);
        this.size = size;
    }

    @Override
    public void update() {
        this.y += velocity; // Move asteroid downwards
    }

    @Override
    public void onCollision(GameObject other) {
        System.out.println("Asteroid collided and might split.");
    }
}
