

import java.util.*;

public class Main {
    static LinkedList<ArrayList<String>> contacts = new LinkedList<>();         // Список контактов
    static  Scanner input = new Scanner(System.in);                             // Scanner
    public static void main(String[] args) {
        int numId = 1;
        GetData(numId);
        NextOperation();
        SortList(contacts);

    }

    public static void NextOperation(){
        String choice;
        System.out.println("Введите 1 если хотите увидеть список, сортированный по полу и возрасту, \n" +
                "нажмите любую другую клавишу для выхода: ");
        choice = input.nextLine();
        if (choice.equals("1")){
//        while (choice.equals("1")){
            SortList(contacts);
            System.out.println("Нажмите любую другую клавишу для выхода: ");
            choice = input.nextLine();
        }
    }
    public static void SortList(LinkedList<ArrayList<String>>col) {         // Сортировка по полу и возрасту
        Comparator<ArrayList<String>> SortByAge = new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                if (Integer.parseInt(o1.get(4)) > Integer.parseInt(o2.get(4))) return 1;
                else if (Integer.parseInt(o1.get(4)) < Integer.parseInt(o2.get(4))) return -1;
                return 0;
            }
        };
        col.sort(SortByAge);
//        System.out.println("Сортировка по возрасту");
//        PrintList(col);
        Comparator<ArrayList<String>> SortByGender = new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> o1, ArrayList<String> o2) {
                if (o1.get(5).charAt(0) > o2.get(5).charAt(0)) return 1;
                else if (o1.get(5).charAt(0) < o2.get(5).charAt(0)) return -1;
                return 0;
            }
        };
        col.sort(SortByGender);
//        System.out.println("Сортировка по полу");
        PrintList(col);
    }
    public static void PrintList(LinkedList<ArrayList<String>> col){            // Печать списка контактов
        for (var item: col) {
            for (int i = 0; i < item.size(); i++) {
                if (i == 2 || i == 3){
                    String tmp = item.get(i);
                    System.out.print(tmp.toUpperCase().charAt(0) + ". ");
                }else System.out.print(item.get(i) + " ");
            }
            System.out.println();
        }
    }
    private static int GetData(int num){                                        // Создание нового контакта
//        Scanner input = new Scanner(System.in);
        String command;
        System.out.println("Введите '1' для ввода новой записи, \n" +
                "Нажмите любую другую клавишу для выхода: ");
        command = input.nextLine();
        while(command.equals("1")){
            contacts.add(GetRecord(num));
            System.out.println("Введите '1' для ввода новой записи, \n" +
                    "Нажмите любую другую клавишу для выхода: ");
            command = input.nextLine();
            num ++;
        }
        return  num;
    }
    private static ArrayList<String> GetRecord(Integer num){                    // Получение данных от пользователя

        ArrayList<String> newRecord = new ArrayList<>();
        newRecord.add(num.toString());

        System.out.println("Insert your last name: ");
        String lastname = input.nextLine();
        newRecord.add(lastname);
        System.out.println("Insert your first name: ");
        String firstname = input.nextLine();
        newRecord.add(firstname);
        System.out.println("Insert your middle name: ");
        String middlename = input.nextLine();
        newRecord.add(middlename);
        System.out.println("Insert your age: ");
        String age = input.nextLine();
        newRecord.add(age);
        System.out.println("Insert your gender: ");
        String gender = input.nextLine();
        newRecord.add(gender);

        return newRecord;
    }
}
//    ArrayList<Integer> personId = new ArrayList<>();
//    ArrayList<String> lastName = new ArrayList<>();
//    ArrayList<String> firstName = new ArrayList<>();
//    ArrayList<String> fathersName = new ArrayList<>();
//    ArrayList<String> gender = new ArrayList<>();
//    ArrayList<Integer> age = new ArrayList<>();

