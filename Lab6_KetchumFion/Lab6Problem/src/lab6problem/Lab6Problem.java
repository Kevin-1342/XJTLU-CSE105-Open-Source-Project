/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6problem;

import java.util.Scanner;

/**
 *
 * @author Ketchum
 */
public class Lab6Problem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Lab6Problem lab6 = new Lab6Problem();
    }
    
    public Lab6Problem(){
        input();
        // Add your method calls here in the constructor
        
       // Method call for calculate interest 
       // System.out. println(calculateInterest(40000) + " Months to reach limit") ;
    }
    
    public void input(){
        System.out.println("Input the number");
        try{
           Scanner keyboard = new Scanner(System.in); 
           int input=keyboard.nextInt();
           loops(input);
        }catch(Exception e){
            input();
        }
    }
    
    public void loops(int input){
        for(int i=0;i<input;i++){
            System.out.print("\n");
            for(int j=0;j<input;j++){
                System.out.print(i+1+j*(i+1));
                System.out.print("\t");
            }
            
        }
    }
}