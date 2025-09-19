package pkg2021ta;
import java.util.*;
/**
 *
 * @author User
 */
public class Main {
 static Scanner num = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //QUESTION 1
      String[] years = {"DELIVERIES 2018", " DELIVERIES 2019", "DELIVERIES 2020"};
      String[] months = {"JAN", "FEB", "MAR"};
      int[][] deliveries = new int[3][3];
      
      for (int i = 0; i < years.length; i++) {
      for (int j = 0; j < months.length; j++) {
        int value = -1;

        while (value < 0) {
            System.out.print("Enter the number of " + years[i].toLowerCase() + " for " + months[j] + ": ");

            if (num.hasNextInt()) {
                value = num.nextInt();

                if (value < 0) {
                    System.out.println("Invalid input. Please enter a non-negative number.");
                }
            } else {
                System.out.println("Invalid input. Please enter numeric values only.");
                num.next(); // clear invalid input
            }
        }

        deliveries[i][j] = value;
    }
}
      // Deliveres report
      System.out.println();
      System.out.println("************************************************************************************************");
      System.out.println("DELIVERIES REPORT");
      System.out.println("************************************************************************************************");
      System.out.printf("%-20s %-15s %-15s %-15s\n", "", "JAN", "FEB", "MAR");

        for (int i = 0; i < years.length; i++) {
            System.out.printf("%-20s %-15d %-15s %-15d\n", years[i], deliveries[i][0], deliveries[i][1], deliveries[i][2]);
        }
        
       //DELIVERIES STATISTICS 
     
      System.out.println("************************************************************************************************");
      System.out.println("DELIVERIES STATISTICS");
      System.out.println("************************************************************************************************");
      int total = 0;
      int max = deliveries[0][0];
      int min = deliveries[0][0];

      for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
                int value = deliveries[i][j];
                total += value;
                if (value > max) max = value;
                if (value < min) min = value;
        }
    }

    System.out.printf("Total Deliveries:     %d\n", total);
    System.out.printf("Maximum Deliveries:   %d\n", max);
    System.out.printf("Minimum Deliveries:   %d\n", min);
    System.out.println("**************************************************************************************************");
    
    


}
   
    }
    

