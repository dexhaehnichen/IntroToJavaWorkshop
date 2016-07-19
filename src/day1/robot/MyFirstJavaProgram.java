package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot robot = new Robot();
robot.hide();
robot.setRandomPenColor();
robot.sparkle();
robot.setSpeed(4);
robot.penDown();
for (int i = 0; i < 4; i++) {
robot.move(300);
robot.turn(90);
}
robot.penUp();
robot.move(150);
robot.turn(90);
robot.move(150);
robot.show();
robot.turn(270);
robot.unSparkle();
		
	}
}
