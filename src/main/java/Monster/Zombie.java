package Monster;

import Monster.AllMonsters;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Zombie extends AllMonsters {
    public Zombie() {
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
        if(alive){
            g.setColor(Color.red);
            g.fillRect(x,y,20,20);
        }




    }


}
