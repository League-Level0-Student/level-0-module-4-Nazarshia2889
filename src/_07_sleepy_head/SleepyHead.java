package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        
         /*Ask the user for these values using a confirm dialog like the one below
         */
         
         
         
         int result = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         if(result == JOptionPane.YES_OPTION) {
        	 int sleep = JOptionPane.showConfirmDialog(null, "Are you on vacation?", null, JOptionPane.YES_NO_OPTION);
        	 if(sleep == JOptionPane.YES_OPTION) {
        		 JOptionPane.showMessageDialog(null, "You can sleep in.");
        	 }
        	 else if(sleep == JOptionPane.NO_OPTION) {
        		 JOptionPane.showMessageDialog(null, "Get up lazybones!");
        	 }
         }
         else if(result == JOptionPane.NO_OPTION) {
        	 JOptionPane.showMessageDialog(null, "You can sleep in.");
         }


        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
