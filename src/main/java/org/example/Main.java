package org.example;

public class Main {
    public static void main(String[] args) {
        BagWarehouse bagWarehouse = new BagWarehouse();
        bagWarehouse.addItem(new Bags(50, Bags.Type.SAND));
        bagWarehouse.addItem(new Bags(40, Bags.Type.CEMENT));
        bagWarehouse.addItem(new Bags(30, Bags.Type.SAND));

        bagWarehouse.addOrder(bagWarehouse.getItems().get(0));

        bagWarehouse.addVIPOrder(bagWarehouse.getItems().get(0));

        Bags firstOrder = bagWarehouse.processOrder();
        System.out.println("In process: " + firstOrder.getType());

        System.out.println("Empty: " + bagWarehouse.getEmptyTypes());

        BoxWarehouse boxWarehouse = new BoxWarehouse();
        boxWarehouse.addItem(new Boxes(10, 20, 30, true));
        boxWarehouse.addItem(new Boxes(15, 25, 35, false));
        boxWarehouse.addItem(new Boxes(5, 10, 15, true));

        System.out.println("Fragile boxes: " + boxWarehouse.getFragileAmount());
        System.out.println("Sorted boxes: " + boxWarehouse.getSortedByLength());
    }
}
