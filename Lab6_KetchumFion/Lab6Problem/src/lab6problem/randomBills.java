/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6problem;

/**
 *
 * @author Ketchum
 */
public class randomBills {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        randomBills bills = new randomBills();
    }
    
    public randomBills(){
        outprint();
}
    public void outprint(){
        double bills;
        int salary = 50;
        double balance=50;
        for(int i = 0; i<10;i++){
            System.out.println("*****************************");
            bills = getRandom();
            System.out.println("Month: "+(i+1));
            System.out.println("Bills: "+bills);
            System.out.println("Salary: "+salary);
            
            System.out.println("Balance: "+(salary-bills+balance));
            
        
            System.out.println("*****************************");
            balance = salary-bills+balance;
        }
       
    }
    
    public double getRandom(){
        double random;
        random = Math.random()*10;   
        return random;    
    }
    
}
