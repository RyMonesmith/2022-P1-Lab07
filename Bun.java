import java.awt.*;
import java.applet.*;
public class Bun {
    public static void drawTop(Graphics g) {
        g.setColor(new Color(182, 148, 71));
        g.fillArc(500, 290, 150, 50, 0, 180);

    }

    public static void drawBottom(Graphics g) {
        g.setColor(new Color(182, 148, 71));
        g.fillArc(500, 400, 150, 50, 0, -180);


    }
    public static void drawSeeds(Graphics g) {
        g.setColor(new Color(227, 227, 170));
        g.fillOval(540, 300, 20, 10);
        g.fillOval(580, 290, 15, 7);
        g.fillOval(600, 305, 12, 7);
}




}
