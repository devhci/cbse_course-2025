
package sdu.cbs;

import sdu.cbs.components.*;
import sdu.cbs.entities.*;
import sdu.cbs.systems.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * GamePanel handles rendering and updating of game objects.
 */
public class GamePanel extends JPanel {
    private final List<GameObject> gameObjects = new ArrayList<>();
    private final MovementSystem movementSystem = new MovementSystem();
    private final CollisionSystem collisionSystem = new CollisionSystem();

    public GamePanel() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);

        // Initialize game objects
        gameObjects.add(new Asteroid(100, 100, 2, 3, 20));
        gameObjects.add(new Asteroid(200, 150, -3, 2, 15));
        Spaceship player = new Spaceship(400, 500, 25, 100);
        gameObjects.add(player);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (GameObject obj : gameObjects) {
            PositionComponent pos = obj.getComponent(PositionComponent.class);
            CollisionComponent col = obj.getComponent(CollisionComponent.class);

            if (col != null) {
                g.setColor(Color.GRAY);
                g.fillOval(pos.x, pos.y, col.radius * 2, col.radius * 2);
            }
        }
    }

    public void update() {
        for (GameObject obj : gameObjects) {
            PositionComponent pos = obj.getComponent(PositionComponent.class);
            VelocityComponent vel = obj.getComponent(VelocityComponent.class);
            if (pos != null && vel != null) {
                movementSystem.update(pos, vel);
            }
        }

        // Example collision detection
        for (int i = 0; i < gameObjects.size(); i++) {
            for (int j = i + 1; j < gameObjects.size(); j++) {
                GameObject obj1 = gameObjects.get(i);
                GameObject obj2 = gameObjects.get(j);

                PositionComponent pos1 = obj1.getComponent(PositionComponent.class);
                CollisionComponent col1 = obj1.getComponent(CollisionComponent.class);
                PositionComponent pos2 = obj2.getComponent(PositionComponent.class);
                CollisionComponent col2 = obj2.getComponent(CollisionComponent.class);

                if (pos1 != null && col1 != null && pos2 != null && col2 != null) {
                    if (collisionSystem.checkCollision(pos1, col1, pos2, col2)) {
                        System.out.println("Collision detected!");
                    }
                }
            }
        }

        repaint();
    }
}
