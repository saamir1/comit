

import java.util.Scanner;
    public class Inventorloop {
    public static void main(String[] args) {
        System.out.println("Please enter the type of product received");
        Scanner in = new Scanner(System.in);
        String productType = in.next();
        System.out.println("Please enter the cost to us for each " + productType);
        int cost = in.nextInt();
        System.out.println("Please enter the brand name");
        System.out.println("Please enter the cost to us for each " + productType);
        int cost = in.nextInt();
        System.out.println("Please enter the brand name");
        System.out.println("Shipment Summary:\n" +
                "The new product is " + productType + ".\n" +
                "This shipment included "+ numProductInShipment + " from " + brandName + ".\n" +
                "The total value of the shipment was $" + totalCostOfShipment +"\n");
        System.out.println("With GST: " + totalCostOfShipment * 1.05f);
    }
}



