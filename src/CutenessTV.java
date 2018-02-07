import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton duck = new JButton("duck");
	JButton frog = new JButton("frog");
	JButton unicorn = new JButton("unicorn");

	public static void main(String[] args) {
		CutenessTV ctv = new CutenessTV();
		ctv.buildGUI();

	}

	void buildGUI() {
		frame.setVisible(true);
		
		
		frame.add(panel);
		panel.add(duck);
		panel.add(frog);
		panel.add(unicorn);
		duck.addMouseListener(this);
		frog.addMouseListener(this);
		unicorn.addMouseListener(this);
		frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	

	
	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			 URI uri = new URI("https://youtu.be/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
if (e.getSource() == duck) {
			showDucks();
		} else if (e.getSource() == frog) {
			showFrog();
		} else if (e.getSource() == unicorn) {
			showFluffyUnicorns();
		}
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
