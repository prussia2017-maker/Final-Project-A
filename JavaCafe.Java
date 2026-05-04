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
        String[] menuName = {"Glazed Donut", "The Blissful Blowout Donut","Cupcake Donut Supreme", "Cookies and Cream Donut", "Milk","(Regular sized) Coffee", "Juices"}; 
         //Defines menu items through array of strings
        Double[] menuPrice = {2.00, 3.50, 4.00, 3.50, 2.00, 3.00, 2.25}; 
        //Defines menu prices through array of doubles
        String[] cartNames = new String[100]; 
        //Stores the menu names in the shopping cart
        Double[] cartPrices = new Double[100]; 
        //Stores the menu prices in the shopping cart
        int ItemCount = 0; // Initializes the item count 
        System.out.println("Hello and Welcome to Dopean's Donuts!");
        // Greets the user with a welcome message
    while(true){ //Starts the loop for cafe operations
System.out.println("\n--- DOPEAN'S CAFE OPERATIONS---"); 
System.out.println("1. Add Record | 2. Display Shopping Cart | 3. Remove item(s)| 4. View item(s)/Subtotal| 5. Checkout"); 
            System.out.print("Select:  ");
                   
switch (input.nextInt()) {
    case 1:  //Adding the Store Menu
    System.out.println("\n--- STORE MENU ---");
    for (int i = 0; i < menuName.length; i++) {
       // Displays the menu items with their prices
    System.out.printf("%d. " + menuName[i] + ":  $%.2f\n", (i + 1), menuPrice[i]);
  }
System.out.println("Enter the number of the store item: ");
     int itemNum = input.nextInt() - 1;
   if (itemNum >= 0 && itemNum < menuName.length) {
       // Validates the user's input
   cartNames[itemCount] = menuName[itemNum];
   // Adds the selected menu item to the shopping cart
      cartPrices[itemCount] = menuPrice[itemNum];
          itemCount++;
   // Increments the item count by 1 in shopping cart
   System.out.println("Record added.");
    }
                   break;
                  
   case 2:  //Displaying a user's Shopping Cart
   System.out.println("\n--- SHOPPING CART---");
   //Checks if shopping cart is empty
     if (itemCount == 0) {
 System.out.println("Empty!");
                   }
   // Displays current itemcount in the shopping cart
 for (int i = 0; i < itemCount; i++) {
     System.out.printf("%d. " + cartNames[i] + " ($%.2f)\n", (i + 1), cartPrices[i]);
                   }
                   break;
                  
   case 3:  //Erase items from your shopping cart
     if (itemCount == 0) {
       // Checks if shopping cart is empty
           System.out.println("Empty!");
               break;
                   }
System.out.print("Enter the number of the store item in your Shopping Cart to cancel:  ");
                 
   int deleteItem = input.nextInt() - 1;
if (deleteItem >= 0 && deleteItem < itemCount) {
   // Validates user's input for item deletion
for (int i = deleteItem; i < itemCount - 1; i++) {
    cartNames[i] = cartNames[i + 1];
     cartPrices[i] = cartPrices[i + 1];
                       }      
       itemCount--; // Decrements the item count by 1
       System.out.println("Item(s) Deleted!");
                   }
                  else {
    System.out.println("Invalid item number!");
                   }
                   break;

case 4:  //Review the number of items and the subtotal
Double subTotal = 0.0;
//reviews the number of items and calculates the subtotal of the shopping cart
   for (int i = 0; i < itemCount; i++) {
     subTotal += cartPrices[i];
                   }
     System.out.printf("Total Number of Items: %d | Subtotal:  $%.2f\n", itemCount, subTotal);
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
 System.out.printf("Total Cost (Additional 6%% Tax): $%.2f\n", finalTotal);
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
