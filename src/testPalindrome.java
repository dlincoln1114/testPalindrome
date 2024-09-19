// Name: David Lincoln
// Class: CS /Section# Online
// Term: Fall 2024
// Instructor: Umama Tasnim
// Assignment: 4

import java.util.Scanner;
import java.util.*;

public class testPalindrome {
    public class Queue{
        private Object[] items;
        private int first,last,count;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int selection;
        do{
            //menu
            System.out.println();
            System.out.println("-----MAIN MENU-----");
            System.out.println("1. Test character-by-character palindrome");
            System.out.println("2. Test word-by-word palindrome");
            System.out.println("3. Exit program");
            System.out.println();
            System.out.print("Enter option number: ");
            selection = input.nextInt();

            switch(selection){
                case 1:
                    break;
                case 2:
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid selection");
            }
        }while(selection != 3);
    }
}