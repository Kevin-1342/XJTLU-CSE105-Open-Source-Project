/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Container;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


/**
 *
 * @author joelewis
 */
public class ImageDisplay extends Container {
    protected Point location;
    protected Dimension size;
    BufferedImage myImage;
    
    
    //Constructor
    public ImageDisplay(String imagePath, Point loc, Dimension size){
        this.location = loc;
        this.size = size;
        loadImage(imagePath);
    }
    
    private void loadImage(String imagePath){     
        try {
            myImage = ImageIO.read(new File(imagePath));
            System.out.println("ImageDisplay: image loaded");
        } catch (IOException e) {
            System.out.println("ImageDisplay: problem loading image");
            e.printStackTrace();
        }
    }
    
    @Override
    public void paint(Graphics g){
        //NOTE: the image is scaled for each paint call - wasteful!?
        g.drawImage(myImage, 0, 0, size.width, size.height, this);
        //System.out.println("Sprite paint called");
    }

    //encapsulation + getters and setters
    public Point getLocation(){
        return location;
    }
    
    @Override
    public Dimension getSize(){
        return size;
    }
    
    public int getX() {
        return location.x;
    }

    public void setX(int x) {
        location.x = x;
    }

    public int getY() {
        return location.y;
    }

    public void setY(int myY) {
        location.y = myY;
    }

    @Override
    public int getWidth() {
        return size.width;
    }

    public void setWidth(int myWidth) {
        size.width = myWidth;
    }

    @Override
    public int getHeight() {
        return size.height;
    }

    public void setHeight(int myHeight) {
        size.height = myHeight;
    }
    
}
