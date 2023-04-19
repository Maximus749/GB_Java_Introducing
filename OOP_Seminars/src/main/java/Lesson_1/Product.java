package Lesson_1;


/**
 * Продукт
 */
public class Product {
    protected String name;
    protected String brand;
    protected double price;

    int param1;
    String param2;
    boolean param3;
    String param4;

    public double getPrice(){                   // getter, accessor
        return price;
    }
    public void setPrice(double price) {        // setter newtator
        this.price = price;
    }


    {                                           // Инициализатор
//        System.out.println("Initialiser");
        param1 = 123;
        param2 = "---";
        param3 = true;
        param4 = "===";
    }

    /**
     * Создаем продукт с параметрами по умолчанию
     */
    public Product() {
        this("Продукт");
    }

    public Product(String name) {
        this(name, 1);
    }

    public Product(String name, double price) {
        this("Noname", name, price);
    }

    /**
     * Создаем продукт с 3 азадаваемыми порометрами
     * @param brand Бренд
     * @param name Название
     * @param price Цена
     */
    public Product(String brand, String name, double price) {
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }



    /**
     * Получить информацию по продукту
     * @return Информация по продукту
     */
    String displayInfo(){
        return  String.format("Брэнд- %s Товар- %s Цена- %f", brand, name, price);
    }
}
