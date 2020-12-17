import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Counter extends JPanel {
	private static ImageIcon counter = new ImageIcon("Textures\\Counter.png");
	private static JLabel counterLabel = new JLabel(counter);
	private static JPanel number = new JPanel(new GridBagLayout());
	private static JPanel tittleLabel = new JPanel();

	private JLabel[] labelNumberWest = numbers();
	private JLabel[] labelNumberCenter = numbers();
	private JLabel[] labelNumberEast = numbers();

	private GridBagConstraints gbc = new GridBagConstraints();

	final static boolean shouldFill = true;
	final static boolean shouldWeightX = true;
	final static boolean RIGHT_TO_LEFT = false;

	private int i1 = 0;
	private int i10 = 0;
	private int i100 = 0;

	public Counter() {

		this.setLayout(new BorderLayout());
		this.setMaximumSize(new Dimension(200, 200));

		JPanel mainPanel = new JPanel(new BorderLayout());
		JPanel secondaryPanel = new JPanel();
		secondaryPanel.setLayout(new GridBagLayout());

		gbc.gridx = 0;
		gbc.gridy = 0;
		// gbc.weightx = 0.2;
		gbc.anchor = GridBagConstraints.NORTH;
		number.add(labelNumberWest[0], gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		// gbc.weightx = 0.2;
		gbc.anchor = GridBagConstraints.NORTH;
		number.add(labelNumberCenter[0], gbc);

		gbc.gridx = 2;
		gbc.gridy = 0;
		// gbc.weightx = 0.2;
		gbc.anchor = GridBagConstraints.NORTH;
		number.add(labelNumberEast[0], gbc);

		tittleLabel.add(counterLabel, BorderLayout.NORTH);

		gbc.gridx = 0;
		gbc.gridy = 0;
		// gbc.weightx = 0.2;
		gbc.anchor = GridBagConstraints.NORTH;
		secondaryPanel.add(tittleLabel, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		// gbc.weightx = 0.2;
		gbc.anchor = GridBagConstraints.NORTH;
		secondaryPanel.add(number, gbc);

		mainPanel.add(secondaryPanel, BorderLayout.NORTH);

		this.add(mainPanel);

	}

	private JLabel[] numbers() {
		JLabel array[] = new JLabel[10];
		for (int x = 0; x < array.length; x++) {
			String name = "Textures\\Number\\n" + x + ".png";
			ImageIcon iconNumber = new ImageIcon(name);
			JLabel iconLabel = new JLabel(iconNumber);
			array[x] = iconLabel;
		}
		return array;

	}

	public void counter(Counter counter) {
		i1 = i1 + 1;
		if (i1 < 10) {
			counter.number.remove(labelNumberEast[i1 - 1]);
			gbc.gridx = 2;
			gbc.gridy = 0;
			// gbc.weightx = 0.2;
			gbc.anchor = GridBagConstraints.NORTH;
			counter.number.add(labelNumberEast[i1], gbc);
			SwingUtilities.updateComponentTreeUI(Main.window);
			return;

		}

		i10 = i10 + 1;
		if (i10 < 10) {
			counter.number.remove(labelNumberCenter[i10 - 1]);
			gbc.gridx = 1;
			gbc.gridy = 0;
			// gbc.weightx = 0.2;
			gbc.anchor = GridBagConstraints.NORTH;
			counter.number.add(labelNumberCenter[i10], gbc);
			i1 = 0;

			counter.number.remove(labelNumberEast[9]);
			gbc.gridx = 2;
			gbc.gridy = 0;
			// gbc.weightx = 0.2;
			gbc.anchor = GridBagConstraints.NORTH;
			counter.number.add(labelNumberEast[0], gbc);

			SwingUtilities.updateComponentTreeUI(Main.window);
			return;

		}
		i100 = i100 + 1;
		if (i100 < 10) {
			counter.number.remove(labelNumberCenter[9]);
			gbc.gridx = 1;
			gbc.gridy = 0;
			// gbc.weightx = 0.2;
			gbc.anchor = GridBagConstraints.NORTH;
			counter.number.add(labelNumberCenter[0], gbc);
			i1 = 0;

			counter.number.remove(labelNumberEast[9]);
			gbc.gridx = 2;
			gbc.gridy = 0;
			// gbc.weightx = 0.2;
			gbc.anchor = GridBagConstraints.NORTH;
			counter.number.add(labelNumberEast[0], gbc);
			i10 = 0;

			counter.number.remove(labelNumberWest[i100 - 1]);
			gbc.gridx = 0;
			gbc.gridy = 0;
			// gbc.weightx = 0.2;
			gbc.anchor = GridBagConstraints.NORTH;
			counter.number.add(labelNumberWest[i100], gbc);

			SwingUtilities.updateComponentTreeUI(Main.window);
			return;

		}

	}

}
