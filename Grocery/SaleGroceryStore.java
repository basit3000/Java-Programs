public class SaleGroceryStore extends GroceryStore {
    private int discount;
    public SaleGroceryStore(String item_name, float price, int discount) {
        super(item_name, price);
        this.discount = discount;
        price = price * discount;
    }
    public SaleGroceryStore(String item_name, float price, int quantity, int discount) {
        super(item_name, price, quantity);
        this.discount = discount;
    }
    public void setDiscount(int discount){
        this.discount = discount;
    }
    public int getDiscount(){
        return discount;
    }
}
