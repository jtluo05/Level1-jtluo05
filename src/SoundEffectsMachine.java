import java.applet.AudioClip;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.charset.MalformedInputException;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SoundEffectsMachine extends MouseAdapter {
	JButton dogbark = new JButton("dog bark");
	JButton bomb = new JButton("bomb");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	public static void main(String[] args) {
		SoundEffectsMachine se = new SoundEffectsMachine();
		se.buildGUI();
	}

	void buildGUI() {

		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.setName("Jordan's Frame");
		frame.add(panel);
		frame.setTitle("Sound Effect Machine");
		panel.add(dogbark);
		panel.add(bomb);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dogbark.addMouseListener(this);
		bomb.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {

		System.out.println("MOUSE CLICKED");
		JButton bc = (JButton) e.getSource();
		if (bc == dogbark) {
			playSound("dog bark.wav");
		} else if (bc == bomb) {
			playSound("bomb.wav");
		}
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
}
