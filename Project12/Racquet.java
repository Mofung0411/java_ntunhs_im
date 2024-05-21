package Project12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Racquet extends JPanel {
    public static final int WIDTH = 120;
    public static final int HEIGHT = 30;
    private static final int STEP = 50;

    private int x = 0;
    private boolean left = false;
    private boolean right = false;

    private HW12 window;
    
    public int getTopY() {
        return window.getHeight() - HEIGHT;
    }
    
    public Racquet(HW12 w) {
        this.window = w;
    }

    public int getWidth() {
        return WIDTH;
    }

    public void moveLeft() {
        if (x - STEP >= 0)
            x -= STEP;
    }

    public void moveRight() {
        if (x + STEP <= window.getWidth() - WIDTH)
            x += STEP;
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            left = true;
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            right = true;
        }
    }

    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            left = false;
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            right = false;
        }
    }

    public Rectangle getBounds() {
        return new Rectangle(x, window.getHeight() - HEIGHT, WIDTH, HEIGHT);
    }

    public void paint(Graphics2D g) {
        g.fillRect(x, window.getHeight() - HEIGHT, WIDTH, HEIGHT);
    }
}