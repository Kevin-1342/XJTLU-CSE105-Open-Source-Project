/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author joelewis
 */
public class Enclosure extends ImageDisplay{
    //private ArrayList<Animal> myAnimals;
    Animal[] myAnimals = new Animal[5];
    int animalCounter = 0;
    private String name;
    Point centerPoint;
    
    public Enclosure(String imagePath, Point location, Dimension size){
        super(imagePath, location, size);
        centerPoint = new Point(this.size.width/2, this.size.height/2);
    }
    
    public Enclosure(String imagePath, Point location, Dimension size, String name){
        super(imagePath, location, size);
        centerPoint = new Point(this.size.width/2, this.size.height/2); //useful for placing new animals
        this.name = name;
    }
    
    public boolean addAnimal(String type){
        Animal animal;
        boolean success = false;
        if(type.equals("Cow")){
            animal = new Animal("Cow", Animal.COW_PATH, centerPoint,Animal.COW_SIZE, this.size);
            success = true;
        }
        else if(type.equals("Fish")){
            animal = new Animal("Fish", Animal.FISH_PATH, centerPoint,Animal.FISH_SIZE, this.size);
            success = true;
        }
        else{
            System.out.println("Sorry, no animals of type ["+type+"] available");
            return success;
        }
        if(success){
            myAnimals[animalCounter] = animal; 
            animalCounter++;
        }
        return success;
    }
    
    public void moveAnimals(){
        for(int i = 0; i < animalCounter; i++){
            myAnimals[i].move();
            
        }
        repaint();
    }
    
    public void paint(Graphics g){
        super.paint(g);
         for(int i = 0; i < animalCounter; i++){
            myAnimals[i].paintSprite(g, this);
        }
    }
    
    public String getName(){
        return name;
    }
}
