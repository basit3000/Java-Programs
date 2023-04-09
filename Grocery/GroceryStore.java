public class GroceryStore {
    private String item_name;
    private float price;
    private int quantity;
    public GroceryStore(String item_name, float price){
        this.item_name = item_name;
        this.price = price;
        quantity = 1;
    }
    public GroceryStore(String item_name, float price, int quantity){
        this.item_name = item_name;
        this.price = price;
        this.quantity = quantity;
    }
    public void setItemName(String item_name){
        this.item_name = item_name;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public String getItemName(){
        return item_name;
    }
    public float getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
}
    