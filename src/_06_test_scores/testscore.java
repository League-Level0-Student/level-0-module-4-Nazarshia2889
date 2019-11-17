package _06_test_scores;

import javax.swing.JOptionPane;

public class testscore {
	public static void main(String[] args) {
		String test = JOptionPane.showInputDialog(null, "What was your test score?");
		double x = Double.parseDouble(test);
		if(x>70) {
			JOptionPane.showMessageDialog(null, "Wow, you must have studied really hard for that test!");
		}
		else if(x<70) {
			JOptionPane.showMessageDialog(null, "Maybe study harder next time!");
		}
		
	}

}
