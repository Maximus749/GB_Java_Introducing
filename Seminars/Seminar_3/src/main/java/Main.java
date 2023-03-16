import java.util.*;

public class Main {
    public static void main(String[] args) {
        Object[] i;

        ArrayList list1 = new ArrayList();           // Создали СПИСОК
                                                    // В список можно добавлять элементы разных типов
        list1.add(4);                                // Добавили элемент в список
        list1.add(8);
        list1.add(12);
        list1.add("Привет");
        list1.add(false);
        list1.add(.5f);
        list1.add("f");
        System.out.println(list1);                   // Распечаатывает все элементы в одну строку
        list1.remove(1);                        // Удаляем из списка элемент по индексу
        list1.forEach(n -> System.out.println(n));    // РАспечатывает каждый элемент в новой строке, аналог цикла только в одну строку
//        list1.forEach(n -> System.out.println(n + ", "));    // РАспечатывает каждый элемент в новой строке, аналог цикла только в одну строку
        if (list1.get(1) instanceof String) ((String) list1.get(1)).toUpperCase();
        System.out.println(list1);

        ArrayList<String> list = new ArrayList<>();     // Создаем список из строк
        ArrayList<String> strings = new ArrayList<>();
        strings.addAll(list);                           // Добавляет в список все элементы из указанного списка
        strings.clear();                                // Удаляет все элементы из списка
        list.add("Привет");
        list.add("Синий");
        list.add("Берег");
        list.add("Рот");
        list.add("Ствол");
        System.out.println(list);
        System.out.println(list.size());                // Показывает размер списка
        list.add(list.size()/ 2, "Стоп");   // Вставляет элемент в середину списка
        System.out.println(list);
        list.set(list.size()/ 2, "Стоп2");               // поменяет элемент вместо указаного
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(2);
        list2.add(6);
        list2.add(1);
        list2.add(9);
        list2.add(3);
        list2.get(3);                                   // получить элемент указаного индекса
//        Collections.sort(list2);
//        System.out.println(list2);
        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;                           // Сортировка по возрастанию
                return o2 - o1;                             // Сортировка по убыванию
            }
        });
        System.out.println(list2);
        System.out.println("-=".repeat(30));
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
//            list3.add(new Random().nextInt(5));
            list4.add(new Random().nextInt(5));
        }
//        System.out.println("#3" + list3);
        System.out.println("#4" + list4);
//        list3.retainAll(list4);                             // Оставляет в списке только те элементы, которые есть во втором списке
//        list3.removeAll(list4);                             // Удаляет из списка те элементы, которые есть во втором списке
//        System.out.println("#3" + list3);
//        System.out.println("#4" + list4);

        for (int j = 0; j < list4.size(); j++) {
            System.out.println(list4.get(j));
        }
        System.out.println("-=".repeat(30));

        Iterator<Integer> iterator = list4.iterator();      // Итератор как forEach, но может удалять элементы из списка
        while (iterator.hasNext()){
            int n = iterator.next();
            System.out.println(n);
            if (n >= 3) iterator.remove();
        }
        System.out.println("#4" + list4);

        ListIterator<Integer> lIterator = list4.listIterator(list4.size());      //  ListIterator как Итератор, но может проходить по списку с конца.
        while (lIterator.hasPrevious()){                                         // Для этого указывается точка входа - list4.size()
            int n = lIterator.previous();
            System.out.println(n);
        }

        LinkedList<Integer> linkList = new LinkedList<>();          // Каждый элемент это блок, в котором указаны:
                                                                    // Зночение
                                                                    // Хеш значения
                                                                    // Хеш следуюшего элемента
                                                                    // Хеш предыдущего элемента

    }
}
