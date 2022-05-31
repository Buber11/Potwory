package Defenders;

import java.awt.*;

public class Warrior extends AllDefenders {
    public Warrior(){
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
        if(alive == true){
            g.setColor(Color.blue);
            g.fillOval(x,y,20,20);
        }
    }
}