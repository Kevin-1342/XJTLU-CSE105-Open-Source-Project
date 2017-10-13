/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.zoo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ZooWindow extends Frame implements Runnable{
    Dimension screenSize;
    private Sprite[] sprites = new Sprite[2];
    private int spriteCounter = 1;

    //Constructor
    public ZooWindow(/*JoesZoo zoo*/){
        //myOwner = zoo;      
       addSprite("src/dargon.png", new Point (150, 150), new Dimension(150, 150));             
        //run();
        init();

    }

    public void addSprite(String imagePath, Point location, Dimension size){
        
        sprites[0] = new Sprite(imagePath, location, size);
        sprites[1] = new Sprite("src/cow.png", new Point(500,100), size); //note the additional argument: screenSize
       
        if(spriteCounter < sprites.length){
            //sprites[spriteCounter] = sprite;
            System.out.println("Sprite added at index: "+spriteCounter);
            spriteCounter++;
        }
        else{
            System.out.println("Sprite not added to sprite array; array full");
        }
    }

    private void init(){
        this.setVisible(true);
        this.setLayout(null);
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize.width, screenSize.height);
        this.setBackground(Color.black);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
               System.exit(0);
            }
        });
           run(); 
        
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < spriteCounter; i++) {
                sprites[i].move(i);
                //System.out.println(i);
            }
            repaint();
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics graphics){
        super.paint(graphics);
        for(int i = 0; i < spriteCounter; i++){
            sprites[i].paintSprite(graphics, this);
        }
    }
}
