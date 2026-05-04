switch (input.nextInt()) {
    case 1:  //Adding the Store Menu
    System.out.println("\n--- STORE MENU ---");
    for (int i = 0; i < menuName.length; i++) {
       // Displays the menu items with their prices
    System.out.printf("%d. " + menuName[i] +
    ":  $%.2f\n", (i + 1), menuPrice[i]);
  }
System.out.println("Enter the number of
the store item: ");
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
     System.out.printf("%d. " + cartNames[i] +
     " ($%.2f)\n", (i + 1), cartPrices[i]);
                   }
                   break;
                  
   case 3:  //Erase items from your shopping cart
     if (itemCount == 0) {
       // Checks if shopping cart is empty
           System.out.println("Empty!");
               break;
                   }
System.out.print("Enter the number of the store
item in your Shopping Cart to cancel:  ");
                 
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

