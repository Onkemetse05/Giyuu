
package pkg2022ta;
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};
        String[] area = {"Bathrooms", "Kitchens", "Garden"};
        int[][] num = new int[6][3];
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < months.length; i++){
            for(int j = 0; j < area.length; j++){
                int value;
                while(true){
                   System.out.print("The amount of makeovers for " + area[j] + " in " + months[i] + " was: ");
                   value = input.nextInt();
                   if(value >= 0){
                       break;
                   }else{
                       System.out.println("You have entered a invalid value: ");
                   }
                   
                }
               num[i][j] = value;
            }   
    }
        //Report header
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%-20s %-15s %-15s %-15s\n","", "Bathrooms", "Kitchents", "Garden");
            
        //Report details
        for(int i = 0; i < months.length; i++){
            System.out.printf("%-20s %-15s %-15s %-15s\n", months[i], num[i][0], num[i][1], num[i][2]);
        }
        //monthly totals header
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("MONTHLY TOTALS");
        System.out.println("-----------------------------------------------------------------------------");
        //monthly totals details
        int totals[] = new int[6];
        for(int i = 0; i < months.length; i++){
            totals[i] = num[i][0] + num[i][1] + num[i][2];
            if(totals[i] >= 15){
                System.out.printf("%-20s %-15d %-15s\n", months[i], totals[i], "***");
            }else{
                System.out.printf("%-20s %-15d\n", months[i], totals[i]);
            }
        }
        System.out.println("-----------------------------------------------------------------------------");
    }
    
}
