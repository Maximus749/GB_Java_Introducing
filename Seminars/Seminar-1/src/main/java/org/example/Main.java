package org.example;


public class Main {


    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int[] ints = new int[10];                   // Создали массив 10 элем
        ints[3] = 5;
        for (int i = 0; i < ints.length; i++){      // Распечатываем массив
            System.out.print(ints[i] + " ");
        }
        System.out.println();
        int[] tmp = new int[ints.length * 2 + 1];   // Создаем временный массив нужной длины
        for (int i = 0; i < ints.length; i++) {     // Перепичываем данные из первого массива во второй
            tmp[i] = ints[i];
        }
        ints = tmp;                                 //  приравниваем первый массив ко второму
        for (int item : ints) {                     // распечатываем массив
            System.out.print(item + " ");
        }
//


    }
}