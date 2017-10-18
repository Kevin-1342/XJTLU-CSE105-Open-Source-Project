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
public class Animal extends Sprite {
    static final String COW_PATH = "res/cow.png";
    static final Dimension COW_SIZE = new Dimension(100, 100);
    static final String FISH_PATH = "res/fish.png";
    static final Dimension FISH_SIZE = new Dimension(128, 96);

    String whatAnimal;
    String name;
    
    String imagePath;    //fixed to one image - for now
    
    public Animal(String path, Point location, Dimension size, Dimension constraints){
        super(path, location, size, constraints);
    }
    
    public Animal(String type, String path, Point location, Dimension size, Dimension constraints){
        super(path, location, size, constraints);
        whatAnimal = type;
    }   
}
