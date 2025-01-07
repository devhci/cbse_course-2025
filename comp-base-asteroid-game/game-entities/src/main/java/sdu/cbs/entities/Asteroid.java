
package sdu.cbs.entities;

import sdu.cbs.components.*;

/**
 * Asteroid is a game object with position, velocity, and collision components.
 */
public class Asteroid extends GameObject {
    public Asteroid(int x, int y, int dx, int dy, int radius) {
        addComponent(PositionComponent.class, new PositionComponent(x, y));
        addComponent(VelocityComponent.class, new VelocityComponent(dx, dy));
        addComponent(CollisionComponent.class, new CollisionComponent(radius));
    }
}
