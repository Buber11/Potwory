package Defenders;

import Monster.AllMonsters;

import java.awt.*;

public class Militiaman extends AllDefenders {
    public Militiaman(){
        super();
        this.level = 1;
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
