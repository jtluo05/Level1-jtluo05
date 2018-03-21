import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JackInTheBox implements ActionListener{
JButton button=new JButton();
JFrame frame=new JFrame();
 JLabel labelWithImage=new JLabel();
JPanel panel=new JPanel();
int NumOfTimes=0;
JFrame frame1=new JFrame();
JPanel panel1=new JPanel();
Random random=new Random();
int random1;
public static void main(String[] args) {
	JackInTheBox jitb= new JackInTheBox();
	jitb.buildGUI();
	
}


void buildGUI(){

	frame.setVisible(true);
	frame.setSize(300, 300);
	frame.setName("Jordan's Frame");
	frame.add(panel);
	frame.setTitle("Jack In The Box");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
panel.add(button);
button.setText("CLICK ME");
button.setSize(20, 7);
button.addActionListener(this);

random1=random.nextInt(10);
}
 void showJack() {
	String jack="jack.jpg";
frame1.setVisible(true);
labelWithImage = createLabelImage(jack);
frame1.add(panel1);
panel1.add(labelWithImage);
frame1.pack();
playSound("creepy-noise.wav");
 }


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("CLICKED");
NumOfTimes=NumOfTimes+1;
if (NumOfTimes==random1) {
	showJack();
}
}
private  JLabel createLabelImage(String fileName) {
	URL imageURL = getClass().getResource(fileName);
	if (imageURL == null) {
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
private void playSound(String soundFile) { 
    try {
         AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
         sound.play();
    } catch (Exception e) {
         e.printStackTrace();
    }
}

}



