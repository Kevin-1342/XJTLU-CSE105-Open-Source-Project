/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author Ketchum
 */
public class Lab8 {
private BotWeek7_orig robot;

    public static void main(String[] args) {
        Lab8 person = new Lab8();
       
    }
    public Lab8(){
        System.out.println("ask question");
        BotWeek7_orig robot = new BotWeek7_orig();
         Scanner question = new Scanner(System.in);
        String myQuestion = question.nextLine();
        String answer = robot.processQuestion(myQuestion.toLowerCase());
        System.out.println(answer);
    }

}
