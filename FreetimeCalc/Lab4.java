
/*
Name: Andrew Boothe
Class: CSE-174 K
Date: 9/17/2021
Lab: Lab4
Description: Write code that will take an input
    from the user, with the end goal being a free time calculator
*/


// Import special Java packages for user input and file editing
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
 
public class Lab4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboardReader = new Scanner(System.in);
        
        /* Step 1: User input is created, and first
            freeTime value is calculated. */
        
        System.out.printf("Enter your first and last name: ");
        String firstName = keyboardReader.next();
        String lastName = keyboardReader.next();
        
        System.out.printf("Enter your time spent" 
            + " sleeping each night (in hours): ");
        double hoursOfSleep = keyboardReader.nextDouble();
        
        System.out.printf("Enter your number of classes: ");
        int numClasses = keyboardReader.nextInt();
        
        double freeTime = 120 - (hoursOfSleep * 5 + numClasses * 8.72);
        
        /* Step 2: Initial table is created with values
            from initial user input */ 
        
        System.out.printf(" _____________________________________"
            + "_______");
        System.out.printf("\n|%-20s|%-12s|%-10s|", "Name", "Num Classes",
             "Free Time");
        System.out.printf("\n|............................................|");
        System.out.printf("\n|%-20s|%-12d|%-10.1f|", firstName + " " 
            + lastName, numClasses, freeTime);
        System.out.printf("\n -------------------------------------"
            + "-------");
        
        /* Step 3: Second user input is created, which loads
            values from a txt file into table and console,
            second freeTime value is calculated */
        
        System.out.printf("\nEnter an input filename: ");
        String fileName = keyboardReader.next();
        
        Scanner fileReader = new Scanner(new File(fileName));
        
        String firstName2 = fileReader.next();
        String lastName2 = fileReader.next();
        double hoursOfSleep2 = fileReader.nextDouble();
        int numClasses2 = fileReader.nextInt();
        
        double freeTime2 = 120 - (hoursOfSleep2 * 5 + numClasses2 * 8.72);
        
        System.out.printf(" ____________________________________________");
        System.out.printf("\n|%-20s|%-12s|%-10s|", "Name", "Num Classes", 
            "Free Time");
        System.out.printf("\n|............................................|");
        System.out.printf("\n|%-20s|%-12d|%-10.1f|", firstName2 + " " 
            + lastName2, numClasses2, freeTime2);
        System.out.printf("\n --------------------------------------------");
        
        // Close method to stop program from running
        fileReader.close();
        
        /* Step 4: new File is created and print result
            is printed into the file, NOT THE CONSOLE */
     
        System.out.printf("\nEnter an output filename: ");
        String fileName2 = keyboardReader.next();
        PrintWriter out = new PrintWriter(new File(fileName2));
        
        out.printf("____________________________________________");
        out.printf("\n|%-20s|%-12s|%-10s|", "Name", "Num Classes", "Free Time");
        out.printf("\n|............................................|");
        out.printf("\n|%-20s|%-12d|%-10.1f|", firstName + " " + lastName, 
            numClasses, freeTime);
        out.printf("\n|............................................|");
        out.printf("\n|%-20s|%-12d|%-10.1f|", firstName2 + " " + lastName2, 
            numClasses2, freeTime2);
        out.printf("\n -------------------------------------------- ");
    
        // Close method to stop program
        out.close();
    }
    // end of main method
}
// end of class
