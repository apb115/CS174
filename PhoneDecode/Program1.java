
/**
 * Name: Andrew Boothe
 * Section: CSE 174-K
 * Sep 2021
 * Program1.java
 * This program decodes the digits from a phone number.
 */
import java.util.Scanner;  // importing Scanner class

public class Program1 {
    public static void main(String[] args) {
        
        // Defining a Scanner object
        Scanner in = new Scanner(System.in);
        
        // Prompting the user with a message
        System.out.print("Enter a 10 digit phone number (e.g. 5131234567): ");
        
        // Saving the given number inside a constant variable
        final long PHONE_NUM = in.nextLong();
        
        /* STEP 1: Phone number is split into 3 different parts, 
        all casted to integers */
        long areaCode1 = PHONE_NUM / 10000000;
        int areaCode2 = (int) areaCode1;
        
        long centralOfficeCode1 = PHONE_NUM / 10000 % 1000;
        int centralOfficeCode2 = (int) centralOfficeCode1;
        
        long stationNumber1 = PHONE_NUM % 10000;
        int stationNumber2 = (int) stationNumber1;
        
        /* The three deciding variables are declared with 
        correct format in a print statement */
        System.out.println("(" + areaCode2 + ")" + " " 
            + centralOfficeCode2 + " " + "-" + " " + stationNumber2);
        
        /* STEP 2:THe last four digits of the phone number are 
        encrypted into characters */
        int encrypt1 = stationNumber2 / 100;
        int encrypt2 = stationNumber2 % 100;
        
        encrypt1 += 33; 
        encrypt2 += 33; 
        
        char encryptFinal1 = (char) encrypt1;
        char encryptFinal2 = (char) encrypt2;
        
        /* The resulting statement of the phone number 
        with the last four digits encrypted is printed */
        System.out.println("(" + areaCode2 + ")" + " " + centralOfficeCode2
            + " " + "-" + " " + encryptFinal2 + encryptFinal1);
        
        /* STEP 3: The remaining 6 digits are all encrypted
        using math operators (+, *, /, %, -, etc.) */
        int lastEncrypt = areaCode2 * 1000 + centralOfficeCode2;
        lastEncrypt = Integer.MAX_VALUE - lastEncrypt;
        
        // The phone number with the 6 encrypted digits is printed
        System.out.println(lastEncrypt);
        
        /* The final print statment holds each encrypted ASCII value 
        on the outside and the first 6 digits encrypted on the inside */
        System.out.println("" + encryptFinal2 + lastEncrypt + "" 
            + encryptFinal1);
        
    }
    // main method ends
    
}
// public class ends
