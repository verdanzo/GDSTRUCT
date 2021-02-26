package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Pause;
        Random rand = new Random();

        int x = rand.nextInt(4);
        int action = rand.nextInt(3);

	 cardstack stack = new cardstack(30);
	 cardstack hand = new cardstack(30);
	 cardstack discard = new cardstack(30);

	    stack.push(new cards(1,"one"));
        stack.push(new cards(2,"two"));
        stack.push(new cards(3,"three"));
        stack.push(new cards(4,"four"));
        stack.push(new cards(5,"five"));
        stack.push(new cards(6,"six"));
        stack.push(new cards(7,"seven"));
        stack.push(new cards(8,"eight"));
        stack.push(new cards(9,"nine"));
        stack.push(new cards(10,"ten"));
        stack.push(new cards(11,"eleven"));
        stack.push(new cards(12,"twelve"));
        stack.push(new cards(13,"thirteen"));
        stack.push(new cards(14,"fourteen"));
        stack.push(new cards(15,"fifteen"));
        stack.push(new cards(16,"sixteen"));
        stack.push(new cards(17,"seventeen"));
        stack.push(new cards(18,"eighteen"));
        stack.push(new cards(19,"nineteen"));
        stack.push(new cards(20,"twenty"));
        stack.push(new cards(21,"twenty one"));
        stack.push(new cards(22,"twenty two"));
        stack.push(new cards(23,"twenty three"));
        stack.push(new cards(24,"twenty four"));
        stack.push(new cards(25,"twenty five"));
        stack.push(new cards(26,"twenty six"));
        stack.push(new cards(27,"twenty seven"));
        stack.push(new cards(28,"twenty eight"));
        stack.push(new cards(29,"twenty nine"));
        stack.push(new cards(30,"thirty"));

        //draw
        while(stack.size() > 0) {
            if (action == 0) {
                System.out.println("Popping from Deck");
                int xx = x + 1;
                System.out.println("popping " + xx + " cards");
                for (int i = 0; i < x + 1; i++) {
                    System.out.println("popping: " + stack.pop());
                    hand.push(stack.pop());
                }
                System.out.println("Hand Cards: ");
                hand.printcards();
                Pause = scan.next();
            }
            //draw from discard
            if (action == 1) {
                System.out.println("Popping from Discard");
                int xx = x + 1;
                System.out.println("Popping " + xx + " cards");
                for (int i = 0; i < x + 1; i++) {
                    System.out.println("Popping from Discard: " + discard.pop());
                    discard.push(discard.pop());
                }
                System.out.println("Discard Piles Cards: ");
                hand.printcards();
                Pause = scan.next();
            }
            //discard
            if (action == 2) {
                System.out.println("Discarding from Hand");
                int xx = x + 1;
                System.out.println("Discarding " + xx + " cards");
                for (int i = 0; i < x + 1; i++) {
                    System.out.println("Discarding: " + hand.pop());
                    discard.push(hand.pop());
                }
                System.out.println("Discard Piles Cards: ");
                discard.printcards();
                Pause = scan.next();
            }
        }
    }
}
