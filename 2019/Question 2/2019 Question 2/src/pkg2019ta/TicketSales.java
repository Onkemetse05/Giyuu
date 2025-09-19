
package pkg2019ta;
import java.util.*;

public class TicketSales extends Tickets {
  Scanner input = new Scanner(System.in) ; 
  
    @Override
    public void print_tickets() {
      System.out.print("Enter the customer name: ") ;
      while(true){
          custName = input.nextLine().trim();
          if(custName != null){
              break;
          }else{
              System.out.println("enter a valid name");
          }
      }
      System.out.print("Enter the movie: ");
      while(true){
          movieTitle = input.nextLine().trim();
          if(movieTitle != null){
              break;
          }
          else{
              System.out.println("Movie not valid.");
          }
      }
      
      System.out.print("Enter the customer age: ");
      while(true){
          custAge = input.nextInt();
          if(custAge > 0){
              break;
          }
          else{
              System.out.println("Please enter a valid age:  ");
          }  
      }
      System.out.print("Enter the movie cost: ");
      while(true){
          price = input.nextInt();
          if(price > 0){
              break;
          }
          else{
              System.out.println("Price cannot be less than zero");
          }
      }
      //output
      double discount;
      double total;
      if(custAge >= 65 ){
          discount = price * 0.1;
          total = price - discount;
      }
      else{
          discount = 0;
          total = price;
      }
      System.out.println("CUSTOMER: " + getName());
      System.out.println("MOVIE: " + getMovie());
      System.out.println("COST: R" + getPrice());
      System.out.println("DISCOUNT: R" + discount);
      System.out.println("TOTAL: R" + total);       
    }
}
