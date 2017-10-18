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
public class calculatingInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calculatingInterest cal = new calculatingInterest();
    }
    public calculatingInterest(){
        cal();
    }
    
    public void cal(){
        double money = 30000.0;
        int month = 0;
        while(money<50000){
            month++;
            money *= 1.04;
            System.out.println("Month "+ month+" Balance is: "+ money);
        }
        System.out.println(month+" months to reach limit"); 
        
    }
}
