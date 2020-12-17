import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Picture extends JPanel {

	private static ImageIcon virus = new ImageIcon("Textures\\ProfVsVirus.png");
	private static ImageIcon exp = new ImageIcon("Textures\\ProfVsVirusExp.png");
	private static ImageIcon tittle = new ImageIcon("Textures\\Tittle.png");
	private static ImageIcon befehl = new ImageIcon("Textures\\Befehl.png");
	private static JLabel virusLabel = new JLabel(virus);
	private static JLabel expLabel = new JLabel(exp);
	private static JLabel tittleLabel = new JLabel(tittle);
	private static JLabel befehlLabel = new JLabel(befehl);

	public JPanel top = new JPanel();
	public JPanel center = new JPanel();
	public JPanel bottum = new JPanel();

	public Picture() {
		this.setLayout(new BorderLayout());
		this.setSize(600, 600);

		top.add(tittleLabel);
		center.add(virusLabel);
		bottum.add(befehlLabel);

		this.add(top, BorderLayout.NORTH);
		this.add(center, BorderLayout.CENTER);
		this.add(bottum, BorderLayout.SOUTH);

	}

	public void space(Picture panel) {
		panel.repaint();
		panel.center.remove(virusLabel);
		panel.repaint();
		panel.center.add(expLabel);
		SwingUtilities.updateComponentTreeUI(Main.window);

	}

	public void reset(Picture panel) {
		panel.repaint();
		panel.center.remove(expLabel);
		panel.repaint();
		panel.center.add(virusLabel);
		SwingUtilities.updateComponentTreeUI(Main.window);
	}

}
