import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	Random ran = new Random();
	
	void showButton() {

		System.out.println("BUTTON");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button);
		button.setText("CLICK HERE FOR YOUR FORTUNE!!!");
frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int num = ran.nextInt(5);
if (num == 1) {
			JOptionPane.showMessageDialog(null, "You will grow up to be what you always"
					+ " wanted to be (a garbage man). You are very exicted and happy to start your new job.");
		} else if (num == 2) {
			JOptionPane.showMessageDialog(null, "You will some how win the lottery, and then win another lottery."
					+ "and then misplace both of your tickets so you cant pick up your money. Then you "
					+ "figure out that you, yet again, win another lottery for 30 million dallars. This time you make sure no to "
					+ "lose your lottery ticket. Lucky you!");
		} else if (num == 3) {
			JOptionPane.showMessageDialog(null,
					"You are walking down the street when the police arrest you. They think "
							+ "you stole 300 billion dolars from the nearby bank. You go to court for what you didnt do. They charge"
							+ "you GUILTY even though you didn't do it. You go to jail for 50 years. Bye.");
		} else if (num == 4) {
			JOptionPane.showMessageDialog(null, "You will not die in the next 10 seconds.");

		}
	}
}
