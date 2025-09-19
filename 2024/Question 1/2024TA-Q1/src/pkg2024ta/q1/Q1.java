package pkg2024ta.q1;
import java.util.*;

public class Q1 {
  
    static Scanner num = new Scanner(System.in);
    
    public static void main(String[] args) {
      String[] cities = {"Cape Town", " Johannesburg", "Port Elizabeth"};
      String[] vehicle = {"Car", "Motor Bike"};
      int[][] accidents = new int[3][2];
      
      for (int i = 0; i < cities.length; i++) {
    for (int j = 0; j < vehicle.length; j++) {
        int value = -1;

        System.out.print("Enter the number of " + vehicle[j].toLowerCase() + " accidents for " + cities[i] + ": ");
        while (true) {
            //System.out.print("Enter the number of " + vehicle[j].toLowerCase() + " accidents for " + cities[i] + ": ");
                value = num.nextInt();
                if (value > 0) {
                break;
                }
                else{
                    System.out.println("Invalid input");
                }
            }
        accidents[i][j] = value;
        }
    }
  
      // accident report
        System.out.println("\n--------------------------------------------------------------");
        System.out.println("                     ROAD ACCIDENT REPORT");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-20s %-15s %-15s\n", "", "CAR", "MOTOR BIKE");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %-15d %-15d\n", cities[i], accidents[i][0], accidents[i][1]);
        }
        // Totals and max accident city
        int[] totals = new int[3];
        int maxIndex = 0;
        System.out.println("--------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            totals[i] = accidents[i][0] + accidents[i][1];
            System.out.printf("%-20s %d\n", cities[i], totals[i]);
            if (totals[i] > totals[maxIndex]) {
                maxIndex = i;
            }
        }
        // Display city with the most accidents
        System.out.println("--------------------------------------------------------------");
        System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: " + cities[maxIndex]);
        System.out.println("--------------------------------------------------------------");
    }
}
