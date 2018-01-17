import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class BodyPartQuiz {
	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/league/Desktop/antonio-brown.jpg";
	String secondImage = "/Users/league/Desktop/kevin.png";
	String thirdImage = "/Users/league/Desktop/Sane.png";
	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
       window.setSize(200, 600);
		
      // Make an int variable to hold the score.

			int score=0;
       // Ask the user who this person is and store their answer
		String AB=JOptionPane.showInputDialog("What is their name (only first name)?");
       // If they got the answer right:
		if (AB.equalsIgnoreCase("antonio " )) {
			
		
       // -- Tell them they are correct.
		JOptionPane.showMessageDialog(null, "YOU ARE CORRECT!!!!!! CONGRATULATIONS!!!");
       // -- Increase the score by 1
		JOptionPane.showMessageDialog(null, "Your score is 1.");
		score=score+1;
		}
       // Otherwise:
		else {
			
		
       // -- Tell them they are wrong
		JOptionPane.showMessageDialog(null,"INCORRECT!!!!!");
       // Use the method below to show the next image
      	
       	
       	// Show the score
		JOptionPane.showMessageDialog(null, "Your score is 0.");
       // .... repeat for all your images.....
				}

		showNextImage() ;
       	window.setSize(500,500);
 		
		
		//window.setSize(200,200);
		String kevin=JOptionPane.showInputDialog("What is their name (only first name)?");
	     
			if (kevin.equalsIgnoreCase("Kevin" )) {
		
			JOptionPane.showMessageDialog(null, "YOU ARE CORRECT!!!!!! CONGRATULATIONS!!!");
	       
			JOptionPane.showMessageDialog(null, "Your score is 1.");
			score=score+1;
			}
	  
			else {
				
			JOptionPane.showMessageDialog(null,"INCORRECT!!!!!");
	       
			JOptionPane.showMessageDialog(null, "Your score is 0.");
		}
		
	
			
			
			
			showNextImage() ;
	       	window.setSize(500,500);
	 		
			
		
			String Sane=JOptionPane.showInputDialog("What is their name (only last name)?");
		     
				if (Sane.equalsIgnoreCase("Sane" )) {
			
				JOptionPane.showMessageDialog(null, "YOU ARE CORRECT!!!!!! CONGRATULATIONS!!!");
		       
				JOptionPane.showMessageDialog(null, "Your score is 1.");
				score=score+1;
				}
		  
				else {
					
				JOptionPane.showMessageDialog(null,"INCORRECT!!!!!");
		       
				JOptionPane.showMessageDialog(null, "Your score is 0.");
			}
			}
	
		
	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}
	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}
	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}
	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}
	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;
	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
	imageLabel = loadImage(secondImage);
	imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}
	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}
