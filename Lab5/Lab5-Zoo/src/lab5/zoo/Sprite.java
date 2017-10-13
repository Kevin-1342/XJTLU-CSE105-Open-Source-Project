/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.zoo;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Sprite {
    
    Point location;
    Dimension size;
    private BufferedImage myImage;
    private int moveX = 1, moveY = -1;
    
    public Sprite(String imagePath, Point loc, Dimension size){
        loadImage(imagePath);
        this.location = loc;
        this.size = size;
    }
    
    private void loadImage(String imagePath){     
        try {
            myImage = ImageIO.read(new File(imagePath));
            System.out.println("image loaded"+imagePath);
        } catch (IOException e) {
            System.out.println("Sprite: problem loading image");
            e.printStackTrace();
        }
    }
    
    public void move(int i){
        if(location.y>900)
        {
            moveY=-moveY;
        }
         if(location.y<50)
        {
            moveY=-moveY;
        }
         if(location.x>1750)
        {
            moveX=-moveX;
        }
         if(location.x<50)
        {
            moveX=-moveX;
        }
        
        location.x = location.x + moveX*(i+1);
        location.y = location.y + moveY*(i+1);
    }
    
    
    public void paintSprite(Graphics g, ImageObserver io){
        g.drawImage(myImage, location.x, location.y, size.width, size.height, io);
        //System.out.println("Sprite paint called");
    }
    
}
