//1 Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
//2 Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
//3 *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
//4 Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
//5 Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
//6 Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
//7 *Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
public class Main {
    static String reverseStr(String str){
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            temp = str.charAt(i) + temp;
        }
        return temp;
    }

    public static void main(String[] args) {
        // # 1

        String firstString = "Hello World!";
        String secondString = "Hello";
        String thirdString = "olleH";
        String fourthString = "!dlroW olleH";
        System.out.println("# 1" + firstString.contains(secondString));

        // # 2

        System.out.println("# 2" + firstString.equals(reverseStr(thirdString)));        // false
        System.out.println("# 2" + firstString.equals(reverseStr(fourthString)));       // true

        // # 3



        // # 4

        int a = 3;
        int b = 56;
        StringBuilder sbPlus = new StringBuilder();
        sbPlus.append(a).
            append(" + ").
            append(b).
            append(" = ").
            append(a + b);
        StringBuilder sbMin = new StringBuilder();
        sbMin.append(a).
                append(" - ").
                append(b).
                append(" = ").
                append(a - b);
        StringBuilder sbMult = new StringBuilder();
        sbMult.append(a).
                append(" * ").
                append(b).
                append(" = ").
                append(a * b);
        System.out.println(sbPlus);
        System.out.println(sbMin);
        System.out.println(sbMult);

        // #5
        int ind = sbPlus.indexOf("=");
        sbPlus.deleteCharAt(ind).
                insert(ind, " равно ");
        System.out.println(sbPlus);

        // # 6
        ind = sbMin.indexOf("=");
        sbMin.replace(ind, ind," равно ");
        System.out.println(sbMin);

        // # 7

        int numbers = 10_000;
        String str = "=".repeat(numbers);
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < numbers; i++) {
            builder.append("=");
        }

        // STRINGBUILDER
        long begin = System.currentTimeMillis();
        for (int i = 0; i < numbers; i++) {
            builder.replace(i, i, " равно ");               // Первое решение
//            int indSB = builder.indexOf("=");                 // Второе решение
//            builder.replace(indSB, indSB," равно ");
        }
        long end = System.currentTimeMillis();
        System.out.println("to StringBuilder: " + (end - begin));
//          STRING
        begin = System.currentTimeMillis();
        String newStr = str.replace("=","равно");   // Первое решение
//        for (int i = 0; i < numbers; i++) {                        // Второе решение
//            str.replace("=","равно").charAt(i);
//
//        }
        end = System.currentTimeMillis();
        System.out.println("to String: " + (end - begin));
//        System.out.println(newStr);


    }
}
