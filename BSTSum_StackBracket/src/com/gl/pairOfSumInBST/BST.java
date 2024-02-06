package com.gl.pairOfSumInBST;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The {@code BST} class is an Implementation of a
 * Binary Search Tree using Doubly LinkedList.
 */

public class BST {
    static Node root;
    static Node newNode;

    static ArrayList<Integer> nodeList = new ArrayList<>();

    static void insert(Node root, Node newNode) {
        if (newNode.data > root.data) {
            if (root.right == null) root.right = newNode;
            else insert(root.right, newNode);
        } else {
            if (root.left == null) root.left = newNode;
            else insert(root.left, newNode);
        }
    }

    static void inOrderTraversal(Node root) {
        if (root == null)
            return;

        inOrderTraversal(root.left);
        nodeList.add(root.data);
        inOrderTraversal(root.right);
    }

    public void create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Nodes");
        int size = sc.nextInt();

        for (int i = 1; i <= size; i++) {
            System.out.println("Enter data for node " + i);
            int data = sc.nextInt();
            newNode = new Node(data);
            if (root == null)
                root = newNode;
            else
                insert(root, newNode);
        }

        inOrderTraversal(root);
        System.out.println(nodeList);
    }

    public void pairOfSum(int sum) {
        int count = 0;
        for (int i = 0; i < nodeList.size(); i++) {
            for (int j = i + 1; j < nodeList.size(); j++) {
                if (nodeList.get(i) + nodeList.get(j) == sum && !nodeList.get(i).equals(nodeList.get(j))) {
                    System.out.println("[" + nodeList.get(i) + " , " + nodeList.get(j) + "]");
                    count = count + 1;
                }
            }
        }

        if (count == 0)
            System.out.println("Pair NOT FOUND");
        else
            System.out.println("Total Pairs " + count);
    }
}
