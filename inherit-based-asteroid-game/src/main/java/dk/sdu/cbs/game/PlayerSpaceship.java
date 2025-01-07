
package dk.sdu.cbs.game;

/**
 * Represents the player's spaceship.
 */
public class PlayerSpaceship extends Spaceship {
    public PlayerSpaceship(int x, int y, int velocity) {
        super(x, y, velocity, 100);
    }

    public void shoot() {
        System.out.println("Player spaceship shoots!");
    }
}
