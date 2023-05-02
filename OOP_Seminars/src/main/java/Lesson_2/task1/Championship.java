package Lesson_2.task1;

public class Championship {
    public static void main(String[] args) {

        // Бегуны
        Runner[] runners = {
                new Cat("Барсик", 1500, 2),
                new Cat("Персик", 1700, 1),
                new Robot("R2D2", 99999, 0),
                new Robot("R3D3", 5000, 5),
                new Human("Вася", 2500, 2),
                new Human("Петя", 3500, 1)
        };

        // Препятствия
        Obstacle[] obstacles = {
                new Track(1200),
                new Wall(3),
                new Track(2000),
                new Wall(2),
                new Track(3000),
                new Wall(4)
        };

        for (Runner runner: runners) {
            for (Obstacle obstacle: obstacles) {
                if (obstacle instanceof Track) {
                    if(!runner.run(obstacle.getLenght())) {
                        break;
                    }
                }
                else if (obstacle instanceof Wall){
                    if (!runner.jump(obstacle.getHeight())) {
                        break;
                    }
                }
//                System.out.println("Победа!" + runner.getName());

            }
        }

    }
}
