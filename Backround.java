import java.awt.*;

public class Backround {
    public static void drawPlate(Graphics g) {
        g.setColor(new Color(233, 255, 255));
        g.fillOval(475, 430, 200, 40);
    }
    public static void drawSky(Graphics g) {
        g.setColor(new Color(124, 221, 248));
        g.fillRect(0, 0, 2000, 1000);
    }
    public static void drawCloud(Graphics g) {
        g.setColor(new Color(233, 255, 255));
        g.fillOval(65, 60, 50, 50);
        g.fillOval(75, 60, 50, 50);
        g.fillOval(80, 70, 50, 50);
        g.fillOval(90, 60, 50, 50);
        g.fillOval(60, 30, 50, 50);
        g.fillOval(100, 60, 50, 50);
        g.fillOval(150, 60, 50, 50);
        g.fillOval(130, 70, 50, 50);


    }

}
