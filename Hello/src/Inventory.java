

import java.util.Scanner;
public class Inventory {
    public static void main(String[] args) {
        int grandTotal = 0;
        String cont;
        do {
            System.out.println("Please enter the type of product recieved");
            Scanner in = new Scanner(System.in);
            String productType = in.next();
            System.out.println("Please enter the cost of us for each" + productType);
            int cost = in.nextInt();
            System.out.println("Please enter the brand name");
            String brandName = in.next();
            System.out.println("please enter the number of" + productType + "in the shipment");
            int numProductInShipment = in.nextInt();
            int totalCost = cost * numProductInShipment / 100;
            System.out.println("Shipment Summary:\n" +
                    "The new product is " + productType + ".\n" +
                    "This shipment included " + numProductInShipment + " from " + brandName + ".\n" +
                    "The total value of the shipment was $" + totalCost + "\n");
            System.out.println("With GST: " + totalCost * 1.05f);
            grandTotal = grandTotal + totalCost;
            if (grandTotal > totalCost) {
                break;
            }
            System.out.println("would you like to enter another product");
            cont = in.next();
        }
        while(cont.equals("yes") || cont.equals("y"));

        System.out.println("The grand total of the shipment is: $" + grandTotal);
    }
}
