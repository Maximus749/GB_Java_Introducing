import java.util.Random;

//Первый семинар.
//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//        Пункты реализовать в методе main
//        *Пункты реализовать в разных методах
//
//        int i = new Random().nextInt(k); //это кидалка случайных чисел!)
public class Main {

    public static void main(String[] args) {
        int i = new Random().nextInt(2000);
        //--------------------------------------------------------------------------------------------------------------
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        int n = Integer.toBinaryString(i).length();
        System.out.println(n);
        //--------------------------------------------------------------------------------------------------------------
        int cnt = 0;                                                        //        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        int[] tmp1 = new int[Short.MAX_VALUE - i];
        int ind = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                tmp1[ind] = j;
                if (tmp1[ind] != 0){
                    cnt ++;
                }
                ind++;
            }
        }
        int[] m1 = new int[cnt];
        for (int j = 0; j < tmp1.length; j++) {
            if (tmp1[j] != 0) m1[j] = tmp1[j];
        }
        for (int item : m1) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println();
        //--------------------------------------------------------------------------------------------------------------
        int[] tmp2 = new int[Short.MIN_VALUE * -1 + i];                     //        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        ind = 0;
        cnt = 0;
        for (int j = Short.MIN_VALUE; j <= i; j++) {
            if (j % n != 0){
                tmp2[ind] = j;
                if (tmp2[ind] != 0){
                    cnt++;
                }
                ind++;
            }
        }
        int m2[] = new int[cnt];
        for (int j = 0; j < tmp2.length; j++) {
            if (tmp2[j] != 0) m2[j] = tmp2[j];
        }
        for (int item : m2) {
            System.out.print(item + " ");
        }
    }
}
