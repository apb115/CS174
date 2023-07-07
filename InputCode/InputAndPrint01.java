/*
Andrew Boothe
CSE 174-K
9/13/2021
Code that doscisses print lines, escape characters,
input from keyboard
*/

import java.util.Scanner;
// import java.util.*; imports all classes into code


public class InputAndPrint01 {
    public static void main(String[] args) {
        System.out.print("We will have");
        System.out.print(" our exam1");
        System.out.println(" tomorrow");
        // escape characters
        // \n \t \" \\ **************
        // \n is one character
        System.out.println("Hello!\nMy name is Andrew. \nBye!");
        // \c is one character
        System.out.println("I am \t 100 years old. \n I'm kidding!\n I'm \t NOT KIDDING.");
        // Backslash \ has specific meaning in java inside string
        // When java gets to \ that means there should be meaningful character right after that
        System.out.println(" 4 \\ 5"); // *needs meaningful character
        //  ///\\//\\\
        System.out.println("///\\\\\\//\\\\\\");
        // He said" "what a java code!");
        System.out.println("He said: \"what a java code!!\"");
        
        // printf
        // *** We separate things by comma not +
        // You type in your message and we use specifiers for values
        // %s %S for strings and characters, MAYBE a boolean value
        // %f for double or float values
        // %d for int values
        // %n is the same as \n, which takes you to the next line (only works with printf)
        
        
        System.out.printf("I am %d feet\n", 100);
        System.out.printf("I am %5d feet/n", 8786873);
        System.out.printf("I am %5d feet\n", 321);
        System.out.printf("I am %-5d feet\n", 82);
        System.out.printf("I am %5d feet\n", 82);
        
        // strings
        String str = "I am";
        System.out.printf("%15s %5d feet\n", str, 321);
        System.out.printf("%-15s %5d feet\n", str, 321);
        
        // doubles
        System.out.printf("my score is: %f%n", 23.566);
        
        // \n works with all
        System.out.printf("My score is: %15f%n", 23.566);
        System.out.printf("My score is: %15.2f%n", 23.566);
        System.out.printf("My score is: %-15.3f%n", 23.566);
        // wrong specifier results in RUNTIME ERROR
        
        // Scanner
        
        Scanner keyboardReader = new Scanner(System.in);
        
        System.out.printf("Enter 2 int values: ");
        int num1 = keyboardReader.nextInt();
        double num2 = keyboardReader.nextDouble();
        int sum = keyboardReader.nextInt();
        System.out.printf("The sum of these numers is: " + num1 + (int) num2 + sum);
        //Separate ints with space or enter key
        
        // next() for reading string
        // nextInt() for reading int values
        // nextDouble() for reading double values
        // nextLong() for reading long values
        // nextByte() for reading byte values
        // nextString DOES NOT EXIST
        // next() reads strings, characters, etc.
        
        String firstName = keyboardReader.next();
        String lastName = keyboardReader.next();
        System.out.printf("***%s %s***\n");
        
        
        
    }
}