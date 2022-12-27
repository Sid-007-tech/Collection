package com.collection.List;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack= new Stack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
    }
}
