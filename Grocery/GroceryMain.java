public class GroceryMain {
    public static void main(String[] args) {
        GroceryStore g1 = new GroceryStore("Pepsi", 1.5f);
        GroceryStore g2 = new GroceryStore("Miranda", 1.5f);
        GroceryStore g3 = new GroceryStore("7UP", 1.5f, 30);
        GroceryStore g4 = new GroceryStore("Fish", 3f, 60);
        System.out.println("Item name: " + g1.getItemName() + " and the price is: " + g1.getPrice() + " and Quantity: " + g1.getQuantity());
        System.out.println("Item name: " + g2.getItemName() + " and the price is: " + g2.getPrice() + " and Quantity: " + g2.getQuantity());
        System.out.println("Item name: " + g3.getItemName() + " and the price is: " + g3.getPrice() + " and Quantity: " + g3.getQuantity());
        System.out.println("Item name: " + g4.getItemName() + " and the price is: " + g4.getPrice() + " and Quantity: " + g4.getQuantity());
        g4.setItemName("Tuna Fish");
        g4.setPrice(3.5f);
        g4.setQuantity(90);
        System.out.println("Item name: " + g4.getItemName() + " and the price is: " + g4.getPrice() + " and Quantity: " + g4.getQuantity());
        SaleGroceryStore sg1 = new SaleGroceryStore(g3.getItemName(), g3.getPrice(), g3.getQuantity(), 10);
        System.out.println("Item name: " + sg1.getItemName() + " and the price is: " + sg1.getPrice() + " and Quantity: " + sg1.getQuantity() + " Discount: " + sg1.getDiscount());
    }
}
