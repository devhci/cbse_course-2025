
package dk.sdu.cbs.game;

import javax.swing.*;

/**
 * Main game frame for the application.
 */
public class GameFrame extends JFrame {
    public GameFrame() {
        this.setTitle(" SDU CBS Class Asteroid Collision Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true);

        // Add the game panel
        GamePanel panel = new GamePanel();
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
