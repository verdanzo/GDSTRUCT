package com.company;

import java.util.EmptyStackException;

public class cardstack {
    private cards[] stack;
    private int top;

    public cardstack(int capacity){
        stack = new cards[capacity];
    }
    public void push(cards Cards){
        if (top == stack.length){
            cards[] newstack = new cards[2 * stack.length];
            System.arraycopy(stack, 0 , newstack , 0, stack.length);
            stack = newstack;
        }
        stack [top++] = Cards;
    }
    public cards pop(){
        if(empty()){
            throw new EmptyStackException();
        }
        cards poppedcard = stack[--top];
        stack[top] = null;
        return poppedcard;
    }
    public cards peeky(){
        if(empty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }
    public boolean empty(){
        return top == 0;
    }
    public void printcards (){

        for (int i = top - 1; i >= 0;i--){
            System.out.println(stack[i]);
        }
    }

    public int size() {
        int sizes;
        return sizes = stack.length;
    }
}
