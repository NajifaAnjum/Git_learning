package com.add;

import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);   //declare scanner object
        double number1, number2,result_add, result_div;

        System.out.println("Enter first number = ");
        number1 = input.nextDouble();

        System.out.println("Enter second number = ");
        number2 = input.nextDouble();

        result_add = number1+number2;
        System.out.println("The addition result is = "+result_add);

        result_div = number1/number2;
        System.out.println("The division result is = " +result_div);
    }
}
