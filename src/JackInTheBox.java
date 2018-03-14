import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
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
public static void main(String[] args) {
	JackInTheBox jitb= new JackInTheBox();
	jitb.buildGUI();
	
}


void buildGUI(){

	frame.setVisible(true);
	frame.setSize(200, 200);
	frame.setName("Jordan's Frame");
	frame.add(panel);
	frame.setTitle("Jack In The Box");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
panel.add(button);
button.setText("CLICK ME");
button.setSize(20, 7);
button.addActionListener(this);
}
 void showJack() {
	String jack="jack.jpg";
frame1.setVisible(true);
labelWithImage = createLabelImage(jack);
	
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("CLICKED");
NumOfTimes=NumOfTimes+1;
if (NumOfTimes==5) {
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
}



