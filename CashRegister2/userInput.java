
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

class userInput {
    static double total;
    static ArrayList<Item> items = new ArrayList<Item>();
    static DecimalFormat df2 = new DecimalFormat("#.00");

    public static void main(String[] args) {
        String name, keepGoing, location = "Washington DC";
        double price, grandTotal, tax = .06;
        double taxRate = tax * 100;
        int quantity;
        Item newItem;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter name of item: ");
            name = input.next();
            // try catch for price input
            while (true) {
                try {
                    System.out.println("Enter the price: ");
                    input = new Scanner(System.in);
                    price = input.nextDouble();
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter a number!");
                }
            }

            // try catch for quantity input
            while (true) {
                try {
                    System.out.println("Enter the quantity: ");
                    input = new Scanner(System.in);
                    quantity = input.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Please enter an integer!");
                }
            }

            newItem = new Item();
            newItem.name = name;
            newItem.price = price;
            newItem.quantity = quantity;
            items.add(newItem);

            // add to the total price
            total += price * quantity;

            System.out.println("Finished? y/n");
            keepGoing = input.next();

        } while (keepGoing.equals("n"));

        System.out.println("\n=================\n");
        // show all the items
        items.forEach((temp) -> {
            System.out.println(temp.quantity + "  " + temp.name + "  " + df2.format(temp.quantity * temp.price));
        });
        System.out.println("\n\nSub total:   $" + df2.format(total));
        System.out.println("Sales tax in " + location + " is " + taxRate + "%");
        System.out.println("Tax:   $" + df2.format((total * tax)));
        grandTotal = total + (total * tax);
        System.out.println("Total:   $" + df2.format(grandTotal));

    }
}