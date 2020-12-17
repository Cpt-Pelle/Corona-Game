import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.*;

public final class Window extends JFrame{

    public Window(){
        this.setSize(600, 600);
        this.setMinimumSize(new Dimension(600, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon virus = new ImageIcon("Virus.png");
        JLabel l1 = new JLabel (virus);
        l1.setSize(500, 500);
        JPanel feld = new JPanel();
        feld.add(l1);
        this.add(feld); // Label hinzufügen

    }
}
