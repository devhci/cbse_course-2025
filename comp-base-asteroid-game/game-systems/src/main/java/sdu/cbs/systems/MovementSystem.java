
package sdu.cbs.systems;

import sdu.cbs.components.PositionComponent;
import sdu.cbs.components.VelocityComponent;

/**
 * Movement system updates the position of objects based on their velocity.
 */
public class MovementSystem {
    public void update(PositionComponent position, VelocityComponent velocity) {
        position.x += velocity.dx;
        position.y += velocity.dy;
    }
}
