package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Player> playerlist = new ArrayList<>();

        int func;
        int todel = 0;
        int cont = 0;
        int dex = 0;
        int lv = 0;
        String names = " ";

        playerlist.add(new Player (1,"Verdanzo",1));
        playerlist.add(new Player (2,"Alno",10));
        playerlist.add(new Player (3,"Red",99));

        playerlist.forEach(System.out::println);
        int size = playerlist.size();
        System.out.println("Size of list = " + size);

        System.out.println("What would you like to do?");
        System.out.println("1. Remove");
        System.out.println("2. Contains & IndexOf");

        func = scan.nextInt();

        if(func == 1) {
            del(todel,playerlist);
        }
        if(func == 2) {
            conind(cont,dex,lv,names,playerlist);
        }
    }

    private static void del(int todel, List<Player> playerlist) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to delete");
        todel = scan.nextInt();

        playerlist.remove(todel);

        playerlist.forEach(System.out::println);
        int size = playerlist.size();
        System.out.println("Size of list = " + size);
    }

    private static void conind(int cont,int dex,int lv, String names, List<Player> playerlist) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ID");
        cont = scan.nextInt();
        System.out.println("Enter Name");
        names = scan.next();
        System.out.println("Enter Level");
        lv = scan.nextInt();
        System.out.println(playerlist.contains(new Player(cont,names,lv)));
        System.out.println(playerlist.indexOf(new Player(cont,names,lv)));
    }
}
