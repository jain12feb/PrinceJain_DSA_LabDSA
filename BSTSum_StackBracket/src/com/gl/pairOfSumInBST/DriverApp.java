package com.gl.pairOfSumInBST;

import java.util.Scanner;

public class DriverApp {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.create();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sum value whose pair to be found");
        int sum = sc.nextInt();
        tree.pairOfSum(sum);
    }
}
