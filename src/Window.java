import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public final class Window extends JFrame implements KeyListener{

	 public Picture panel = new Picture();
	 public Counter counterPanel = new Counter();
	 private static ImageIcon virus = new ImageIcon("Textures\\Virus.png");
	 
    public Window(){
        this.setSize(800, 650);
        this.setResizable(false);
        this.setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel, BorderLayout.EAST);
        this.add(counterPanel, BorderLayout.WEST);
        this.addKeyListener(this);
        this.setIconImage(virus.getImage());

        /**ImageIcon virus = new ImageIcon("C:\\Users\\fafuc\\Desktop\\Pelle\\Programmieren-Privat\\corona-spiel\\Textures\\ProfVsVirusExp.png");
        JLabel l1 = new JLabel (virus);
        l1.setSize(500, 500);
        JPanel feld = new JPanel();
        feld.add(l1);
        this.add(feld); // Label hinzufügen
		*/
    }
    
public void actionPerformed (ActionEvent ae) {
		
	}
	
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			panel.space(panel);
			
		}
    }

    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
        	panel.reset(panel); 
        	counterPanel.counter(counterPanel);
        }    
        
    }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
