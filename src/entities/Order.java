package entities;

import java.time.LocalDate;
import java.util.List;

public class Order {
    public Long orderID;
    public String status;
    public LocalDate orderdate;
    public LocalDate deliveryDate;
    public List<Product> products;
    public Customer customer;

    public Order(Long orderID, String status, LocalDate orderdate, LocalDate deliveryDate, List<Product> products, Customer customer) {
        this.orderID = orderID;
        this.status = status;
        this.orderdate = orderdate;
        this.deliveryDate = deliveryDate;
        this.products = products;
        this.customer = customer;
    }
}
