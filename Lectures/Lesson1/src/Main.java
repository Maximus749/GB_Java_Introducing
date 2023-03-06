import java.util.Scanner;

public class Main {
    public static void sayHi(){
        System.out.println("Hi!");
    }
    static int sum(int a, int b) {
        return a+b;
    }
    static double factor(int n) {
        if(n==1)return 1;
        return n * factor(n-1);
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++)
//            System.out.println("Привет мир!!!");
//        int[] arr = new int[10];                            //Массивы
//        System.out.println(arr.length); // 10
//        arr = new int[] { 1, 2, 3, 4, 5 };
//        System.out.println(arr.length); // 5

//        int[][] arr = new int[3][5];                        // Многомерные массивы
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("%d ", arr[i][j]);
//            }
//            System.out.println();

//                                                              Получение данных из терминала
//                                                              Строки
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("name: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Привет, %s!", name);
//        iScanner.close();

//                                                               Некоторые примитивы
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        int x = iScanner.nextInt();
//        System.out.printf("double a: ");
//        double y = iScanner.nextDouble();
//        System.out.printf("%d + %f = %f", x, y, x + y);
//        iScanner.close();

//                                                               Проверка на соответствие получаемого типа
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        boolean flag = iScanner.hasNextInt();
//        System.out.println(flag);
//        int i = iScanner.nextInt();
//        System.out.println(i);
//        iScanner.close();

//                                                               Форматированный вывод
//        int a = 1, b = 2;
//        int c = a + b;
//        String res = String.format("%d + %d = %d \n", a, b, c);
//        System.out.printf("%d + %d = %d \n", a, b, c);
//        System.out.println(res);
        //        Виды спецификаторов
        //        %d: целочисленных значений
        //        %x: для вывода шестнадцатеричных чисел
        //        %f: для вывода чисел с плавающей точкой
        //        %e: для вывода чисел в экспоненциальной форме,
        //        например, 3.1415e+01
        //        %c: для вывода одиночного символа
        //        %s: для вывода строковых значений

//        sayHi();                                    // Методы
//        System.out.println(sum(1, 3)); // 4
//        System.out.println(factor(5)); // 120.0

//        int value = 321;                            // Цикл while
//        int count = 0;
//        while (value != 0) {
//            value /= 10;
//            count++;
//        }
//        System.out.println(count);
//        int value = 321;                            //Цикл do while
//        int count = 0;
//        do {
//            value /= 10;
//            count++;
//        } while (value != 0);
//        System.out.println(count);

//        for (int i = 0; i < 5; i++) {               // Вложенные циклы
//            for (int j = 0; j < 5; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        int arr[] = new int[10];                    // for each
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();

    }
}