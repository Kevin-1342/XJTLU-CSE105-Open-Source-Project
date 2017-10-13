//@Ketchum
package week5problem;

import java.util.Scanner;


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
        Input(true);
        // Test with a hardcoded value
        
    }
    
    private void Input(boolean once){
    if (once==true){
    System.out.println("Input the number");
    }
    Scanner keyboard = new Scanner(System.in);
    
    try{  
        int input=keyboard.nextInt();   
        drawTree(input);
    }catch(Exception e){  
        System.out.println("Invalid number,please re-enter an integer");  
        Input(false);
        
    }  
    
   
    }
    
    private void drawTree(int countIn){
        /* A method that will receive an integer and display a tree
        *  corresponding to that number of rows.
        */
        
        System.out.println(" Draw a tree from 1 to " +countIn);
        for(int i=0;i<countIn;i++){ 
        
            for(int j=countIn;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(i-k+1);
            }
            for(int l=0;l<i;l++){
                System.out.print(l+2);
            }
           System.out.print("\n"); 
        
        }
        drawAnother(true);
   
        
    }
    
    private void drawAnother(boolean twice){
    if (twice==true){
    System.out.println("Draw Another? y/n");
    }
    Scanner keyboard = new Scanner(System.in);
    
    try{  
        String input=keyboard.nextLine(); 
        if (input.equals("y")){
         Input(true);
        }
        else if(input.equals("n")){
         System.out.println("**********"+"\n"+"Goodbye!");
        }
        else{
        System.out.println("Invalid choice, please enter y/n");  
       drawAnother(false);
                
        }
        
    }catch(Exception e){  
        System.out.println("Invalid choice, please enter y/n");  
        Input(false);
        
    }  
    }
        
        }
    

    
