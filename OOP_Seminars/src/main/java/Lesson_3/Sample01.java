package Lesson_3;

/**
 * Создать классы Собака и Кошка наследованием от класса Животное.
 * Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препяствия.
 * Результатом выполнения будет печать в консоль. (Например, dog.run(150); -> 'Бобик пробежал 150 метров');
 * У каждого животного ессть ограничения ана действия:
 * (бег: кот - 200м, собака 500 м, Плавание: Кот не умеет плавать, собака 10 м)
 * Добавить подсчет животных
 */
public class Sample01 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Персик", 150);
        Cat cat2 = new Cat("Пушок", 130);
        Cat cat3 = new Cat("Пушок", 120);
        Dog dog1 = new Dog("Шарик", 300, 5);
        Dog dog2 = new Dog("Бобик", 230, 5);
        Animal animal1 = new Animal("Лапы и хвост1", 180, 7);
        Animal animal2 = new Animal("Лапы и хвост2", 470, 9);

        System.out.printf("Всего создано %d животных\n", Animal.getCounter());
        System.out.printf("Всего создано %d котов\n", Cat.getCounter());
        System.out.printf("Всего создано %d собак\n", Dog.getCounter());

    }
}
 class Animal {
    protected String name;
    private int maxRun;
    private int maxSwim;
    private static int counter;

     public static int getCounter() {
         return counter;
     }

     /**
      * Инициализатор
      */
     {
         counter++;
     }

     public Animal(String name, int maxRun, int maxSwim) {
         this.name = name;
         this.maxRun = maxRun;
         this.maxSwim = maxSwim;
     }

     public Animal(String name, int maxRun) {
         this.name = name;
         this.maxRun = maxRun;
     }

     public void run(int distance) {
         if (maxRun <= distance) System.out.printf("%s пробежал %f метров\n", name, distance);
         else System.out.printf("%s не смог пробежать %f метров\n", name, distance);
     }
     public void swim(int distance) {
         if (maxSwim <= distance) System.out.printf("%s проплыл %f метров\n", name, distance);
         else System.out.printf("%s не смог проплыть %f метров\n", name, distance);
     }
 }

 class Dog extends Animal {
     private static int counter;
    public static int getCounter() {
         return counter;
     }
     {
         counter++;
     }
     public Dog(String name, int maxRun, int maxSwim) {
         super(name, maxRun, maxSwim);
     }
     public Dog() {
         super("Бобик", 200, 10);
     }

 }

class Cat extends Animal {
    private static int counter;
    public static int getCounter() {
        return counter;
    }
    {
        counter++;
    }
    public Cat(String name, int maxRun) {
        super(name, maxRun);
    }


    @Override
    public void swim(int distance) {
        System.out.printf("Кот %s не умеет плавать\n", name);
    }
}