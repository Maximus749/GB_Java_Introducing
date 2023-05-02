package Lesson_2.task1;

public class Track implements Obstacle{
    private int lenght;
    public Track(int lenght) {
        this.lenght = lenght;
    }
    @Override
    public int getLenght() {
        return lenght;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
