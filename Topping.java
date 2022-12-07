import java.awt.*;
import java.applet.*;
public class Topping {
    public static void drawLettus(Graphics g) {
        g.setColor(new Color(184, 245, 121));
        g.fillOval(475, 310, 200, 70);
    }

    public static void drawPickle(Graphics g) {
        g.setColor(new Color(107, 159, 45));
        g.fillOval(475, 340, 60, 40);
        g.fillOval(535, 340, 60, 40);
        g.fillOval(595, 340, 60, 40);
    }
    public static void drawTomato(Graphics g) {
        g.setColor(new Color(241, 20, 38));
        g.fillArc(500, 360, 150, 50, 0, 180);

    }
    public static void drawOnion(Graphics g) {

    }
}