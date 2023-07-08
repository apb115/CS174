
/* Name: Andrew Boothe
Section: CSE 174-K
Date: 9/10/2021
Goal: Write a program that will output the number of tires bought, 
    number of cars produced, and how many tires are leftover
*/


public class CountTires {
    public static void main(String[] args) {
        
        /* Variables declared with mathematical operators 
        to produce tire outputs */
        
        final int MAX_TIRES = 19873123;
        int carsPerTire = MAX_TIRES * 2;
        int carsProduced = carsPerTire / 4;
        int tiresLeft = carsPerTire % 4;
        
        /* Print statements that output required strings 
        along with necessary variables to console. */
        
        System.out.println("The number of: " + carsPerTire 
            + " tires are added to the production line!");
            
        System.out.println(carsProduced + " cars are produced.");
        
        System.out.println(tiresLeft + " tires are left.");
        
    }
    // end of main method
}
// end of class
