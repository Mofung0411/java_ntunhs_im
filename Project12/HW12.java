package Project12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HW12 extends JFrame implements KeyListener {
    static int score;
    static final int WIDTH = 600;
    static final int HEIGHT = 600;
    Ball ball;
    Racquet racquet;

    public HW12() {
        this.setTitle("不讓球掉下來!!");
        this.setSize(WIDTH, HEIGHT);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        ball = new Ball(this);
        racquet = new Racquet(this);

        this.addKeyListener(this);
        this.setFocusable(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        // 繪製小球和球拍
        ball.paint(g2d);
        racquet.paint(g2d);

        // 繪製分數
        g2d.setColor(Color.GRAY);
        g2d.setFont(new Font("Verdana", Font.BOLD, 50));
        g2d.drawString(String.valueOf(score), 500, 120);
    }

    public void increaseScore() {
        score++;
    }

    public void gameOver() {
        JOptionPane.showMessageDialog(this, "遊戲結束，得分：" + score, "遊戲結束", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) {
            racquet.moveLeft();
        } else if (keyCode == KeyEvent.VK_RIGHT) {
            racquet.moveRight();
        }
    }

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        HW12 window = new HW12();
        while (true) {
            window.ball.move(); // 修改這裡
            window.repaint();
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}