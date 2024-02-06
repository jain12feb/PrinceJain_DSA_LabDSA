package com.gl.balancedBracket;

import java.util.Scanner;

public class DriverApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Expression");
        String expression = sc.next();

        ValidateBrackets vc = new ValidateBrackets();
        boolean result = vc.isBalanced(expression);

        if (expression.length() % 2 == 0)
            if (result) System.out.println("The entered String has Balanced Brackets");
            else System.out.println("The entered Strings do not contain Balanced Brackets");
        else
            System.out.println("Incomplete Expression");
    }
}