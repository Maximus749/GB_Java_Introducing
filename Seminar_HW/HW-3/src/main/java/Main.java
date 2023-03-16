import java.util.*;

//1. Реализовать алгоритм сортировки списков компаратором.
//2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
//3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
//4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
//5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
//6. Повторить пятый пункт но с LinkedList.
//7. Сравнить время работы пятого и шестого пунктов.
//Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и номером группы.
public class Main {
    public static void main(String[] args) {
//                                                          # 1
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list1.add(0, i);
        }
        System.out.println("list1 " + list1);
        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println("list1 " + list1);
        System.out.println("-=".repeat(30));
//                                                          # 2
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list2.add(new Random().nextInt(50));
        }
        System.out.println("list2 " + list2);
        Iterator<Integer> iterator = list2.iterator();
        while (iterator.hasNext()){
            int n = iterator.next();
            if (n %2 == 0) iterator.remove();
        }
        System.out.println("list2 " + list2);
        System.out.println("-=".repeat(30));
//                                                          # 3

        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list3.add(new Random().nextInt(25));
        }
        System.out.println("list3 " + list3);
        int min = list3.get(0);
        int max = list3.get(0);
        int summa = 0;
        for (int i = 1; i < list3.size(); i++) {
            if (list3.get(i) < min) min = list3.get(i);
            if (list3.get(i) > max) max = list3.get(i);
        }
        for (int n: list3) {
            summa += n;
        }
        int mid = summa / list3.size();
        System.out.println("min = " + min + " mid = " + mid + " max = " + max);

        System.out.println("-=".repeat(30));

//                                                          # 4

        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list4.add(new Random().nextInt(10));
        }
        System.out.println("list4 " + list4);
        ArrayList<Integer> list5 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list5.add(new Random().nextInt(10));
        }
        System.out.println("list5 " + list5);

        for (int i = 0; i < list5.size(); i++) {
            if (list4.contains(list5.get(i))) continue;
            else list4.add(list5.get(i));
        }
        System.out.println("list4 " + list4);

        System.out.println("-=".repeat(30));
//                                                          # 5
        ArrayList<Integer> list6 = new ArrayList<>();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            list6.add(0, 0);
        }
        long end = System.currentTimeMillis();
        System.out.println("to ArrayList: " + (end - begin));
//        System.out.println("list6 " + list6);

//                                                          # 6
        LinkedList<Integer> linkList = new LinkedList<>();
        begin = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            linkList.add(0, 0);
        }
        end = System.currentTimeMillis();
        System.out.println("to LinkedList: " + (end - begin));
//        System.out.println("linkList " + linkList);
    }
}
