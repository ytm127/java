
// imports 
import java.util.ArrayList;
import java.util.HashMap;

class CashRegister {

    //// member variables
    // final price
    static double totalPrice;
    // receipt
    static ArrayList<Item> receipt = new ArrayList<Item>();

    //// class methods
    // ring up item
    static void ringUpItem(Item addItem) {
        totalPrice = totalPrice + (addItem.price * addItem.quantity);
    }

    // when you have multiple of an item. Cashier usually inputs it rather than scan
    // each item
    static void multiple(Item multipleItem, int quantity) {
        multipleItem.quantity = quantity;
    }

    // delete/update (1. update the total, 2. update the receipt)
    static void update(Item updateItem, int quantity) {
        totalPrice = totalPrice - updateItem.quantity * updateItem.price;
        // 1
        updateItem.quantity = quantity;
        ringUpItem(updateItem);
        // 2
        if (quantity == 0) {
            receipt.remove(updateItem);
        }
    }

    // total
    public double getTotal() {
        return totalPrice;
    }

    // print receipt
    static void printReceipt() {
        System.out.println("\n===== RECIEPT ======");
        for (Item temp : receipt) {
            System.out.println(temp.name + ", " + temp.price + ", " + temp.quantity);
        }
    }

    public static void main(String[] args) {

        // instantiate a cash register
        CashRegister traderJoesRegister = new CashRegister();

        // add items to your shopping basket
        Item milk = new Item();
        milk.name = "milk";
        milk.price = 2.00;
        milk.quantity = 1;
        receipt.add(milk); // append to receipt
        CashRegister.ringUpItem(milk); // add to running total

        Item cereal = new Item();
        cereal.name = "cereal";
        cereal.price = 4.50;
        cereal.quantity = 1;
        receipt.add(cereal); // append to receipt
        CashRegister.multiple(cereal, 3);
        CashRegister.ringUpItem(cereal); // add to running total

        CashRegister.update(cereal, 1); // update or get rid an item completely

        System.out.println("\nThe total is: $" + traderJoesRegister.getTotal());
        // get recipt
        CashRegister.printReceipt();
    }

}