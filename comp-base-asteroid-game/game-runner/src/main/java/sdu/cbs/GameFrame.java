
package sdu.cbs;

import javax.swing.*;

/**
 * GameFrame is the main window of the game.
 */
public class GameFrame extends JFrame {
    public GameFrame() {
        setTitle("Asteroid Collision Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel panel = new GamePanel();
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        new Timer(16, e -> panel.update()).start(); // Game loop
    }
}
