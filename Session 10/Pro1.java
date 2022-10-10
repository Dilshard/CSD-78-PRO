package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter no 1?");
        int n1 = scan.nextInt();

        System.out.println("Enter no 2?");
        int n2 = scan.nextInt();

        System.out.println("Enter no 3?");
        int n3 = scan.nextInt();

        int answer = 0;

        if(n1 > n2){
            if(n1 > n3){
                answer = n1;
            }else{
                answer = n3;
            }
        }else{
            if(n2 > n3){
                answer = n2;
            }else {
                answer = n3;
            }
        }

        System.out.println("Highest No : "+answer);


    }
}
