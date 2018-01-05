// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************
import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList<Item>();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        while (keepShopping.equals("y")) 
            {
                System.out.print ("Enter the name of the item: ");
                itemName = scan.next();
                System.out.print ("Enter the unit price: ");
                itemPrice = scan.nextDouble();
                System.out.print ("Enter the quantity: ");
                quantity = scan.nextInt();
                
                Item a = new Item(itemName, itemPrice, quantity);
                cart.add(a);
                // *** create a new item and add it to the cart
                
                // *** print the contents of the cart object using println
                System.out.print ("Continue shopping (y/n)? ");
                keepShopping = scan.next();
            }
        checkOut(cart);
    }
    public static void checkOut(ArrayList<Item> yourCart) {
        Scanner scan = new Scanner(System.in);
        //You do NOT need a getter method (think about public instance variables)
        //Print the contents of the cart (you may use the toString() method
        //Ask the user if they would like to remove an item.  If yes, remove that item.
        //Print final total of items and final price (total)
        System.out.println("Your cart has: ");
        String keepChecking = "y";
        int ind;

        for(Item i : yourCart){
            System.out.println(i);
        }
            System.out.println("Remove an item? (y/n)");
            if(scan.next().equals("y")){
            while(keepChecking.equals("y")){
            System.out.println("Which item to remove? (index)");
            for(int k =0; k < yourCart.size(); k++){
                System.out.println(k + ")" + " " + yourCart.get(k));
            }
            ind = scan.nextInt();
            System.out.println("How many to remove?");
            int val = scan.nextInt();
            yourCart.get(ind).quantity -= val;  
            if(yourCart.get(ind).quantity < 1){
                yourCart.remove(ind);
            }
            System.out.println("Remove an item? (y/n)");
            for(Item i : yourCart){
            System.out.println(i);
            }
            keepChecking = scan.next();
         }
        }
    
        System.out.println("Your total for ");
        for(Item i : yourCart){
            System.out.println(i);
        }
        System.out.print("is $");
        double total = 0 ;
        for(Item i: yourCart){
            total += (i.quantity * i.price);
        }
        System.out.print(total);
    }

}