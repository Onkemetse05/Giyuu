package pkg2024ta.q2;
import java.util.*;

public class RunApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int[] accidents = new int [1];
       RoadAccidentReport report = new RoadAccidentReport();

       for(int i = 0; i < accidents.length; i++){
           while(true){
               //vehicle car type
               System.out.print("Enter the accident vehicle type: ");
               report.vehicleType = input.nextLine();
               if(report.vehicleType == null){
                   System.out.println("The vehicle type cannot be empty: ");
                   input.next();
               }
               //city of accident
               System.out.print("Enter the city for the vehicle accidents: ");
               report.city = input.nextLine().trim();
               if(report.city.isEmpty()){
                   System.out.println("The city cannot be blank");
               }
               //accident total
               System.out.print("Enter the total of accidents for " + report.city + " : ");
               report.accidentTotal = input.nextInt();
               if( report.accidentTotal < 0){
                   System.out.print("Total accidents cannot be less than zero");
               }
               else if(report.accidentTotal == 0){
                 System.out.print("The toatl number of accidents cannot be zero:\n");
               }
           break;
           }
           
           System.out.println("VEHICLE ACCIDENT REPORT");
           System.out.println("*************************");
           System.out.println("VEHICLE TYPE: " + report.getVehicleType() );
           System.out.println("CITY: " + report.getCity());
           System.out.println("ACCIDENT TOTAL: " + report.getAccidentTotal());
           System.out.println("*************************");
       }
       input.close();
    }
    
}
