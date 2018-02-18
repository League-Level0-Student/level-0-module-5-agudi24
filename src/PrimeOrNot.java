import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	for (int i = 1; i < 2; i++) {
		boolean prime = true;
		String userNum = JOptionPane.showInputDialog("Type in any number:");
		int num = Integer.parseInt(userNum);

	for (int j = 2; j < num; j++) {
		if(num%j==0) {
		prime = false;
		break;
		}
		
	}
		if(prime == true) {
			JOptionPane.showMessageDialog(null, "Your number is prime!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Your number is not prime!");
		}
	}
}}

