
package dk.sdu.cbs.game;

/**
 * Base class for all game objects.
 */
public abstract class GameObject {
    protected int x, y; // Position of the game object
    protected int velocity; // Speed of movement

    public GameObject(int x, int y, int velocity) {
        this.x = x;
        this.y = y;
        this.velocity = velocity;
    }

    public abstract void update(); // Update the object's state

    public abstract void onCollision(GameObject other); // Handle collision with another object

    @Override
    public String toString() {
        return String.format("GameObject at (%d, %d)", x, y);
    }
}
