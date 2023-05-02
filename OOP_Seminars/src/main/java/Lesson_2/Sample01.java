package Lesson_2;

public class Sample01 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик", 12);
        Cat cat1 = new Cat("Барсик", "Белый");
        Animal cat2 = new Cat("Персик", "Рыжий");
        dog1.voice();
        cat1.voice();
        System.out.printf("Имя котика: %s, Цвет котика: %s\n", cat1.getName(), cat1.getColor());

        if (cat2 instanceof Dog) {              // Не сработает

            System.out.printf("Имя котика: %s\n", ((Dog)cat2).getName());
        }
        voiceAllAnimals (new Animal[] {cat1, cat2, dog1});

        Catv2 catv2 = new Catv2("Барсик");
        Runnable catv2_2 = new Catv2("Пушок");
        Dogv2 dogv2_1 = new Dogv2("Белка");
        Bird bird1 = new Bird("Кеша");
        System.out.printf("name of 2-nd cat: %s and name of 1-st cat: %s\n",
                ((Catv2)catv2_2).getName(), ((Catv2)catv2).getName());

        Object[] animals2 = new Object[] {catv2, catv2_2, dogv2_1, bird1};

        for (Object animal: animals2) {
            if (animal instanceof Flyable){
                ((Flyable)animal).fly(1500);
            }
        }

    }

    public static void voiceAllAnimals(Animal[] animals) {
        for (Animal animal: animals) {
            animal.voice();
            if (animal instanceof Dog) {
                System.out.printf("Собака весит %s кг.\n", ((Dog)animal).getWeight());
            }
        }
    }




}

interface Runnable {
    String getName();
    void run (int distance);
    void swim (int distance);
}
interface Flyable {
    void fly (int distance);
}

class Dogv2 implements Runnable{
    public Dogv2(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    private String name;
    @Override
    public void run(int distance) {
        System.out.printf("%s бегает на %s метров\n", name, distance);
    }

    @Override
    public void swim(int distance) {
        this.name = name;
        System.out.printf("%s плавает на %s метров\n", name, distance);
    }
}
class Catv2 implements Runnable{

    public Catv2(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run(int distance) {
        System.out.printf("%s бегает на %s метров\n", name, distance);
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s плавает на %s метров\n", name, distance);
    }
}
class Bird implements Runnable, Flyable {

    public Bird(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    private String name;
    @Override
    public void run(int distance) {
        System.out.printf("%s бегает на %s метров\n", name, distance);
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s плавает на %s метров\n", name, distance);
    }

    @Override
    public void fly(int distance) {
        System.out.printf("%s летает на %s метров\n", name, distance);
    }
}

abstract class Animal{
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void jump() {
        System.out.println("Животное прыгнуло.");
    }
    public abstract void voice();

}

class Dog extends Animal{
    public int getWeight() {
        return weight;
    }

    private int weight;
    public Dog(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public void jump() {
        System.out.println("Собака прыгает.");
    }

    @Override
    public void voice() {
        System.out.println("Гав-гав");
    }
}
class Cat extends Animal{
    private String color;

    public String getColor() {
        return color;
    }

    public Cat(String name, String color) {
        super(name);
        this.color = color;

    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает.");
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }
}

