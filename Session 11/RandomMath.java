package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double number1 = Math.random()*100;
        int conNum1 = (int)number1;
        double number2 = Math.random()*100;
        int conNum2 = (int)number2;
        double total = conNum1 + conNum2;

        System.out.println(conNum1 +" + ? = "+total);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your answer here?");
        int answer = scan.nextInt();

        if(conNum2 == answer){
            System.out.println("Correct!");
        }else {
            System.out.println("Wrong!");
        }





    }
}
