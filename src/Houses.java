import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot bob = new Robot("mini");
	static Random num = new Random();
static String height;
static String color;
public static void main(String[] args) {

		bob.setSpeed(100);
		bob.turn(180);
		bob.move(200);
		bob.turn(90);
		bob.move(275);
		bob.setAngle(0);
		for (int i = 0; i < 10; i++) {
			int h = num.nextInt(3);
			if (h == 0) {
				 height = "small";
			}
			if (h == 1) {
				 height = "medium";
			}
			else if (h == 2) {
				 height = "large";
			}
		
			int c = num.nextInt(3);
			 if (c == 1) {
				 color = "green";
			}
			else if (c == 2) {
				 color = "blue";
			}
			else if (c == 0) {
				 color = "red";
			}
			else {
				color= "green";
			}
			house(height,color);

		}
	}

	static void house(String height, String color) {
		int sml = 500;
		
		if (height.equals("small")) {
			sml = 60;
		}
		else if (height.equals("medium")) {
			sml = 120;
		}
		else if (height.equals("large")) {
			sml = 250;
	}
		
		bob.setAngle(0);
		bob.setPenWidth(10);
		bob.penDown();
	bob.setWindowColor(Color.black);
	if (color.equals("blue")) {
		bob.setPenColor(Color.blue);
	}
	else if (color.equals("green")) {
		bob.setPenColor(Color.WHITE);
	}
	else 	if (color.equals("red")) {
		bob.setPenColor(Color.red);
	}
		bob.move(sml);
		bob.turn(90);
		bob.move(50);
		bob.turn(90);
		bob.move(sml);
		bob.turn(270);
	bob.setPenColor(Color.green);	
	bob.move(30);

	}
void drawPointyRoof() {
bob.turn(45);	
	bob.move(35);
	bob.turn(90);
	bob.move(35);
	bob.turn(45);
}
void drawFlatRoof() {
	bob.turn(90);
bob.move(50);
bob.turn(90);
}








}
