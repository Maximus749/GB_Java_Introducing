package Lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
//        System.out.println(product1.displayInfo());

        Product product2 = new Product("Бутылка с молоком", 200);
//        System.out.println(product2.displayInfo());

        Product product3 = new Product("Ok", "11", -250);
//        System.out.println(product3.displayInfo());

        BottleOfWater bow1 = new BottleOfWater("Вода", 100.5, 2);
        BottleOfWater bow2 = new BottleOfWater("Вода", 100.5, 3);
        BottleOfWater bow3 = new BottleOfWater("Вода", 100.5, 1);
//        System.out.println(bow1.displayInfo());

        Product bom1 = new BottleOfMilk("Молоко", 150.5, 1, 4);
//        System.out.println(bom1.displayInfo());

        Product chocolate1 = new ChocolateBar("Аленка", 120, 90);
        Product chocolate2 = new ChocolateBar("Snikers", 80, 70);
        Product chocolate3 = new ChocolateBar("Россия", 140, 90);
        System.out.println(chocolate1.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(bow1);
        products.add(bow2);
        products.add(bow3);
        products.add(bom1);
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);

        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(products);
        ChoolateVendingMachine chocMachine = new ChoolateVendingMachine(products);

        BottleOfWater bottleOfWaterRez = machine.getBottleOfWater("Вода", 2);
        if (bottleOfWaterRez != null){
            System.out.println("Вы купили:");
            System.out.println(bottleOfWaterRez.displayInfo());
        } else {
            System.out.println("Такой воды нет");
        }

        ChocolateBar chocolateRez = chocMachine.getChocolate("Snikers", 70);
        if (chocolateRez != null) {
            System.out.println("Вы купили: ");
            System.out.println(chocolateRez.displayInfo());
        }
        else {
            System.out.println("Такого шаколада нет.");
        }
    }
}
