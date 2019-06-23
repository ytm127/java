
import java.util.ArrayList;
import java.util.Scanner;
import java.io.Reader;
import java.lang.Math;
import java.text.DecimalFormat;

class userInput {
    static double total;
    static ArrayList<Item> items = new ArrayList<Item>();
    static DecimalFormat df2 = new DecimalFormat("#.00");

    public static void main(String[] args) {
        String name, keepGoing, location = "Washington DC";
        double price, grandTotal, tax = .06;
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
        System.out.println("\n=================\n");
        // show all the items
        items.forEach((temp) -> {
            System.out.println(temp.quantity + "  " + temp.name + "  " + df2.format(temp.quantity * temp.price));
        });
        System.out.println("\n\nSub total:   $" + df2.format(total));
        System.out.println("Sales tax in " + location + " is " + (tax * 100) + "%");
        System.out.println("Tax:   $" + (total * tax));
        grandTotal = total + (total * tax);
        System.out.println("Total:   $" + grandTotal);

    }
}