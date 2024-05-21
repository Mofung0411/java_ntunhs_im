package Project12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Ball extends JPanel {
    private static final int ballsize = 60;
    int x = 0;
    int y = 0;
    int step = 8;
    int incx = step;
    int incy = step;
    private HW12 window;

    public Ball(HW12 w) {
        this.window = w;
    }
    
    public static int  getBallsize() {
    	return ballsize;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, ballsize, ballsize);
    }

    private boolean collision() {
        return getBounds().intersects(window.racquet.getBounds());
    }

    
    void move()
    {
    	if (collision())
    	{
    		incy = -30;
    		y =  window.racquet.getTopY() - ballsize;
    		window.score++;
    	}
    	if (x + incx > window.getWidth() - ballsize || x + incx < 0) {
            incx = -incx; // 改變 X 軸方向，使球反彈
        }

        // 檢查是否觸及上下邊界
        if (y + incy > window.getHeight() - ballsize || y + incy < 0) {
            incy = -incy; // 改變 Y 軸方向，使球反彈
        }
    
    x += incx;
    y += incy;
}

    public void paint(Graphics2D g) {
        g.setColor(Color.blue);
        g.fillOval(x, y, ballsize, ballsize);
    }
}