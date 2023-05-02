package Lesson1.Ex003;

public class Program {
    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        System.out.println(a);
        a.setX(2);
        a.setY(3);
        System.out.println(a.getX());
        System.out.println(a.getY());


        Point2D b = new Point2D(3);
        System.out.println(b);
        b.setY(6);
        System.out.println(b);
//        System.out.println(distance(a, b));
        var dis = Point2D.distance(a, b);
        System.out.println(dis);

    }
}
