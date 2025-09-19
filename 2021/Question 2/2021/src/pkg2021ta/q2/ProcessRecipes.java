/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2021ta.q2;
import java.util.*;

public class ProcessRecipes extends Recipes {
Scanner input = new Scanner(System.in);
    @Override
    public void PrintRecipes() {
        int[] num = new int[1];
        for(int i = 0; i < num.length; i++){
            while(true){
              System.out.print("Enter the ingredients: ");
              ingredients = input.nextLine().trim();
              System.out.print("Enter the time to make (in minutes): ");
              time = input.nextInt();
              System.out.print("Enter difficulty levels: ");
              difficulty = input.nextInt();  
              break;
            }
           
        }
        System.out.println("**********************");
        System.out.println("INGREDIENTS: " + getIngredients());
        System.out.println("TIME TO MAKE: " + getTime());
        System.out.println("DIFFICULTY LEVEL: " + getDifficulty());
        System.out.println("**********************");
        
    }

    @Override
    public String getIngredients() {
        return ingredients;
    }

    @Override
    public int getTime() {
        return time;
   }

    @Override
    public int getDifficulty() {
        return difficulty;
    }

}
