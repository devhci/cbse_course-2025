
package dk.sdu.cbs.game;

/**
 * Represents a spaceship in the game.
 */
public class Spaceship extends GameObject {
    protected int health; // Health points of the spaceship

    public Spaceship(int x, int y, int velocity, int health) {
        super(x, y, velocity);
        this.health = health;
    }

    @Override
    public void update() {
        this.x += velocity; // Move horizontally
    }

    @Override
    public void onCollision(GameObject other) {
        this.health -= 10; // Reduce health on collision
        System.out.println("Spaceship collided! Health: " + this.health);
    }
}
