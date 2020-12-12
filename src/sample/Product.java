package sample;

public class Product {
    private String name;
    private double price;
    private int quantity;


    //constructor
    public Product(){
        this.name = "";
        this.price = 0.0;
        this.quantity = 0;
    }

    //constructor overloading
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
