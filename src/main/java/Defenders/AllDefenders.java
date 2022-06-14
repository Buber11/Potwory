package Defenders;

import Buildings.Block;
import Monster.AllMonsters;

import java.awt.*;
import java.util.Random;

public abstract class AllDefenders {
    protected int x,y;
    protected int vx,vy;
    protected int level;

    protected boolean alive = true;


    public AllDefenders() {
        Random rand = new Random();
        x = rand.nextInt(800);
        y = rand.nextInt(600);
        vx = rand.nextInt(5);
        vy = rand.nextInt(5);
    }
    public abstract void paint(Graphics g);



    public void attack(AllMonsters p2) {

        Rectangle per1 = new Rectangle(p2.getX(),p2.getY(), 20,20);
        Rectangle per2 = new Rectangle(this.x,this.y, 20,20);


        if(per1.intersects(per2) && (p2.getLevel()>=this.level)) {
            this.alive = false;
        }
        if(per1.intersects(per2) && (p2.getLevel()<this.level)){
            level +=1;
        }

    }
    public void collison(Block p2){
        Rectangle per1 = new Rectangle(p2.getX(),p2.getY(), 100,100);
        Rectangle per2 = new Rectangle(this.x,this.y, 10,10);

        if(per1.intersects(per2)){
            vx *= -1;
            vy *= -1;

        }
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLevel() {
        return level;
    }
    public boolean isAlive() {
        return alive;
    }
}