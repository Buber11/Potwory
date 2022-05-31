import Buildings.Block;
import Defenders.AllDefenders;
import Defenders.Knight;
import Defenders.Militiaman;
import Defenders.Warrior;
import Monster.AllMonsters;
import Monster.Vampire;
import Monster.Werewolf;
import Monster.Zombie;
import People.Person;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

/*
	CFrame extends JPanel so that we can override the paint method. The paint method is necessary to use the simple
	drawing tools of the library!

	CFrame implements an ActionListener which adds the method actionPerformed. This method is invoked by the
	animation timer every 16ms.
*/
public class Frame extends JPanel implements ActionListener{

    ArrayList<Person> people = new ArrayList<Person>();
    ArrayList<AllMonsters> allMonsters = new ArrayList<>();
    ArrayList<AllDefenders> allDeffenders = new ArrayList<>();

    ArrayList<Block> allBlocks = new ArrayList<>();

    int number;









    public void paint(Graphics g) {

        super.paintComponent(g);
        super.paint(g);

        for(Person p: people) {
            p.paint(g);
        }
        for(AllMonsters p: allMonsters){
            p.paint(g);
        }
        for(Block p: allBlocks){
            p.paint(g);
        }

        for(AllDefenders p: allDeffenders){
            p.paint(g);
        }
        Block block = new Block(600,300);
        block.paint(g);


        for(int i=0;i< people.size();i++){
            for(int j=0;j< allMonsters.size();j++){
                people.get(i).collision(allMonsters.get(j));
                allMonsters.get(j).eatPerson(people.get(i));
            }
        }
        for(int i = 0; i < 15; i++){
            allDeffenders.get(i).collison(block);
        }
        for(int i=0; i<15;i++){
            allMonsters.get(i).collison(block);
        }
        for(int i=0;i<15;i++){
            for(int j=0;j<15;j++){
                allMonsters.get(i).attack(allDeffenders.get(j));
            }
        }
        for(int i=0;i<15;i++){
            for(int j=0;j<15;j++){
                allDeffenders.get(i).attack(allMonsters.get(j));
            }
        }

    }


    public Frame(int number) {
        this.number = number;
        JFrame frame = new JFrame("Simulation");
        Image image = new ImageIcon().getImage();
        frame.setSize(1000,1000);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for(int i = 0; i < number; i++) {
            people.add(new Person());
        }
        for(int i = 0 ;i <5 ; i++){
            allMonsters.add(new Vampire());
            allMonsters.add(new Zombie());
            allMonsters.add(new Werewolf());
            allDeffenders.add(new Knight());
            allDeffenders.add(new Militiaman());
            allDeffenders.add(new Warrior());
        }





        Timer t = new Timer(16, this);
        t.restart();

        frame.add(this);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        repaint();
    }



}
