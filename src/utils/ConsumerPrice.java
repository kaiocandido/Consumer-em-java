package utils;

import entities.Product;

import java.util.function.Consumer;

public class ConsumerPrice implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
