package Monster;

import Buildings.Block;
import Deffenders.AllDeffenders;
import People.Person;

import java.awt.*;
import java.util.Random;

public abstract class AllMonsters  {
    protected int x, y;
    protected int  vx, vy;

    protected int level;

    protected boolean alive = true;
    public AllMonsters() {
        Random rand = new Random();
        x = rand.nextInt(100);
        y = rand.nextInt(300);
        vx = rand.nextInt(5);
        vy = rand.nextInt(5);
    }
    public void attack(AllDeffenders p2) {

        Rectangle per1 = new Rectangle(p2.getX(),p2.getY(), 20,20);
        Rectangle per2 = new Rectangle(this.x,this.y, 20,20);

        //collision check
        if(per1.intersects(per2) && (p2.getLevel()>this.level)) {
            this.alive = false;
        }

    }
    public void eatPerson(Person p2){
        Rectangle per1 = new Rectangle(p2.getX(),p2.getY(), 20,20);
        Rectangle per2 = new Rectangle(this.x,this.y, 20,20);

        if(per1.intersects(per2)){
            level +=1;
        }
    }
    public void collison(Block p2){
        Rectangle per1 = new Rectangle(p2.getX(),p2.getY(), 100,100);
        Rectangle per2 = new Rectangle(this.x,this.y, 20,20);

        if(per1.intersects(per2)){
            vx *= -1;
            vy *= -1;

        }
    }

    public abstract void paint(Graphics g);

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLevel() {
        return level;
    }
}