package com.gl.balancedBracket;

import java.util.Stack;

public class ValidateBrackets {
    public boolean isBalanced(String str) {
        Stack<Character> charStack = new Stack<>();
        char[] charArray = str.toCharArray();

        for (char ch : charArray) {
            if (ch == '{' || ch == '(' || ch == '[')
                charStack.push(ch);
            else if (charStack.empty())
                return false;
            else {
                if (ch == ')' && charStack.peek() == '(')
                    charStack.pop();
                else if (ch == ']' && charStack.peek() == '[')
                    charStack.pop();
                else if (ch == '}' && charStack.peek() == '{')
                    charStack.pop();
                else
                    return false;
            }
        }
        return charStack.empty();
    }
}
