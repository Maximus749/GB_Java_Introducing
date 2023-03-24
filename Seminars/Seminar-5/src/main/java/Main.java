//                                          MAP

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
//            hashMap.put(i, String.valueOf(i ));
            hashMap.put(i, String.valueOf(i * 2));
        }
        hashMap.forEach((k, v) -> System.out.print(k + "=" + v + ", "));
        System.out.println();

        Set<Integer> keys = hashMap.keySet();                   // создаем множество из ключей

        for (Integer k:keys) {                                  // в данном цикле нельзя удалять и изменять элементы
            System.out.print(hashMap.get(k) + ", ");
        }
        System.out.println();

//        Iterator<Integer> iterator = keys.iterator();           // В этом методе в отличие от forEach можно удалять элементы
//        while (iterator.hasNext()){
//            String v = hashMap.get(iterator.hasNext());
//            System.out.println(v + ", ");
//            iterator.remove();
//        }
//        for (int i = 0; i < keys.size(); i++) {
//            System.out.print(hashMap.get(keys.toArray()[i]) + ", ");
//        }
//        System.out.println();


        System.out.println(hashMap);
        Collection<String> v = hashMap.values();                    // Получаем значения из hashMap
        Set<Map.Entry<Integer, String>> e = hashMap.entrySet();     // Получаем все ключи и значения из hashMap
        System.out.println("entrySet " + e);
        hashMap.getOrDefault(21, "Указаный ключ не найден");    // Выводит значение указаного ключа. Если такого нет, выведет указаный текст
        hashMap.compute(21, (k, va) -> va = "1");               // Можно изменять элементы, если нет элемента с указаным ключем, создаст
        System.out.println("compute " + hashMap);
        hashMap.computeIfPresent(3, (k, va) -> va += "2");      // Изменит элемент если таковой есть
        System.out.println("computeIfPresent " + hashMap);
        hashMap.computeIfAbsent(3, va ->  "3");                 // Создаст элемент если такового нет
        System.out.println("computeIfAbsent " + hashMap);

//        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();   // То же самое что HashMap, только сохраняет последовательность

//        TreeMap<String, String> tree = new TreeMap<>();             // Сразу сортирует по ключам
//        tree.put("Один", "1");
//        tree.put("Два", "1");
//        tree.put("Три", "1");
//        tree.put("Пять", "1");
//        tree.headMap("Два", true);                      // Возвращает с первого до указаного. true-показывает вкллючать указаный или false- не включать
//        tree.tailMap("Два", false);                     // Возвращает в указаного до последнего
//
//        System.out.println("tree " + tree);

//        ArrayList<String> age = new ArrayList<>();
//        age.add("Первый");
//        age.add("Второй");
//        age.add("Третий");
//        age.add("Пятый");
//        ArrayList<String> gender = new ArrayList<>();
//        gender.add("m");
//        gender.add("f");
//        gender.add("m");
//        gender.add("f");

//        LinkedList<Integer> iD = new LinkedList<>();
//        TreeMap<String, Integer> treeMap = new TreeMap<>();
//        Integer[] cnt = new Integer[]{0};
//        AtomicInteger cnt = new AtomicInteger();
//        age.forEach(n -> treeMap.put(n, cnt.getAndIncrement()));
//        System.out.println("treeMap " + treeMap);
//        treeMap.forEach((k, val) -> iD.add(val));
//        System.out.println("iD " + iD);
//        treeMap.clear();
//        iD.forEach(n -> treeMap.put(gender.get(n), n));
//        System.out.println("treeMap " + treeMap);


    }
}
