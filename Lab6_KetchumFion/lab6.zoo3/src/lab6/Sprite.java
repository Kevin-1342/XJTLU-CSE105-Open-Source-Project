/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author joelewis
 */
public class Sprite {
    Point2D.Double location;
    Dimension size;
    BufferedImage myImage;
    double moveX = 1, moveY = -1;
    Dimension bounds;
    
    public Sprite(String imagePath, Point loc, Dimension size, Dimension bounds){
        location = new Point2D.Double(loc.x, loc.y);
        this.size = size;
        loadImage(imagePath);
        this.bounds = bounds;
        //set random movement
        moveX = randomSign(1);
        moveY = randomSign(-1);
      
    }
    
    private double randomSign(double d){
        double ran = Math.random();
        if(ran > .5)d *= -1;
        return d;
    }
    
    private void loadImage(String imagePath){     
        try {
            myImage = ImageIO.read(new File(imagePath));
            System.out.println("Sprite: image loaded: " + imagePath);
        } catch (IOException e) {
            System.out.println("Sptite: problem loading: " + imagePath);
            e.printStackTrace();
        }
    }
    
    public void move(){
        location.x = location.x + moveX;
        location.y = location.y + moveY;
        if((location.x >= bounds.width-size.width) || (location.x <= 0)){
            moveX *= -1;
        }
        if((location.y >= bounds.height-size.height) || (location.y <= 0)){
            moveY *= -1;
        }
    }
    
    public void paintSprite(Graphics g, ImageObserver io){
        //NOTE: the image is scaled for each paintSprite call - wasteful!?
        //Graphics2D g2 = (Graphics2D)g;
        g.drawImage(myImage, (int)location.x, (int)location.y, size.width, size.height, io);
        //System.out.println("Sprite paintSprite called");
    }
    
    //public abstract void speak();

    /*public int getMoveX() {
        return moveX;
    }

    public void setMoveX(int moveX) {
        this.moveX = moveX;
    }

    public int getMoveY() {
        return moveY;
    }

    public void setMoveY(int moveY) {
        this.moveY = moveY;
    }*/
    
}
