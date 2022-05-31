package Buildings;

import java.awt.*;

public class Block {
    private int x,y;
    public Block(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void paint(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(x,y,100,100);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
