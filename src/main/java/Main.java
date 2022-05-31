import javax.swing.*;

public class Main {
    public static void main(String[] args){
        int number = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbę ludzi w mieście"));
        Frame frame = new Frame(number);

    }
}
