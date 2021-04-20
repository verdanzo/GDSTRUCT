package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

		Random rand = new Random();
		int rando = rand.nextInt(6);
		int round = 1;

		ArrayQ que = new ArrayQ(5);
		while (round <= 10) {
			System.out.println("round: " + round);
				if (que.size() < 5) {

					for (int i = 0; i < rando; i++) {
						que.add(new Player(i+1, "Player # " + i+1, i+1 * 3));
				}
				que.print();
					if (que.size() >= 5) {
						for (int i = 0; i < 5; i++) {
						que.remove();
						}
						round++;
				}
					System.out.println("Current");
					System.out.println("---------------------------------------------");
					que.print();
					System.out.println("---------------------------------------------");
			}
		}
		System.out.println("Succesfully Finished 10 Games");
    }
}
