import java.util.*;
import java.util.stream.*;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return id + " " + name + " " + price;
    }
}

public class StreamProducts {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product(1, "Laptop", 55000),
            new Product(2, "Phone", 25000),
            new Product(3, "Headphones", 3000),
            new Product(4, "Monitor", 12000)
        );

        System.out.println("Products Above 10000:");
        products.stream()
                .filter(p -> p.price > 10000)
                .forEach(System.out::println);

        double avgPrice = products.stream()
                                  .mapToDouble(p -> p.price)
                                  .average()
                                  .orElse(0.0);
        System.out.println("\nAverage Price: " + avgPrice);

        List<String> names = products.stream()
                                     .map(p -> p.name.toUpperCase())
                                     .collect(Collectors.toList());
        System.out.println("\nProduct Names in Uppercase:");
        names.forEach(System.out::println);
    }
}
