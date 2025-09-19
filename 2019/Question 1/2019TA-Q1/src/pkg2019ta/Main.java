
package pkg2019ta;
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] months = {"JAN", "FEB", "MAR"};
        String[] carType = {"SUV", "COUPE", "SEDAN", "VAN"};
        int[][] sales = new int[4][3];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < carType.length; i++){
            for(int j = 0;j < months.length; j++){
                int value;
                System.out.print("Enter the number of " + carType[i] + " sold in " + months[j] + " : ");
                while(true){
                    value = input.nextInt();
                    if(value > 0){
                        break;
                    }
                    else{
                        System.out.println("Cars sold cannot be less than zero");
                    }
                }
                sales[i][j] = value;
            }  
        }
        //sales report
        System.out.println("***********************************************************");
        System.out.println("VEHICLE SALES REPORT");
        System.out.println("***********************************************************");
        System.out.printf("%-20s %-15s %-15s %-15s\n", "", "JAN", "FEB", "MAR");
        for(int i = 0; i < carType.length; i++){
            System.out.printf("%-20s %-15d %-15d %-15d\n", carType[i], sales[i][0], sales[i][1], sales[i][2]);   
        }
        //total sales
        int[] totals = new int[4];
         System.out.println("***********************************************************");
         System.out.println("VEHICLE TOTAL SALES");
         System.out.println("***********************************************************");
         for(int i = 0; i < carType.length;i++){
             totals[i] = sales[i][0] + sales[i][1] + sales[i][0];
             if(totals[i] >= 100){
                 System.out.printf("%-20s %d %s\n", carType[i], totals[i], "(Gold Star)");
             }
             else{
                 System.out.printf("%-20s %d %s\n", carType[i], totals[i], "(Silver Star)");
             }
         }
        System.out.println("***********************************************************"); 
        input.close();
    }
    
}
