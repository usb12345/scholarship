package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;
        String reg_number;
        int fatherIncome;
        boolean hafizQuran;
        boolean positionHolder;
        Scanner input = new Scanner(System.in);
        System.out.println("tell your name");
        name = input.next();
        System.out.println("registration:");
        reg_number = input.next();
        System.out.println("father income");
        fatherIncome = input.nextInt();
        System.out.println("hafizquran");
        hafizQuran = input.nextBoolean();
        System.out.println("position holder");
        positionHolder = input.nextBoolean();
        Student std=new Student(name,reg_number,fatherIncome,hafizQuran,positionHolder);


    }
}
