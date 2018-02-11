import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		//1. Create a robot
		Robot robo = new Robot();
		//2. Set the speed to 100
		robo.setSpeed(100);
		for (int i = 1; i < 6; i++) {
			
		int colorChoice=JOptionPane.showOptionDialog(null, "Choose a color", "Color Palette", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red","Green", "Blue"}, 0);
		if(colorChoice == 1) {
			robo.setPenColor(0, 255, 0);
		}
		if(colorChoice == 0) {
			robo.setPenColor(255, 0, 0);
		}
		if(colorChoice == 2) {
			robo.setPenColor(0, 0, 255);
		}
		//3. Set the pen color of the robot according to the value of the colorChoise variable
		robo.penDown();
		robo.turn(72);
		robo.move(100);
		robo.turn(72);
		robo.move(100);
		robo.turn(72);
		robo.move(100);
		robo.turn(72);
		robo.move(100);
		robo.turn(72);
		robo.move(100);
		}
		}
		//4. Ask the use how many polygons they want to be drawn.
		
		//5. Use the robot to draw the number of polygons the user requested.
		
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}


