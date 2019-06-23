
// import
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

class userInput {
    static double total;
    static ArrayList<Item> items = new ArrayList<Item>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price;
        String name;
        int quantity;
        System.out.println("Enter name of the item:");
        name = input.nextLine();
        System.out.println("Enter the price of the item:");
        price = input.nextDouble();
        System.out.println("Enter quantity:");
        quantity = input.nextInt();
        Item newItem = new Item();
        newItem.name = name;
        newItem.price = price;
        newItem.quantity = quantity;
        items.add(newItem);

        System.out.println(items.size());
        // System.out.println(newItem.name);
        // System.out.println(newItem.price);
        // System.out.println(newItem.quantity);

        while (name != "done") {

        }

    }
}