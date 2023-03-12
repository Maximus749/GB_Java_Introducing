public class Main {
    public static void main(String[] args) {
//        String str1 = "Hello World";
//        String str2 = "Привет Мир";
//        StringBuilder builder = new StringBuilder("Hello World");
//        builder.append("!").
//                append(" ").
//                append(str1).
//                append("!").
//                append(" ").
//                append(str2).
//                append("!");
//
//        System.out.println(builder);                                   // sout - сокращенно System.out.println
//        str1 += " ! !";
//        System.out.println(str1);


        String str = "";
        StringBuilder builder = new StringBuilder();
//
//        long begin = System.currentTimeMillis();
//        for (int i = 0; i < 100; i++) {
//            str += Character.getName(i);
//        }
//        System.out.println(str);
//        long end = System.currentTimeMillis();
//        System.out.println("to String: " + (end - begin));
//
//        begin = System.currentTimeMillis();
        for (int i = 0; i < 1_000; i++) {
            builder.append(Character.getName(i));
        }
//        end = System.currentTimeMillis();
//        System.out.println("to StringBuilder: " + (end - begin));

        String str1 = "Hello World!";
        System.out.println("*_".repeat(10));                // Данная команда повторяет строку заданное каличество раз
        System.out.println(str1.contains("N"));                      // находит, есть ли в строке указаный символ. Если есть выведет True
        System.out.println(str1.equals("N"));                        // Указывает равна ли строка указанному
        System.out.println(str1.replace("l", "p"));     // Заменит символы в принте. строка останется неизменна
        System.out.println(str1.replaceFirst("l", "p"));     // Заменит первый попавшийся символ в принте. строка останется неизменна
        System.out.println(str1.charAt(2));                                    // Покажет указанный символ
        String[] strings = str1.split(" ");                    // Распилит строку на массив строк (в данном случае по пробелам)
        for (String item: strings) {
            System.out.println(item);
        }

//        str1 = new StringBuilder(str1).reverse().toString();     // разворот строки через StringBuilder
//        System.out.println(str1);

        builder.replace(0, 1, "F");                 // Заменит указаный диапазон на указаную строку
        builder.reverse();                                          // развернет
        builder.insert(4, "World");                         // вставит в место указаного символа указаную строку
        builder.deleteCharAt(2);                                // Удаляет указаный по индексу символ
        builder.indexOf("=");                                          // Показывает индекс искомого элемента


//        System.out.println(Integer.toBinaryString(45678).length());
    }
}
