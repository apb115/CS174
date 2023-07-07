/* Name: Andrew Boothe
   Class Name: CSE 174 
   Section: K
   Program: Write code that will produce an average output 
   of a company's profits after four years
*/

// main class

public class ProjectProfits {
    
    /* Method that is used to both calculate each average value 
    for a given year and calculate the combined profit of all
    three values
    */
    
    public static void main(String[] args) {
        
        // Initialize integers with each income declared
        
        int income1 = 2000000;
        int income2 = 2500000;
        int income3 = 3000000;
        int income4 = 4000000;
        
        // Average profit for the next year
        
        float nextYear = 5.1f;
        float predicted1 = (nextYear / 100) * income1;
        
        nextYear = 7.2f;
        float predicted2 = (nextYear / 100) * income2;
        
        nextYear = 9.3f;
        float predicted3 = (nextYear / 100) * income3;
        
        nextYear = 11.2f;
        float predicted4 = (nextYear / 100) * income4;
        
        float average1 = (predicted1 + predicted2 + predicted3 + predicted4) 
            / 4;
        
        // Average profit for the second year
        
        float secondYear = 6.0f;
        float predicted5 = (secondYear / 100) * income1;
        
        secondYear = 8.0f;
        float predicted6 = (secondYear / 100) * income2;
        
        secondYear = 10.1f;
        float predicted7 = (secondYear / 100) * income3;
        
        secondYear = 13.2f;
        float predicted8 = (secondYear / 100) * income4;
        
        float average2 = (predicted5 + predicted6 + predicted7 + predicted8) 
            / 4;
        
        // Average profit for the third year 
        
        float thirdYear = 8.0f;
        float predicted9 = (thirdYear / 100) * income1;
        
        thirdYear = 10.5f;
        float predicted10 = (thirdYear / 100) * income2;
        
        thirdYear = 13.0f;
        float predicted11 = (thirdYear / 100) * income3;
        
        thirdYear = 16.8f;
        float predicted12 = (thirdYear / 100) * income4;
        
        float average3 = (predicted9 + predicted10 + predicted11 + predicted12)
            / 4;
        
        // Print statements for the averages of three years
        
        System.out.println("The average profit for the next year: "
            + average1);
        System.out.println("The average profit for the second year: "
            + average2);
        System.out.println("The average profit for the third year: "
            + average3);
        
        // Declaration for total profit
        
        int totalProfit = (int) average1 + (int) average2 + (int) average3;
        
        // Print the total profit value
        
        System.out.println("");
        System.out.println("Total profit in next 3 years: " + totalProfit);
    }
    // The main args method ends above
    
}
