package ws1;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ShoppingCartFinal {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>(); //use array list as u need to amend the list & uses reference type
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to your shopping cart");
        String input = scan.nextLine().trim();

        while (true) {
            System.out.print("> ");
            
            if (input.equals("list")) {
                showList(cart);
            } else if (input.startsWith("add")) {
                addItem(input, cart);
            } else if (input.startsWith("delete")) {
                deleteItem(input, cart);
            } else {
                System.out.println("Invalid command. Please use 'list', 'add', or 'delete'.");
            }
            scan.close();
        }

        }

        public static void showList(List<String> cart) { //print cart when input is list else "Your cart is empty"
            if (cart.isEmpty()) {
                System.out.println("Your cart is empty");
            } else {System.in().equals("list");} 
                for (i=0; i<arrayLength; i++) {
                System.out.println(i+1 +". " + cart.get(i));
                }
            }

        public static void addItem (String input, List <String> cart) { //add item to cart: system.in, add to arraylist, print "item added to cart"
            String[] newItem = input();
            for (String item : newItem) {
                String trimmedItem = item.trim();
                if (!cart.contains(trimmedItem)) {
                    cart.add(trimmedItem);
                    System.out.println(trimmedItem + " added to cart");
                } else {System.out.println("You already have added "+ trimmedItem + " into your cart");
            }
        }
    }

        //delete: remove i = input-1, print "item removed from cart"
        //delete: wrong number, print "incorrect item index" (if input => arrayLength)
        public static void deleteItem (String input, List <String> cart) { 
            for (int i = 0; i < itemList.size(); i++) {
                if (itemList.get(i).equals(input)) {
                    itemList.remove(itemList.get(i));
                    System.out.println(input +" has been removed");
                    i--; // Decrement index as size of ArrayList decreases after removal
                }
            
        }

    }
}