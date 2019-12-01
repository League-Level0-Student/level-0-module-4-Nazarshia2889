package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		for(int i = 0;i<5;i++) {
		String first = JOptionPane.showInputDialog(null, "Give me a number");
		String second = JOptionPane.showInputDialog(null, "Give me another number");
		
		int num1 = Integer.parseInt(first);
		int num2 = Integer.parseInt(second);

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "How would you like to calculate these numbers?", "Simple Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);
		if(operation == 0) {
			add(num1, num2);
		}
		else if(operation==1) {
			subtract(num1, num2);
		}
		else if(operation==2) {
			multiply(num1, num2);
		}
		else if(operation==3) {
			divide(num1, num2);
		}
		}
	}



		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
    static void add(int num1,int num2) {
    int one = num1 + num2;
	JOptionPane.showMessageDialog(null,  num1 + " + " + num2 + " = " + one);
    }
    static void subtract(int num1,int num2) {
        int one = num1 - num2;
    	JOptionPane.showMessageDialog(null,  num1 + " - " + num2 + " = " + one);
        }
    static void multiply(int num1,int num2) {
        int one = num1 * num2;
    	JOptionPane.showMessageDialog(null,  num1 + " * " + num2 + " = " + one);
        }
    static void divide(int num1,int num2) {
        int one = num1 / num2;
    	JOptionPane.showMessageDialog(null,  num1 + " / " + num2 + " = " + one);
        }
}

	// 4. Create similar methods for subtraction, multiplication and division.
