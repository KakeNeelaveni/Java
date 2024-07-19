package com.revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class Item {
    private String id;
    private String name;
    private double price;

    public Item(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item ID: " + id + ", Name: " + name + ", Price: " + price;
    }
}

class ShoppingCart {
    private HashMap<String, Item> cart;

    public ShoppingCart() {
        cart = new HashMap<>();
    }

    public void addItem(Item item) {
        if (cart.containsKey(item.getId())) {
            System.out.println("Item already in cart. Consider updating quantity if necessary.");
        } else {
            cart.put(item.getId(), item);
            System.out.println("Item added to cart.");
        }
    }

    public void removeItem(String itemId) {
        if (cart.remove(itemId) != null) {
            System.out.println("Item removed from cart.");
        } else {
            System.out.println("Item not found in cart.");
        }
    }

    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in your cart:");
            for (Item item : cart.values()) {
                System.out.println(item);
            }
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart shoppingCart = new ShoppingCart();

        // Sample items (in a real system, these could be retrieved from a database)
        List<Item> items = new ArrayList<>();
        items.add(new Item("1", "Laptop", 1000.00));
        items.add(new Item("2", "Smartphone", 700.00));
        items.add(new Item("3", "Headphones", 150.00));

        while (true) {
            System.out.println("1. Add Item to Cart");
            System.out.println("2. Remove Item from Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume the newline

            switch (choice) {
                case 1:
                    System.out.println("Available items:");
                    for (Item item : items) {
                        System.out.println(item);
                    }
                    System.out.print("Enter the ID of the item to add: ");
                    String addItemId = scanner.nextLine();
                    Item itemToAdd = null;
                    for (Item item : items) {
                        if (item.getId().equals(addItemId)) {
                            itemToAdd = item;
                            break;
                        }
                    }
                    if (itemToAdd != null) {
                        shoppingCart.addItem(itemToAdd);
                    } else {
                        System.out.println("Invalid item ID.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the ID of the item to remove: ");
                    String removeItemId = scanner.nextLine();
                    shoppingCart.removeItem(removeItemId);
                    break;
                case 3:
                    shoppingCart.viewCart();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
