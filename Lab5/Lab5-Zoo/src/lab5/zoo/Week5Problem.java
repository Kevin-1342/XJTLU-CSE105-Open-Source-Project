/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANDREW.ABEL
 */
public class Week5Problem {
    
    
    public static void main(String[] args){
        
        Week5Problem probs = new Week5Problem();
        
    }
    
    
    public Week5Problem(){
        /* Constructor, where all methods are called
         * Receives valid input from keyboard, calls display method
         * to draw.  Checks for a new input, redraw if needed
         * if user is finished, displays a goodbye message
        */
        drawTree(5);// Test with a hardcoded value
        
    }
    
    private void drawTree(int countIn){
        /* A method that will receive an integer and display a tree
        *  corresponding to that number of rows.
        */
        
        System.out.println(" Draw a tree from 1 to " +countIn);
        
    }
    
}
