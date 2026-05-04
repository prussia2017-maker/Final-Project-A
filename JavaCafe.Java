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
