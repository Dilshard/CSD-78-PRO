package com.company;

public class Student extends Marks {
     private String stNo;
     private String stName;
     private String email;

    public void setStNo(String stNo){
        this.stNo = stNo;
    }
    public void setStName(String stName){
        this.stName = stName;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public void print(){
        System.out.println(this.stNo);
        System.out.println(this.stName);
        System.out.println(this.email);
        System.out.println();
    }
}
