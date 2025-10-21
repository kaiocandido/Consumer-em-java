import entities.Product;
import utils.ConsumerPrice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("Hd case", 80.90));

        //forma 1
        //list.forEach(new ConsumerPrice());
        //list.forEach(System.out::println);

        //forma 2
        //list.forEach(Product::consumerPriceVoid);
        //list.forEach(System.out::println);

        //forma 3
        //list.forEach(Product::consumerPriceVoid2);
        //list.forEach(System.out::println);

        //forma 4
        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
        list.forEach(cons);
        list.forEach(System.out::println);

    }
}