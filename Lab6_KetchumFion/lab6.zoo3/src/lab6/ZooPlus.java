/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.awt.Dimension;
import java.awt.Point;

/**
 *
 * @author joelewis
 */
public class ZooPlus {

    
    public static void main(String[] args) {
        ZooPlus zp = new ZooPlus();
    }
    
    public ZooPlus(){
        ZooWindow gui = new ZooWindow();
        
        Enclosure cowField = gui.addEnclosure("res/grass1.jpg", new Point(50, 50), new Dimension(500, 300), "Cow field");
        Enclosure fishField = gui.addEnclosure("res/water1.jpg", new Point(600, 50), new Dimension(400, 300), "Cow field");
        for(int i = 0; i < 3; i++){
            cowField.addAnimal("Cow");
        }
         for(int i = 0; i < 3; i++){
            fishField.addAnimal("Fish");
        }

        new Thread(gui).start();
    }


}
