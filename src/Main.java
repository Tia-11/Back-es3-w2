import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import entities.Customer;
import entities.Order;
import entities.Product;
import java.time.LocalDate;

public class Main {

    static Customer customer1 = new Customer(1L, "Customer A", 1);
    static Customer customer2 = new Customer(2L, "Customer B", 2);

    static Product book1 = new Product(1L, "Book 1", "Books", 120.0);
    static Product book2 = new Product(2L, "Book 2", "Books", 90.0);
    static Product phone = new Product(3L, "Smartphone", "Electronics", 500.0);
    static Product babyProduct = new Product(4L, "Baby Toy", "Baby", 15.0);

    static Order order1 = new Order(101L, "Pending", LocalDate.now(), LocalDate.now().plusDays(5), List.of(book1), customer1);
    static Order order2 = new Order(102L, "Delivered", LocalDate.now().minusDays(2), LocalDate.now().minusDays(1), List.of(book2, phone), customer2);
    static Order order3 = new Order(103L, "Pending", LocalDate.now(), LocalDate.now().plusDays(3), List.of(babyProduct), customer2);

    public static List<Product> esercizio1(List<Product> products) {
        return products.stream()
                .filter(product -> "Books".equals(product.category) && product.price > 100.0)
                .collect(Collectors.toList());
    }

    public static List<Order> listaOrdini() {
        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        return orders;
    }

    public static List<Order> esercizio2(List<Order> orders) {
        return orders.stream()
                .filter(order -> order.products.stream()
                        .anyMatch(product -> "Baby".equals(product.category)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Product> listaProdotti = new ArrayList<>();
        listaProdotti.add(book1);
        listaProdotti.add(book2);
        listaProdotti.add(phone);
        listaProdotti.add(babyProduct);

        List<Product> listaProdottiFiltrata = esercizio1(listaProdotti);

        for (Product book : listaProdottiFiltrata) {
            System.out.println("Product Name: " + book.productName + ", Category: " + book.category + ", Price: " + book.price);
        }

        List<Order> listaOrdini = listaOrdini();
        List<Order> ordiniConProdottiBaby = esercizio2(listaOrdini);

        for (Order order : ordiniConProdottiBaby) {
            System.out.println("Order ID: " + order.orderID + ", Status: " + order.status);
        }
    }
}