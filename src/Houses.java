import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot bob = new Robot("mini");
	static Random num = new Random();

	public static void main(String[] args) {

		bob.setSpeed(100);
		bob.turn(180);
		bob.move(200);
		bob.turn(90);
		bob.move(275);
		bob.setAngle(0);
		for (int i = 0; i < 10; i++) {
			int h = num.nextInt(2);
if (h==0) {
	height="small";
}
			house(h + 100);

		}
	}

	static void house(String height) {
	int sml=500;
		if (height.equals("small")) {
			 sml = 60;
		}
		if (height.equals("meduim")) {
			 sml = 120;
		}
		if (height.equals("large")) {
			 sml = 250;
		}
		bob.setAngle(0);
		bob.penDown();
		bob.setPenColor(Color.green);
		bob.move(sml);
		bob.turn(90);
		bob.move(50);
		bob.turn(90);
		bob.move(sml);
		bob.turn(270);
		bob.move(30);



		
		
		
		
		
		
		
		
		
		
	}
}
