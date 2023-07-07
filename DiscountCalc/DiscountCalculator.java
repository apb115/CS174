/* Name: Andrew Boothe
   Class: CSE 174
   Section: K
   Program: DiscountCalculator
   Purpose: Use conditionals, user input, and formatting
    to determine a total purchase by a user based on animal
*/

// Import java utility for taking user input 
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        
        // User input scanners are declared
        Scanner keyboardReader = new Scanner(System.in);
        Scanner keyboardReader2 = new Scanner(System.in);
        
        /* Opening print statements for each option user
            chooses from */
        System.out.printf("*Discount Calculator*");
        System.out.printf("\n1. Calculating dog discount");
        System.out.printf("\n2. Calculating cat discount");
        System.out.printf("\n3. Calculating rodent discount");
        
        // Variables to take input from user
        System.out.printf("\nEnter a number [1, 2, 3]: ");
        double discountAnimal = keyboardReader.nextDouble();
        
        System.out.printf("Enter total purchase: ");
        double purchaseValue = keyboardReader.nextDouble();
        
        // Conditional calculator for dog with nested if statement
        if (discountAnimal == 1) {
            if (purchaseValue <= 100) {
                double totalDiscount = purchaseValue * .1;
                double finalPurchase = purchaseValue - totalDiscount;
                System.out.printf("Dog discount (10%%): %.2f", totalDiscount);
                System.out.printf("\nPrice Payable:  %.2f", finalPurchase);
                System.out.printf("\nEnd\n");
            
            } else if (purchaseValue > 100) {
                double totalDiscount = purchaseValue * .2;
                double finalPurchase = purchaseValue - totalDiscount;
                System.out.printf("Dog discount (20%%): %.2f", totalDiscount);
                System.out.printf("\nPrice Payable:  %.2f", finalPurchase);
                System.out.printf("\nEnd\n");
            }
        
        
        // Conditional calculator for cat with nested if statement
        } else if (discountAnimal == 2) {
            if (purchaseValue <= 100) {
                double totalDiscount = purchaseValue * .1;
                double finalPurchase = purchaseValue - totalDiscount;
                System.out.printf("Cat discount (10%%): %.2f", totalDiscount);
                System.out.printf("\nPrice Payable:  %.2f", finalPurchase);
                System.out.printf("\nEnd\n");
            
            } else if (purchaseValue > 100) {
                double totalDiscount = purchaseValue * .15;
                double finalPurchase = purchaseValue - totalDiscount;
                System.out.printf("Cat discount (15%%): %.2f", totalDiscount);
                System.out.printf("\nPrice Payable:  %.2f", finalPurchase);
                System.out.printf("\nEnd\n");
            }
        
        
        // Conditional calculator for rodent with nested if statement
        } else if (discountAnimal == 3) {
            if (purchaseValue <= 100) {
                double totalDiscount = purchaseValue * .1;
                double finalPurchase = purchaseValue - totalDiscount;
                System.out.printf("Rodent discount (10%%): %.2f", 
                    totalDiscount);
                System.out.printf("\nPrice Payable:  %.2f", finalPurchase);
                System.out.printf("\nEnd\n");
            
            } else if (purchaseValue > 100) {
                double totalDiscount = purchaseValue * .12;
                double finalPurchase = purchaseValue - totalDiscount;
                System.out.printf("Cat discount (12%%): %d", totalDiscount);
                System.out.printf("\nPrice Payable:  %d", finalPurchase);
                System.out.printf("\nEnd\n");
            }
            
        }
        // end of final if statement
            
    }
    // end of main class
    
}
// end of public class
