
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image URL”)
		String pic = "https://i.ytimg.com/vi/GA99FQwLdHw/maxresdefault.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component picture;
		// 3. use the "createImage()" method below to initialize your Component
		picture = createImage(pic);
		// 4. add the image to the quiz window
		quizWindow.add(picture);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("What is the answer to this riddle?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equalsIgnoreCase("10")) {
			JOptionPane.showMessageDialog(null, "CORRECT!!!!!!!!!");
System.out.println("CORRECT!!!!!!!!!!!");
		}
		
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT!!!!!!!!!");
System.out.println("INCORRECT!!!!!!!!!");
		}
		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
quizWindow.remove(picture);

		// 10. find another image and create it (might take more than one line of code)
String PICTURE="https://i.pinimg.com/736x/5a/4c/c0/5a4cc0b62e685e8d411d53205783662e--tricky-riddles-riddles-with-answers.jpg";
		// 11. add the second image to the quiz window
picture=createImage(PICTURE);		quizWindow.setVisible(true);
		quizWindow.add(picture);
// 12. pack the quiz window
quizWindow.pack();

		// 13. ask another question
String ANSWER=JOptionPane.showInputDialog("What is the answer to this riddle?");
		// 14+ check answer, say if correct or incorrect, etc.
if (ANSWER.equalsIgnoreCase("lions")) {
JOptionPane.showMessageDialog(null, "CORRECT!!!!!!!!!");
	System.out.println("CORRECT!!!!!!!!!!!");
}
else {
	JOptionPane.showMessageDialog(null, "INCORRECT!!!!!!!!!");
	System.out.println("INCORRECT!!!!!!!!!");
}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
