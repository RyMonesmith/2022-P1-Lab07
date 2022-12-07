import java.awt.*;
import java.applet.*;
public class Meat {

        public static void drawBurger(Graphics g) {
            g.setColor(new Color(77, 46, 1));
            g.fillRect(510, 390, 130, 40);
            g.setColor(new Color(115, 81, 21));
            g.fillOval(550, 390, 10, 10);
            g.fillOval(560, 410, 10, 10);
            g.fillOval(590, 400, 10, 10);
            g.fillOval(610, 395, 10, 10);
        }

        public static void drawCheese(Graphics g) {
            g.setColor(new Color(229, 219, 46));
            g.fillRect(515, 380, 120, 10);
        }

    }
