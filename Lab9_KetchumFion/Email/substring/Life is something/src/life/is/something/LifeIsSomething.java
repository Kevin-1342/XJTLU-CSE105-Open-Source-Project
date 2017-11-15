
package life.is.something;

/**
 *
 * @author Kaixuan
 */
public class LifeIsSomething {
    private String original;  
    private int stringLength;
    public String [] subWord = new String[6];
    

    public static void main(String[] args) {
        LifeIsSomething sub = new LifeIsSomething("Life is something we all share");
    }
    public LifeIsSomething(String original){
        this.original = original;
        //splitWord();
        subWorld();
    }
    private void splitWord(){
       String [] splitWord = getOriginal().split(" ");
       stringLength = splitWord.length;
       for(int i = 0; i<stringLength;i++){
           System.out.println(splitWord[i]);
       }
       
    }
    private void subWorld(){
        
         subWord[0]=getOriginal().substring(0, 4);
         subWord[1]=getOriginal().substring(5, 7);
         subWord[2]=getOriginal().substring(8, 17);
         subWord[3]=getOriginal().substring(18, 20);
         subWord[4]=getOriginal().substring(21, 24);
         subWord[5]=getOriginal().substring(25, 30);
       for(int i = 0; i<6;i++){
           System.out.println(subWord[i]);
       }   
    }
  
    public String getOriginal(){
        return original;
    }
    
}
