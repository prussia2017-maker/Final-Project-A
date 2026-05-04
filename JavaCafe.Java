import java.io.*; //Initializes the file input/output 
import java.util.Scanner;
//Initializes the class of Scanner for user input
public class DopeansDonuts {
    public static int MenuItem(int[][] menuItem) { 
        /*A Custom Designed Method implemented to 
        calculates the total  quantity of items 
        from the cafe menu in a 2 dimensional array*/
        int count = 0; // Initializes the count variable 
        for (int i = 0; i < menuItem.length; i++) { 
            // Repeats the length of the menuItem array
            count += menuItem[i][1]; 
// Adds the quantity of each item to the count variable
        } 
        return count;// Returns the total count of items
    } 
    
    public static void main(String[] args) { 
        // Initializes the main method for the program 
        Scanner input = new Scanner(System.in);
        // Initializes Scanner object for user input
        String[] menuName = {"Glazed Donut", 
        "The Blissful Blowout Donut", 
        "Cupcake Donut Supreme", 
        "Cookies and Cream Donut", "Milk",
         "(Regular sized) Coffee", "Juices"}; 
         //Defines menu items through array of strings
        Double[] menuPrice = {2.00, 3.50, 4.00, 3.50,
             2.00, 3.00, 2.25}; 
        //Defines menu prices through array of doubles
        String[] cartNames = new String[100]; 
        //Stores the menu names in the shopping cart
        Double[] cartPrices = new Double[100]; 
        //Stores the menu prices in the shopping cart
        int ItemCount = 0; // Initializes the item count 
        System.out.println("Hello and Welcome to 
        Dopean's Donuts!");
        // Greets the user with a welcome message
    while(true){ //Starts the loop for cafe operations
System.out.println("\n--- DOPEAN'S CAFE OPERATIONS---"); 
System.out.println("1. Add Record 
| 2. Display Shopping Cart | 3. Remove item(s)
| 4. View item(s)/Subtotal| 5. Checkout"); 
            System.out.print("Select:  ");
                   
case 4:  //Review the number of items and the subtotal
Double subTotal = 0.0;
//reviews the number of items and calculates the subtotal of the shopping cart
   for (int i = 0; i < itemCount; i++) {
     subTotal += cartPrices[i];
                   }
     System.out.printf("Total Number of Items:
%d | Subtotal:  $%.2f\n", itemCount, subTotal);
//prints # of items and the subtotal of shopping cart
                   break;
                  
     case 5:  //Checkout - Total cost and transaction
    Double total = 0.0;
   for (int i = 0; i < itemCount; i++) {
       total += cartPrices[i];
       //adds prices in shopping cart for calculation
                   }
     //additional tax calculation towards price total
   Double finalTotal = total * 1.06;
int finalItems = MenuItem(new int[][]{{1,itemCount}});
// Calls the MenuItem method to calculate total number of items in the shopping cart
   System.out.println("\n--- TRANSACTION COMPLETE---");
   //Prints out the total number of items and the final cost with tax
  System.out.println("Total Number of Items:  "
  + finalItems);
 System.out.printf("Total Cost (Additional 6%% Tax):
   $%.2f\n", finalTotal);
 System.out.println(“Have a good rest of your day!”);
  input.close(); //Closes out the Scanner class
                   return;
                  
               default: 
   System.out.println("Invalid selection.");
   //If any user input is out of the program’s reach
           }
       }
   }
}
