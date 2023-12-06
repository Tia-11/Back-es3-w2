package entities;

public class Customer {
    public Long customerID;
    public String customerName;
    public Integer tier;

    public Customer(Long customerID, String customerName, Integer tier) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.tier = tier;
    }
}
