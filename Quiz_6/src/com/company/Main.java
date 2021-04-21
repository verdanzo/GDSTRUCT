package com.company;

public class Main {

    public static void main(String[] args) {
        Puno puno = new Puno();

        puno.insert(5);
        puno.insert(6);
        puno.insert(3);
        puno.insert(3);
        puno.insert(1);
        puno.insert(8);
        puno.insert(9);

        puno.traverseInOrder();
        puno.Max();
        puno.Min();
    }
}
