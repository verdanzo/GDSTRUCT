package com.gdstruct.module1;
import java.util.Scanner;


public class Main {
    public static int NoSort;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want to sort?: ");
        NoSort = scan.nextInt();

        int [] ToSort = new int [NoSort];

        for(int i = 0; i < ToSort.length; i++){
            System.out.println("Enter a number: ");
            int input = scan.nextInt();
            ToSort[i] = input;
        }


        System.out.println("Choose a sorting method: [1] BubbleSort Descending , [2] SelectionSort Descending [3] Modified SelectionSort:");
        int choice = scan.nextInt();

        if(choice ==1){
            System.out.println("before bubble sort:");
            print(ToSort);

            bubblesort(ToSort);

            System.out.println("\n\nafter bubble sort:");
            print(ToSort);
        }
        if (choice ==2){
            System.out.println("before selection sort:");
            print(ToSort);

            selectionsort(ToSort);

            System.out.println("\n\nafter selection sort:");
            print(ToSort);
        }
        if (choice ==3){
            System.out.println("before selection sort:");
            print(ToSort);

            modifiedselection(ToSort);

            System.out.println("\n\nafter selection sort:");
            print(ToSort);
        }
    }

    private static void bubblesort(int[] arr){
        for (int lastsorted = arr.length - 1; lastsorted > 0; lastsorted--){
            for (int i = 0; i < lastsorted; i++){
                if(arr[i] < arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    private static void selectionsort (int[] arr){
        for(int lastsorted = arr.length -1; lastsorted > 0; lastsorted--){
            int largest = 0;
            for (int i = 1; i <= lastsorted; i++){
                if(arr[i] < arr[largest]){
                    largest = i;
                }
            }
            int temp = arr[lastsorted];
            arr[lastsorted] = arr[largest];
            arr[largest] = temp;
        }
    }
    private static void modifiedselection (int[] arr){
        for(int lastsorted = arr.length - 1; lastsorted > 0; lastsorted --){
            int smallest = 0;
            for (int i = lastsorted; i >= 0; i--){
                if(arr[i] < arr[smallest]){
                    smallest = i;
                }
            }
            int temp = arr[lastsorted];
            arr[lastsorted] = arr[smallest];
            arr[smallest] = temp;
        }
    }
    private static void print (int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }



}
