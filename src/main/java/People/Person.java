package People;

import Monster.AllMonsters;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Person {
    protected int  x, y;
    protected int vx, vy;
    protected  boolean alive = true;


    public Person() {
        Random rand = new Random();
        x = rand.nextInt(800);
        y =rand.nextInt(600);
        vx = rand.nextInt(5);
        vy = rand.nextInt(5);
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
            g.setColor(Color.white);
            g.fillOval(x, y, 10, 10);
        }
    }
    public void collision(AllMonsters p2) {

        Rectangle per1 = new Rectangle(p2.getX(),p2.getY(), 20,20);
        Rectangle per2 = new Rectangle(this.x,this.y, 20,20);

        //collision check
        if(per1.intersects(per2)) {
            this.alive = false;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
