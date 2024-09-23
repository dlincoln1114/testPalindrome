// Name: David Lincoln
// Class: CS /Section# Online
// Term: Fall 2024
// Instructor: Umama Tasnim
// Assignment: 4

import java.util.Scanner;
import java.util.Arrays;

public class testPalindrome {

    public void charbycharPalindrome(String input) {
        boolean isPalindrome = true;

        //input normalization
        input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        //palindrome check
        int n = input.length();
        for (int i = 0; i < n / 2; i++) {
            if (input.charAt(i) != input.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Results
        if (isPalindrome) {
            System.out.println("Judgement: Palindrome");
        } else {
            System.out.println("Judgement: Not Palindrome");
        }
    }

    public void wordbywordPalindrome(String input) {
        boolean isPalindrome = true;

        //string normalization
        String wordInput = input.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();
        String[] words = wordInput.split("\\s+");

        //Palindrome check
        int n = words.length;
        for (int i = 0; i < n / 2; i++) {
            if (!words[i].equals(words[n - 1 - i])) {
                isPalindrome = false;
                break;
            }
        }

        // Result
        if (isPalindrome) {
            System.out.println("Judgement: Palindrome");
        } else {
            System.out.println("Judgement: Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        testPalindrome test = new testPalindrome();

        int selection;
        do {
            // Menu
            System.out.println();
            System.out.println("-----MAIN MENU-----");
            System.out.println("1. Test character-by-character palindrome");
            System.out.println("2. Test word-by-word palindrome");
            System.out.println("3. Exit program");
            System.out.println();
            System.out.print("Enter option number: ");
            selection = input.nextInt();

            switch (selection) {
                case 1:
                    // Input
                    System.out.print("Enter a string: ");
                    input.nextLine(); // Consume leftover newline
                    String option1 = input.nextLine();

                    // Display
                    System.out.println();
                    System.out.println("You selected: Option 1");
                    System.out.println("You entered: " + option1);
                    test.charbycharPalindrome(option1);
                    break;

                case 2:
                    // Input
                    System.out.print("Enter a string: ");
                    input.nextLine(); // Consume leftover newline
                    String option2 = input.nextLine();

                    // Display
                    System.out.println();
                    System.out.println("You selected: Option 2");
                    System.out.println("You entered: " + option2);
                    test.wordbywordPalindrome(option2);
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Exiting Program...");
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid selection");
            }
        } while (selection != 3);
    }
}