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




