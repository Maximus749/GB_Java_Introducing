package Lesson_2.task1;

public class Wall implements Obstacle{

    private int hight;

    public Wall(int hight) {
        this.hight = hight;
    }

    @Override
    public int getLenght() {
        return 0;
    }

    @Override
    public int getHeight() {
        return hight;
    }
}
