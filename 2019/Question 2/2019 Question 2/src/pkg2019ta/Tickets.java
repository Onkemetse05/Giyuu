
package pkg2019ta;

public abstract class Tickets implements ITickets {

   @Override
   public void print_tickets() {
        
   }
   
   String custName;
   String movieTitle;
   int custAge;
   int price;
    
   public String getName(){
       return custName;
   }
   public String getMovie(){
      return movieTitle; 
   }
   public int getAge(){
       return custAge;
   }
   public int getPrice(){
       return price;
   }
    
    
}
