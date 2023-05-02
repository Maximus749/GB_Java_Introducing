package Lesson_2.task1;

public interface Runner {
    /**
     * Прыжок
     * @param height
     * @return Результат прыжка (Удалось перепрыгнуть препятствие или нет)
     */
    default boolean jump(int height) {
        if (height <= getMaxJump()){
            System.out.printf("%s перепрыгнул через стену %d м.\n", getName(), height);
            return true;
        }
        else {
            System.out.printf("%s не смог перепрыгнуть через стену %d м.\n", getName(), height);
            return false;
        }
    }

    /**
     * Бег
     * @param lenght
     * @return Резкльтат забега (Улалось пробежать дистанцию или нет)
     */
    default boolean run(int lenght) {
        if (lenght <= getMaxRun()){
            System.out.printf("%s пробежал дорожку %d м.\n", getName(), lenght);
            return true;
        }
        else {
            System.out.printf("%s не смог пробежать дорожку %d м.\n", getName(), lenght);
            return false;
        }
    }

    /**
     * Получить имя бегуна
     * @return Имя
     */
    String getName();

    /**
     * Получить максимальную дистанцию
     * @return Длина
     */
    int getMaxRun();

    /**
     * Получить максммальную высоту
     * @return Высота
     */
    int getMaxJump();


}
