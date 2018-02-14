import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Practice implements MouseListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button = new JButton();

	public static void main(String[] args) {
		Practice p = new Practice();
		p.buildGUI();
	}

	void buildGUI() {
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		label.setText("Jordan");
		panel.add(label);
		button.setText("RENAME");
		panel.add(button);
		button.addMouseListener(this);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("YOU CLICKED IT!!!!!!!!! CONGRATS!!!!!!");
	if (label.getText()=="Jordan") {
		label.setText("JORDAN IS AWESOME");
	}
	else if (label.getText()=="JORDAN IS AWESOME") {
		label.setText("Jordan");
	}
	frame.pack();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
