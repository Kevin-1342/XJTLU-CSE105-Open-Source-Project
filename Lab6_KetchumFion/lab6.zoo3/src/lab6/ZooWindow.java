/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import javax.swing.JFrame;


/**
 *
 * @author joelewis
 */
 public class ZooWindow extends JFrame implements Runnable{
    Dimension screenSize;
    Enclosure[] myEnclosures = new Enclosure[8];
    int enclosureCounter = 0;
    
    //Constructor
    public ZooWindow(){
        init();       
    }
    
    protected Enclosure addEnclosure(String imagePath, Point location, Dimension size, String name){
        Enclosure field = new Enclosure(imagePath, location, size, name);
        this.add(field);
        field.setLocation(field.location);
        field.setSize(field.size);
        myEnclosures[enclosureCounter] = field;
        enclosureCounter++;
        return field;
    }
    
    
    private void init(){
        this.setVisible(true);      
        this.setLayout(null);
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize);
        this.getContentPane().setBackground(Color.GREEN);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < enclosureCounter; i++) {
                myEnclosures[i].moveAnimals();
            }
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }   
}
