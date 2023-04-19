package Lesson_1;

import java.util.List;

public class ChoolateVendingMachine {
    private final List<Product> products;

    public ChoolateVendingMachine(List<Product> products) {
        this.products = products;
    }

    public ChocolateBar getChocolate(String name, int weight) {
        for(Product product: products) {
            if (product instanceof ChocolateBar) {
                if (product.getName() == name && ((ChocolateBar)product).getWeight() == weight) {
                    return (ChocolateBar)product;
                }
            }
        }
        return null;
    }
}
