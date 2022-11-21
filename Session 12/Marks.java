package com.company;

public class Marks extends Results {
    private int marks1;
    private int marks2;
    private int marks3;

    public void setMarks(int m1, int m2){
        marks1 = m1;
        marks2 = m2;
        System.out.println("This is from method1");
    }

    public void setMarks(int m1, int m2, int m3){
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
        System.out.println("This is from method2");
    }

    public void setMarks(int m1, int m2, double m3){
        marks1 = m1;
        marks2 = m2;
//        marks3 = m3;
        System.out.println("This is from method2");
    }

    public void setMarks(int m1){
        marks1 = m1;

        System.out.println("This is from method3");
    }





    private int total(){
        int total = marks1 + marks2 + marks3;
        return total;
    }

    public void printMarks(){
        System.out.println(total());
    }
}
