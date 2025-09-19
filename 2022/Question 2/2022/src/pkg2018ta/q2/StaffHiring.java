
package pkg2018ta.q2;
import java.util.*;

public class StaffHiring extends Staff {

    @Override
    public int getStaffNumber() {
        return staffNumber;
    }

    @Override
    public String getStaffLocation() {
    return staffLocation;
    }

    @Override
    public String getStaffHiringProcess() {
    return hiringProcess;
    }
    public void printStaffHiring(){
       Scanner input = new Scanner(System.in) ;
       int[] size = new int[1];
       for(int i = 0; i < size.length; i++){
        while(true){
            System.out.print("Enter the current staff number: ");
            staffNumber = input.nextInt();
            input.nextLine();
            if(staffNumber < 0){
                System.out.print("The staff number cannot be less than 0.");
            }
            System.out.print("Enter the staff hiring location: ");
            staffLocation = input.nextLine();
            if(staffLocation == null){
                System.out.print("The location cannot be empty");
                
            }
            if(staffNumber < 20){
            hiringProcess = "YES";
            }
            else{
                hiringProcess = "NO";
            }
           break;         
        }
        System.out.println("STAFF HIRING REPORT");
        System.out.println("********************");
        System.out.println("LOCATION: " + getStaffLocation());
        System.out.println("STAFF NUMBER : " + getStaffNumber());
        System.out.println("HIRE STAFF: " + getStaffHiringProcess());
        
                
    }
       input.close();
    }
    
}
