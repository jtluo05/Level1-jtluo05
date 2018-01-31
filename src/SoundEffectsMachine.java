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
	JButton drum=new JButton("drum");
	JButton cymbal=new JButton("cymbal");
	JFrame frame= new JFrame();
JPanel panel=new JPanel();
	public static void main(String[] args) {
	SoundEffectsMachine se=new SoundEffectsMachine();
	se.buildGUI();
}



void buildGUI() {

frame.setVisible(true);
frame.setSize(200,200);
frame.setName("Jordan's Frame");
frame.add(panel);
panel.add(drum);
panel.add(cymbal);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
drum.addMouseListener(this);
cymbal.addMouseListener(this);
}
public void mouseClicked(MouseEvent e) {

	
System.out.println("MOUSE CLICKED");
	JButton bc = (JButton) e.getSource();
	if (bc==drum) {
		playSound("drum sound.wav");
	}
	else if (bc==cymbal) {
		playSound("cymbal.wav");
	}
}
private void playSound(String fileName) {
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	sound.play();
}
}



