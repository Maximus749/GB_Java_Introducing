package HW_2;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }
    public int addFood(int add) {
        food += add;
        return  food;
    }

    public void setFood(int food, int appetite) {
            this.food = food - appetite;
    }

}
