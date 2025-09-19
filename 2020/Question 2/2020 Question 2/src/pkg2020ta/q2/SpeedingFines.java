
package pkg2020ta.q2;
import java.util.*;
/**
 *
 * @author User
 */
public class SpeedingFines extends Fine{
Scanner input = new Scanner(System.in);

    @Override
    public void PrintFine() {
        int[] size = new int[1];
        for(int i = 0; i < size.length; i++){
            while(true){
            System.out.print("Enter the person name: ");
            name = input.nextLine().trim();
            System.out.print("Enter the speed: ");
            speed = input.nextInt();
            break;
            }
            System.out.println("************************");
            System.out.println("PERSON: " + getName());
            System.out.println("SPEED: " + getSpeed() + "km");
            System.out.println("FINE PAYABLE : R " + getFine());
            System.out.println("************************");
        }
        
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getFine() {
        if(speed >= 120){
            fine = (int) (speed * 10.20);
        }
        else{
            fine = 0;
        }
        return fine;
   }
    
}
