package com.ifElse;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        double number1,number2;

        System.out.println("Enter number1= ");
        number1= input.nextDouble();

        System.out.println("Enter number2 = ");
        number2 = input.nextDouble();

        if(number1>number2){
            System.out.println("Number1 is greater");
        }else{
            System.out.println("Number2 is greater");
        }

    }
}
