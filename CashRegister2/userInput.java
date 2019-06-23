
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Reader;
import java.lang.Math;

class userInput {
    static double total;
    static ArrayList<Item> items = new ArrayList<Item>();

    public static void main(String[] args) {
        String name, keepGoing;
        double price;
        int quantity;
        Item newItem;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name of item: ");
        name = input.next();
        System.out.println("Enter the price: ");
        price = input.nextDouble();
        System.out.println("Enter the quantity: ");
        quantity = input.nextInt();
        newItem = new Item();
        newItem.name = name;
        newItem.price = price;
        newItem.quantity = quantity;
        items.add(newItem);

        // add to the total price
        total += price * quantity;

        System.out.println("Finished? y/n");
        keepGoing = input.next();

        while (keepGoing.equals("n")) {
            System.out.println("Enter name of item: ");
            name = input.next();
            System.out.println("Enter the price:");
            price = input.nextDouble();
            System.out.println("Enter the quantity:");
            quantity = input.nextInt();
            newItem = new Item();
            newItem.name = name;
            newItem.price = price;
            newItem.quantity = quantity;
            items.add(newItem);
            // add to the total price
            total += price * quantity;

            System.out.println("Finished? y/n");
            keepGoing = input.next();
        }
        System.out.println("Number of items:");
        System.out.println(items.size());
        System.out.println("Your grand total:");
        System.out.println("$" + total);

    }
}