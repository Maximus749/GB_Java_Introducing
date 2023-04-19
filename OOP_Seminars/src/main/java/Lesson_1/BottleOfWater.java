package Lesson_1;

public class BottleOfWater extends Product{            // Н А С Л Е Д О В А Н И Е

    private int volume;

    public BottleOfWater(String name, double price, int volume){
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }


    public

    @Override
    String displayInfo() {
//        return super.displayInfo();
        return  String.format("%s - %s - %f - Объем: %d", brand, name, price, volume);
    }
}
