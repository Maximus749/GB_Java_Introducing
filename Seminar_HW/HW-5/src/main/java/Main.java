//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. Пусть дан список сотрудников:
//        Иван Иванов
//        Светлана Петрова
//        Кристина Белова
//        Анна Мусина
//        Анна Крутова
//        Иван Юрин
//        Петр Лыков
//        Павел Чернов
//        Петр Чернышов
//        Мария Федорова
//        Марина Светлова
//        Мария Савина
//        Мария Рыкова
//        Марина Лугова
//        Анна Владимирова
//        Иван Мечников
//        Петр Петин
//        Иван Ежов
//        Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности имён.
//        *Популярность не имён а номеров телефонов

import java.util.*;

public class Main {
    static String[] names = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин",
            "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
            "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};
    public static void main(String[] args) {
        HashMap<Integer, ArrayList<String>> contacts = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            String phone = "89";
            ArrayList<String> temp = new ArrayList<>();
            for (int k = 0; k < 8; k++) {
                phone += (new Random().nextInt(9));
            }
            temp.add(names[i]);
            temp.add(phone);
            temp.add(String.valueOf(new Random().nextInt(999)));
            contacts.put(i + 1, temp);
        }
        contacts.forEach((k, v) -> System.out.println(k + " = " + v));
        System.out.println("=-".repeat(30));
        TreeMap<Integer, Integer> sortTree = new TreeMap<>();
        LinkedList<Integer> sortedId = new LinkedList<>();
        int ind = 0;
        contacts.forEach((k, v) -> sortTree.put(Integer.parseInt(v.get(2)), k));
        sortTree.forEach((k, v) -> System.out.println(k + " , " + v));
        sortTree.forEach((k, v) -> sortedId.add(v));
        System.out.println(sortedId);
        for (int i = sortedId.size() - 1; i >= 0; i--) {
            System.out.println(contacts.get(sortedId.get(i)).get(0) + ", " + contacts.get(sortedId.get(i)).get(2) + " звонков");
        }

    }
}
