package loops;

import javax.swing.JOptionPane;

public class Ex38 {

	public static void main(String[] args) {

		int userInput = 0, output;

		do {

			userInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Input value: "));

			if (userInput <= 0 || userInput == 1) {

				JOptionPane.showMessageDialog(null, "User input must be greater than 0 and 1!");
				
				return;

			}

			if (userInput % 2 == 0) {

				output = userInput / 2;

				JOptionPane.showMessageDialog(null, "Output for Even Value: " + output);
			}

			else if (userInput % 2 == 1) {

				output = userInput * 3 + 1;

				JOptionPane.showMessageDialog(null, "Output for Odd Value: " + output);

			}

		} while (userInput != 1 || userInput <= 0);

	}

}
