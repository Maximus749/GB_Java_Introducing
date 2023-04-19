package Lesson_1;

public class ChocolateBar extends Product{
    private int weight;

    public ChocolateBar(String name, double price, int weight) {
        super(name, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    String displayInfo() {
//        return super.displayInfo();
        return String.format("%s - %s - %f - weight: %d", brand, name, price, weight);
    }
}
