/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.zoo;

import java.awt.Dimension;
import java.awt.Point;

/**
 *
 * @author Ketchum
 */
public class Myzoo {
    
    
     public static void main(String[] args){
        
        //Lab5Zoo probs = new Lab5Zoo();
        Sprite myZoo=new Sprite("src/dargon.png", new Point (50, 50), new Dimension(150, 150));
       
        ZooWindow zoo= new ZooWindow();
 
        
    }
}
