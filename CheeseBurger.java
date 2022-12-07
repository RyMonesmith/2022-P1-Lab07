import java.awt.*;
import java.applet.*;


    public class CheeseBurger extends Applet  {

        public void paint(Graphics g){
            Backround.drawSky(g);
            Backround.drawPlate(g);
            Backround.drawCloud(g);

            Bun.drawTop(g);
            Bun.drawBottom(g);
            Bun.drawSeeds(g);

            Meat.drawBurger(g);
            Meat.drawCheese(g);

            Topping.drawLettus(g);
            Topping.drawPickle(g);
            Topping.drawTomato(g);
            Topping.drawOnion(g);






        }
    }



