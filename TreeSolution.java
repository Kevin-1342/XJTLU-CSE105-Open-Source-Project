
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ANDREW.ABEL
 */
public class TreeSolution {

    public static void main(String[] args) {

        Week5ProblemsSolution1 probs = new Week5ProblemsSolution1();

    }

    public TreeSolution() {
        /* Constructor, where all methods are called
         * Receives valid input from keyboard, calls display method
         * to draw.  Checks for a new input, redraw if needed
         * if user is finished, displays a goodbye message
         */
        boolean cont = true;
        // While loop is for full solution.  Initial solution doesn't need it
        while (cont == true) {
            int size = getNumber(); // Get an integer from a user input method
            drawTree(size); // Pass in value (can use hardcoded initially)
            cont = getContinue(); // Another method to take a string input and check
                                  // returns a boolean for whether to continue
        }
        // At end of while loop, displays goodbye message
        System.out.println("************");
        System.out.println("Goodbye!");

    }

    private void drawTree(int countIn) {
        /* A method that will receive an integer and display a tree
        *  corresponding to that number of rows.
         */

        // Mainly a diagnostic method
        System.out.println("Draw a tree from 1 to " + countIn);

        // First, loop for the number of rows wanted, using input
        // i.e. if countIn is 5, will loop for 5 rows
        for (int i = 1; i <= countIn; i++) {
            
            // This loop will handle number of spaces.  Counts inversely
            // i.e. input = 5, will do 5 spaces in r1, 4 in r2
            // Best to do last as it requires more thought
            for (int l = countIn; l > i; l--) {
                // Displays the right number of spaces
               // System.out.print(" ");
            }
            // Counts down, easiest one to do
            // Links to number of rows (i), 
            // input = 5, in r1, will do 1, r2, will do 21
            for (int j = i; j > 0; j--) {
                // Displays the counting down
              //  System.out.print(j);
            }
            // Counts up, do second
            // Again, links to number of rows
            // Note, starts at 2
            for (int k = 2; k <= i; k++) {
                // Displays counting up
              //  System.out.print(k);
            }
            // Ends line
            System.out.println(i);
        }

    }

    private int getNumber() {
        /* 
         * Input integer method.  This is a full and comprehensive one
         * Students wouldn't be expected to check for full validation
         * A simple nextInt() would do.
        */
        Scanner numIn = new Scanner(System.in);
        System.out.println("Input the number");
        int inp = -1;
        while (inp < 0 || inp > 9) {
            if (numIn.hasNextInt()) {
                // Assign value
                inp = numIn.nextInt();
            } else {
                System.out.println("Invalid number, please re-enter an integer");
                numIn.next();   // get the non integer from scanner
                inp = -1;
            }
        }
        return inp;
    }

    private boolean getContinue() {
        /* 
         * Checking for continue.  This is part of the extra work challenge
         * Most basic version is to input a line from the scanner and check it is.equals()
         * to Y or N.  Many ways to do it.
        */
        Scanner numIn = new Scanner(System.in);
        System.out.println("Draw Another? y/n");
        String inp = "x";
        while (!inp.equals("y") && !inp.equals("n")) {
            inp = numIn.next();
            inp = inp.toLowerCase();
            if ((!(inp.equals("y"))) && (!(inp.equals("n")))) {
                System.out.println("Invalid choice, please enter y/n");
            }
        }
        if (inp.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

}
