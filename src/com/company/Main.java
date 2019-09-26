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
        char operator = input.next().charAt(0);
        Student std=new Student(name,reg_number,fatherIncome,hafizQuran,positionHolder);
          if (fatherIncome < 10000 && reg_number == 68) {
            System.out.println("need based scholarship is eligibal");

        } else if (fatherIncome < 10000 && reg_number <= 78 && hafizQuran == true) {
            System.out.println("hafiz e Quran scholarship is eligibal");

        }
        else if (reg_number==90 && positionHolder == false){
            System.out.println("position holder scholarship is eligibal");
        }


    }
}
