import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NewSet newSet = new NewSet();
        newSet.addNum(2);
        newSet.addNum(3);
        newSet.addNum(4);
        newSet.addNum(5);
        newSet.addNum(6);
        newSet.addNum(7);
        newSet.addNum(2);
        newSet.print();

        System.out.println("-=".repeat(30));
        System.out.println("size = " + newSet.countElem());
        System.out.println("-=".repeat(30));
        System.out.println("choiceElem " + newSet.choiceElem(3));
        System.out.println("-=".repeat(30));
        System.out.println("toList" + newSet.toList());
        System.out.println("-=".repeat(30));
        newSet.printFirsts(3);
        System.out.println("-=".repeat(30));
        System.out.println("printFirst" + newSet.printFirst(5));
        System.out.println("-=".repeat(30));
        newSet.printLasts(3);
        System.out.println("-=".repeat(30));
        System.out.println("printLast" + newSet.printLast(5));
    }
}

class NewSet{
    private  HashMap<Integer, Object> mySet;
    private static final Object OOO = new Object();

    public NewSet(){
        mySet = new HashMap<>();
    }

    public void addNum(Integer number){
        mySet.putIfAbsent(number, OOO);
    }
    public void print(){
        System.out.print("print ");
        mySet.forEach((k, v) -> System.out.print(k + ", "));
        System.out.println();
    }
    public int countElem(){
        int cnt;
        cnt = mySet.size();
        return cnt;
    }
    public int choiceElem(int index){
        return (int) mySet.keySet().toArray()[index];

    }
    public ArrayList<Integer> toList(){
        ArrayList<Integer> list = new ArrayList<>(mySet.keySet());
//        mySet.forEach((k, v) -> list.add(k));
        return list;
    }
    public void printFirsts(int index){
        System.out.println("printFirsts" + toList().subList(0, index));
    }
    public ArrayList<Integer> printFirst(int index){
        ArrayList listFirst = new ArrayList<>();
        if (toList().contains(index)){
            for (int i = 0; i < toList().size(); i++) {
                listFirst.add(toList().get(i));
                if (toList().get(i) == index) break;
            }
        }
        else System.out.println("Такого числа нет");
        return listFirst;
    }
    public void printLasts(int index){
        System.out.println("printLasts" + toList().subList(index, toList().size()));
    }
    public ArrayList<Integer> printLast(int index) {
        ArrayList listFirst = new ArrayList<>();
        int j = 0;
        if (toList().contains(index)) {
            for (int i = 0; i < toList().size(); i++) {
                if (j != 0) listFirst.add(toList().get(i));
                if (toList().get(i) != index) continue;
                else {
                    j++;
                    listFirst.add(toList().get(i));
                }
            }
        } else System.out.println("Такого числа нет");
        return listFirst;
    }
}


//import java.util.ArrayList;
//        import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        NewSet newSet = new NewSet(arrayList);
//        newSet.getChoice(arrayList);
//        System.out.println(arrayList);
//    }
//}
//
//class NewSet{
//    static ArrayList<Integer> arrayList = new ArrayList<>();
//    Scanner input = new Scanner(System.in);
//
//    public NewSet(ArrayList arrayList){
//        this.arrayList = arrayList;
//    }
//    public void getChoice(ArrayList aList){
//        System.out.println("Введите 1 если хотите добавить число в список\n" +
//                "для выхода нажмите любую клавишу:");
//        String choice;
//        choice = input.nextLine();
//        while (choice.equals("1")){
//            makeList(aList);
//            System.out.println("Введите 1 для продолжения ввода,\n" +
//                    "для выхода нажмите любую клавишу:");
//            choice = input.nextLine();
//        }
//    }
//    public ArrayList<Integer> makeList( ArrayList aList){
//
//        Integer insert;
//        System.out.println("Введите число");
//        insert = Integer.parseInt(input.nextLine());
//        if (aList.contains(insert)) {
//            return aList;
//        }
//        else {
//            aList.add(insert);
//        }
//
//        return aList;
//    }
//}
