package com.stack;


import java.util.Stack;

public class SortStackUsingAuxStack {
  /* 3 5 6 1 4
     1 3 4 5 6 */


    public static void main(String[] args) {
        Stack<Integer> iStack = new Stack<>();
        iStack.push(3);
        iStack.push(5);
        iStack.push(6);
        iStack.push(1);
        iStack.push(4);
        Stack<Integer> sortedStk = sortStack(iStack);
        //System.out.println(sortedStk.toString());
    }

    public static Stack<Integer> sortStack(Stack<Integer> iStack) {
        Stack<Integer> auxStack = new Stack<>();
        while (!iStack.isEmpty()) {
            int tmp = iStack.pop();
            while (!auxStack.isEmpty() && auxStack.peek() > tmp) {
                iStack.push(auxStack.pop());
            }
            auxStack.push(tmp);
        }
        return auxStack;
    }
}
