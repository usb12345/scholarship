package com.company;

public class Student{
    String name;
    String reg_number;
    int fatherIncome;
    boolean hafizQuran;
    boolean positionHolder;
    public Student(String name, String reg_number, int fatherIncome, boolean hafizQuran, boolean positionHolder)
    {
        this.name=name;
        this.fatherIncome=fatherIncome;
        this.hafizQuran=hafizQuran;
        this.positionHolder=positionHolder;
        this.reg_number=reg_number;
    }

    public String getName() {
        return name;
    }

    public String getReg_number() {
        return reg_number;
    }

    public int getFatherIncome() {
        return fatherIncome;
    }

    public boolean isHafizQuran() {
        return hafizQuran;
    }

    public boolean isPositionHolder() {
        return positionHolder;
    }



}
