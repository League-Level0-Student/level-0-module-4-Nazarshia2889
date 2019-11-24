package _11_own_adventure;

import javax.swing.JOptionPane;

public class story {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "It's a normal day. You grab your usual cup of coffee and eat your breakfast. "
				+ "Suddenly, you can hear the sound of an aircraft land in your backyard.");
		int option = JOptionPane.showOptionDialog(null, "What will you do?", "Normal day.", 0, JOptionPane.INFORMATION_MESSAGE, 
				null, new String[] {"Walk outside", "Continue drinking your coffee", "Look through the window"}, null);
		
		if(option == 0) {
			JOptionPane.showMessageDialog(null, "Your realize that there is a spaceship in your backyard! However, it has not landed yet"
					+ " and the spaceship squishes you, until you lift your body from your bed. You've been dreaming this whole time.");
		}
		else if(option == 1) {
			JOptionPane.showMessageDialog(null, "You take a sip of your coffee. Ouch!. It's hot! "
					+ "It was so painful that you realize that your still on your bed. You've been dreaming this whole time.");
		}
		else if(option == 2) {
			JOptionPane.showMessageDialog(null, "There is a spaceship! It has just landed right in your own backyard!");
			
			int nextoption = JOptionPane.showConfirmDialog(null, "Do you want to go outside?", "Story", JOptionPane.YES_NO_OPTION);
			
			if(nextoption == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "You got outside ");
				int optiono = JOptionPane.showConfirmDialog(null, "Do you touch the spaceship?", "Story", JOptionPane.YES_NO_OPTION);
			    if(optiono == JOptionPane.YES_OPTION) {
			    	JOptionPane.showMessageDialog(null, "The spaceship activates a blaring alarm. "
			    			+ "The alarm mysteriously gets fainter and fainter. Suddenly, you wake up on your bed. You've been asleep this whole time.");
			    }
			    else if(optiono == JOptionPane.NO_OPTION) {
			    	JOptionPane.showMessageDialog(null, "You take a sip of your coffee.  Ouch!. It's hot! \"\n" + 
			    			"+ \"It was so painful that you realize that your still on your bed. You've been dreaming this whole time.");
			    }
						
			}
			
			else if(nextoption == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "You take a sip of your coffee. Ouch!. It's hot!" + 
						 " It was so painful until you realize that your still on your bed. You've been dreaming this whole time.");
			}
		}
	}

}
