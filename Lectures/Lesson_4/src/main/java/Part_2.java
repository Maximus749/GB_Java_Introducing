import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Part_2 {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();                                                                      // HashMap
        db.put(1, "ОдиН"); System.out.println(db);                  // Добавляем ключ, значение
        db.putIfAbsent(1, "Один"); System.out.println(db);          // Добавляем ключ, значение, если нет такого ключа
        db.put(1, "один"); System.out.println(db);                  // Если при попытке добавления ключ уже есть, значение перезапишется
        db.put(2, "два"); System.out.println(db);
        db.put(3, "три"); System.out.println(db);
        db.put(31, "три один"); System.out.println(db);
        db.put(13, "один три"); System.out.println(db);
        db.put(null, "!null"); System.out.println(db);
        db.put(null, null); System.out.println(db);
        System.out.println("-=".repeat(30));
        System.out.println(db.get(1));                              // - получение значения по указанному ключу.
        System.out.println(db.remove(1));                       // удаляет пару по указанному ключу.
        System.out.println(db.containsValue("один"));                //  проверка наличия значения.
        System.out.println(db.containsKey(2));                       // проверка наличия ключа.
        System.out.println(db.keySet());                            // возвращает множество ключей.
        System.out.println(db.values());                            // возвращает набор значений.
        System.out.println(db);
        System.out.println("-=".repeat(30));

        for (var item: db.entrySet()) {
            System.out.printf("[%d, %s], ", item.getKey(), item.getValue());
        }
        System.out.println();
        Map<Integer, String> map1 = new HashMap<>();                // Создается Map с количеством элементов по умолчанию
        Map<Integer, String> map2 = new HashMap<>(9);    // Создается Map с заданным количеством элементов
        Map<Integer, String> map3 = new HashMap<>(9, 0.9f);    // Создается Map с заданным количеством элементов и заданым фактором наполнения, при котором увеличивается Map
        System.out.println("-=".repeat(30));

        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(1, "один"); System.out.println(tMap);
        tMap.put(6, "шесть"); System.out.println(tMap);
        tMap.put(4, "четыре"); System.out.println(tMap);
        tMap.put(3, "три"); System.out.println(tMap);
        tMap.put(2, "два"); System.out.println(tMap);               // Выводит сортированый TreeMap
        System.out.println(tMap.descendingKeySet());                // Выводит ключи в обратной сортировке
        System.out.println(tMap.descendingMap());                   // Выводит TreeMap в обратной сортировке
        System.out.println(tMap.get(6));                            // Выводит Значение по ключу
        System.out.println(tMap.remove(6));                     // Удаляет пару по ключу
        System.out.println(tMap);
        System.out.println(tMap.tailMap(2));                 // Выводит сортированый TreeMap от указаного ключа
        System.out.println(tMap);
        tMap.put(6, "шесть");
        System.out.println(tMap.headMap(4));                   // Выводит сортированый TreeMap до указаного ключа не внлючая
        System.out.println(tMap.firstEntry());                      // Выводит первый элем сортированого TreeMap
        System.out.println(tMap.lastEntry());                       // Выводит последниц элем сортированого TreeMap

        Map<Integer, String> linkmap = new LinkedHashMap<>();         // то же что HashMap, но со связями и более медленный
        linkmap.put(1, "ОдиН"); System.out.println(linkmap);          // Добавляем ключ, значение

    }
}
