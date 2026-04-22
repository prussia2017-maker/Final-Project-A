import java.io.*;
import java.util.Scanner;
public class DopeansDonuts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initial Declarations
        int quantity, num1, num2;
        double charity = 0, computeTax, price, subtotal = 0, finalCost;

        System.out.println("Hello and Welcome to Dopean's Donuts!");
        System.out.println("Here is our store's menu for your choosing. Put in the number of the product that you want to buy!");
        
        System.out.println("Type in 1 to begin!");
        num1 = input.nextInt();

        // PART 2: The Shopping Loop
        while (num1 == 1) {
            System.out.println("1. Glazed Donut: $2.00, 2. The Blissful Blowout: $3.50, 3. Cupcake Donut Supreme: $4.00, 4. The Cinnamon Drizzle: $3.50, 5. Carved Blueberry Donut: $3.00");
            System.out.println("Refreshments: 6. Milk: $2.00, 7. (Hot or Cold) Coffee: $3.00, 8. Soft Drink: $2.50");
            System.out.println("Here is our store's menu for your choosing. Put in the number of the product that you want to buy!");
            
            quantity = input.nextInt();

            System.out.println("Now put in the cost of that item!");
            price = input.nextDouble();

            System.out.println("Type in the previous price from your last item. If none, type in 0!");
            subtotal = input.nextDouble();

            subtotal = subtotal + price;
            System.out.println("Subtotal: " + subtotal);

            System.out.println("Here is your current total cost. If you're done with shopping, please type in 0. If not, please type in 1 to continue selecting items");
            num1 = input.nextInt();
        }

        // PART 3: Charity and Tax Calculations
        System.out.println("Would you like to donate to charity?");
        // Assuming 1 is for True/Yes based on your logic
        int choice = input.nextInt(); 

        if (choice == 1) {
            System.out.println("If so, type in the amount that you wish to donate");
            charity = input.nextDouble();
            subtotal = subtotal + charity; // Note: Your flowchart says subtotal + charity
            System.out.println("Subtotal: " + subtotal);
        }

        System.out.println("Put in the subtotal");
        num2 = input.nextInt(); // Using num2 as requested by flowchart

        System.out.println("In addition, the current total will be added with a 6% tax");
        System.out.println("Put in the tax rate (0.06)");
        computeTax = input.nextDouble();

        // ComputeTax = ComputeTax * Num2
        computeTax = computeTax * num2;
        System.out.println("Computed Tax: " + computeTax);

        System.out.println("Now put in the subtotal to get the final cost");
        finalCost = input.nextDouble();

        // FinalCost = Subtotal + ComputeTax
        finalCost = subtotal + computeTax;
        System.out.println("Final Cost: " + finalCost);

        System.out.println("Here is the final amount after the 6% tax");
        System.out.println("Thank you for shopping at Dopean's Donuts. Have a good rest of your day!");
    }
}