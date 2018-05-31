// Create a list containing the food you wish to buy in a supermarket. The list should have the following: milk, cheese, chicken, carrot, and rice.

// Fill the list and print the items
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> food = new ArrayList<>();
    food.add("milk");
    food.add("cheese");
    food.add("chicken");
    food.add("carrot");
    food.add("rice");
    System.out.println(food);
  }
}
