
package sdu.cbs.entities;

import sdu.cbs.components.*;

/**
 * Spaceship is a game object with position, health, and collision components.
 */
public class Spaceship extends GameObject {
    public Spaceship(int x, int y, int radius, int health) {
        addComponent(PositionComponent.class, new PositionComponent(x, y));
        addComponent(CollisionComponent.class, new CollisionComponent(radius));
        addComponent(HealthComponent.class, new HealthComponent(health));
    }
}
