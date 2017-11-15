
package mail;

import java.util.Scanner;

/**
 *
 * @author Ketchum
 */
public class Mail {
    private boolean again = true;
    private String input;
    private String[] split;
    private String[] splitPoint;
    private boolean mailContain;
    
    
    
    public static void main(String[] args) {
        Mail email = new Mail();
    }
    public Mail(){
        while(again==true){
           input();
           if(checkContain()&&checkFirst()&&checkLength()&&checkLast()){
              System.out.println("true");
           }
           else{
              System.out.println("false"); 
           }
//        System.out.println(checkContain());
//        System.out.println(checkFirst());
//        System.out.println(checkLength());
//        System.out.println(checkLast());
        
        Scanner askAgain = new Scanner(System.in);
        System.out.println("Again? Y/N");        
        String again = "null";
        while (!again.equalsIgnoreCase("Y") && !again.equalsIgnoreCase("N")){
            again=askAgain.nextLine();
            if(!again.equalsIgnoreCase("Y") && !again.equalsIgnoreCase("N")){
                System.out.println("Wrong input, please input Y or N, again?"); 
            }
        }
        if(again.equalsIgnoreCase("n")){
           this.again=false;
           System.out.println("Goodbye!");
           
        }
       }
     
    }
    private void input(){
        System.out.println("input:");
        Scanner input = new Scanner(System.in);
        this.input = input.nextLine();
    }

    private boolean checkContain() {
        split = getInput().split("@");
        String point = split[0];
        splitPoint = point.split("\\.");
        try{         
        return (split.length==2&&splitPoint.length==2);  
        
        }catch (Exception e) {
            return false;           
        }
        
    }
    
    private boolean checkLast() {
        if(getInput().endsWith("@xjtlu.edu.cn")||getInput().endsWith("@student.xjtlu.edu.cn")){
            return true;
        }
        else{
            return false;
        }   
    }
    
    private boolean checkFirst() {
        char first = '.';
        if(getInput().charAt(0)==first){
            return false;
        }
        else{
            return true;
        }       
    }
    
     private boolean checkLength() {
      
        if(getInput().length()>40){
            return false;
        }
        else{
            return true;
        }       
    }
    
    public String getInput(){
        return input;
    }
}