/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author joelewis
 */
public class BotWeek7_orig {
     final String name = "Joe";   
     final String country = "England";
     final String feeling = "fine";
     final LocalDate dateOfBirth = LocalDate.of(1986, Month.AUGUST,4);
     String[] myLikes = {"wine", "music", "books", "sailing"};
     int[] likesHowMuch = {2, 3, 3, 4};
     String[] myDislikes = {"rap music", "Donald Trump", "tofu", "football"};
     int[] dislikesHowMuch = {3, 4, 3, 2};
    
    //create a no-args constructor
    public BotWeek7_orig(){
        //do you understand what this is doing?

    }
    //Encapsulate the instance variables
    //create getter methods only (Why?) for name, country, age (you will have to calculate-see lecture). 
    public String getName(){
        return name;
    }
    public String getCountry (){
        return country;
    }
    public int getAge(){
        int age;
        LocalDate today = LocalDate.now();
        Period p = Period.between(this.dateOfBirth, today);
        age = p.getYears();
        return age;
    }
    
    //create method to process questions
    public String processQuestion(String question){
        String response;
        question = question.toLowerCase();
        if((question.contains("what")) && (question.contains("name"))){
	response = getName();
        }
        else if ((question.contains("what")) && (question.contains("country"))){
        response = getCountry(); 
        }
        else if(((question.contains("how")) && (question.contains("old")))){
        int age = getAge();    
        response = String.valueOf(age);
        }
        else if(((question.contains("how")) && (question.contains("are")))){   
        response = "I'm good!";
        }
        else{
        response = "I'm not sure.";
        }
        
        
        
       
        
        //complete here
        return response;
    }
    
}
