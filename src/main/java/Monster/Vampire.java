package Monster;

import java.awt.*;

public class Vampire extends AllMonsters {


    public Vampire() {
        super();
        this.level = 2;


    }
    public void paint(Graphics g) {

        x += vx;
        y += vy;
        if (x < 0 || x >= 990) {
            vx *= -1;
        }
        if (y < 0 || y >= 790) {
            vy *= -1;
        }

        if(alive) {
            g.setColor(Color.RED);
            g.fillOval(x,y,20,20);
        }

    }


}