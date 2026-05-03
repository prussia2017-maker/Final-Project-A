    import java.io.*;
import java.util.Scanner;
public class DopeansDonuts {
    public static int MenuItem(int[][] menuItem) { 
        int count = 0; 
        for (int i = 0; i < menuItem.length; i++) { 
            count += menuItem[i][1]; 
        } 
        return count; 
    } 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] menuName = {"Glazed Donut", "The Blissful Blowout Donut", "Cupcake Donut Supreme", "Cookies and Cream Donut", "Milk", "(Regular sized) Coffee", "Juices"}; 
        Double[] menuPrice = {2.00, 3.50, 4.00, 3.50, 2.00, 3.00, 2.25}; 
        String[] cartNames = new String[100]; 
        Double[] cartPrices = new Double[100]; 
        int itemCount = 0; 
        
        System.out.println("Hello and Welcome to Dopean's Donuts!");
        
        while (true) { 
            System.out.println("\n--- DOPEAN'S CAFE OPERATIONS ---"); 
            System.out.println("1. Add Record | 2. Display Shopping Cart | 3. Remove item(s)| 4. View item(s)/Subtotal| 5. Checkout"); 
            System.out.print("Select:  ");

