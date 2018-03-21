import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Checkpoint implements KeyListener{
JFrame frame=new JFrame();
JPanel panel=new JPanel();
	public static void main(String[] args){
	Checkpoint check=new Checkpoint();
	check.buildGUI();
}
void buildGUI() {
	frame.add(panel);
frame.setVisible(true);
frame.setSize(300, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.addKeyListener(this);
	
}
static void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
         }
    }
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	speak("ouch");
	System.out.println("OUCH");
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}



