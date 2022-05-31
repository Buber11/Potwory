package Defenders;

import java.awt.*;

public class Knight extends AllDefenders{
    public Knight(){
        super();
        this.level= 3;
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
            g.fillRect(x,y,20,20);
        }
    }


}