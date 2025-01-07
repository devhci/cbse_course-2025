
package sdu.cbs.systems;

import sdu.cbs.components.CollisionComponent;
import sdu.cbs.components.PositionComponent;

/**
 * Collision system checks for collisions between objects.
 */
public class CollisionSystem {
    public boolean checkCollision(PositionComponent pos1, CollisionComponent col1, PositionComponent pos2, CollisionComponent col2) {
        int dx = pos1.x - pos2.x;
        int dy = pos1.y - pos2.y;
        int distance = (int) Math.sqrt(dx * dx + dy * dy);
        return distance < (col1.radius + col2.radius);
    }
}
