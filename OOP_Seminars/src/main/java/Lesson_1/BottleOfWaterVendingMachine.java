package Lesson_1;

import java.util.List;

public class BottleOfWaterVendingMachine {
    private final List<Product> products;

    public BottleOfWaterVendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, int volume) {
        for (Product product: products) {
            if (product instanceof BottleOfWater){
                if (product.getName() == name && ((BottleOfWater)product).getVolume() == volume){
                    return (BottleOfWater)product;
                }
            }
        }
        return  null;
    }
}
