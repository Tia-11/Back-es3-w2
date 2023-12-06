package entities;

public class Product {
    public Long productID;
    public String productName;
    public String category;
    public Double price;

    public Product(Long productID, String productName, String category, Double price) {
        this.productID = productID;
        this.productName = productName;
        this.category = category;
        this.price = price;
    }

}
