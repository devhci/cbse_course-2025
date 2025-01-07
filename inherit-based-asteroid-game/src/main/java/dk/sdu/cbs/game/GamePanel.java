
package dk.sdu.cbs.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Game panel that handles rendering and the game loop.
 */
public class GamePanel extends JPanel implements ActionListener, KeyListener {
    private final Timer timer;
    private final PlayerSpaceship player;
    private final List<GameObject> gameObjects;

    public GamePanel() {
        this.setPreferredSize(new Dimension(800, 600));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(this);

        // Initialize game objects
        player = new PlayerSpaceship(400, 500, 1);
        gameObjects = new ArrayList<>();
        gameObjects.add(new LargeAsteroid(200, 0, 1));
        gameObjects.add(new SmallAsteroid(600, 0, 2));
        gameObjects.add(player);

        // Timer for game loop
        timer = new Timer(16, this); // ~60 FPS
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update all game objects
        for (GameObject obj : gameObjects) {
            obj.update();
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw all game objects
        for (GameObject obj : gameObjects) {
            if (obj instanceof Asteroid) {
                g2d.setColor(Color.GRAY);
                g2d.fillOval(obj.x, obj.y, 40, 40);
            } else if (obj instanceof PlayerSpaceship) {
                g2d.setColor(Color.GREEN);
                g2d.fillRect(obj.x, obj.y, 50, 30);
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        // Move player spaceship
        if (key == KeyEvent.VK_LEFT) {
            System.out.println("Player before moves left!= " + player.x);
            player.x -= player.velocity;
            System.out.println("Player moves left!= " + player.x);
//            player.y -= player.velocity;
        } else if (key == KeyEvent.VK_RIGHT) {
            player.x += player.velocity;
        } else if (key == KeyEvent.VK_SPACE) {
            System.out.println("Player shoots!");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { }

    @Override
    public void keyTyped(KeyEvent e) { }
}
