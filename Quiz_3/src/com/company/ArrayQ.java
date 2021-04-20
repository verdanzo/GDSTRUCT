package com.company;

import java.util.NoSuchElementException;

public class ArrayQ {

    private Player[] que;
    private int front;
    private int back;

    public ArrayQ(int capacity){

        que = new Player[capacity];

    }

    public void add(Player player){

        if(back == que.length){
            Player[] newArray = new Player[que.length * 2];
            System.arraycopy(que,0,newArray,0,que.length);
            que=newArray;
        }
        que[back] = player;
        back++;
    }

    public Player remove(){
        if(size() == 0){
            throw new NoSuchElementException();
        }

        Player removedplayer = que[front];
        que[front] = null;
        front++;

        if (size() == 0){
            front = 0;
            back = 0;
        }
        return removedplayer;
    }

    public Player peek(){
        if (size() == 0){
            throw new NoSuchElementException();

        }
        return que[front];
    }
    public int size () {
        return back-front;
    }

    public void print(){
        for (int i = front; i<back;i++){
            System.out.println(que[i]);
        }
    }
}
