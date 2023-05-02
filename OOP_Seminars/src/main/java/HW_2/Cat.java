package HW_2;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (appetite <= plate.getFood()) {
            satiety = true;
            plate.setFood(plate.getFood(), appetite);
            System.out.printf("Кот %s сыт\n", name);
        }
        else {
            System.out.printf("Кот %s остался голоден\n", name);
        }
    }
}
