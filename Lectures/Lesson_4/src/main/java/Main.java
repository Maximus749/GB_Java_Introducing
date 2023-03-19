import java.util.*;

import static java.lang.Character.isDigit;

public class Main {
    public static void main(String[] args) {            // первый добавленый элемент первым удаляется
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            queue.add(i + 1);
        }
        System.out.println(queue);                      // [1, 2, 3, 4, 5]
        queue.remove();                                 // Удалится 1
        int item = queue.remove();
        System.out.println(queue);                      // [3, 4, 5]
        System.out.println(item);                       // 2
        queue.offer(23);                            // Тоже добавляет элемент
        System.out.println(queue);
        queue.poll();                                   // Тоже удаляет элемент
        System.out.println(queue);
        System.out.println(queue.element());            // Выведет первый элемент
        System.out.println(queue.peek());               // Выведет первый элемент
        queue.remove(5);                            // Удаляет указаный элемент
        System.out.println(queue);

        System.out.println("-=".repeat(30));

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2);
        deque.removeLast(); deque.removeLast();
        System.out.println(deque);
        deque.offerFirst(1);
        deque.offerLast(2);
        deque.offerFirst(3);
        deque.offerLast(4);
        System.out.println(deque);
        deque.pollFirst();
        deque.pollLast();
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println("-=".repeat(30));

        Stack<Integer> stack = new Stack<>();
        stack.push(1);                              // Добавляет элемент
        stack.push(12);
        stack.push(123);
        System.out.println(stack);
        System.out.println(stack.pop()); // 123
        System.out.println(stack.pop()); // 12
        System.out.println(stack.pop()); // 1

        System.out.println("-=".repeat(30));
//        var exp = "1 2 3 + *".split(" ");
//        int res = 0;
//        System.out.println(exp);

//        Stack<Integer> st = new Stack<>();
//        for (int i = 0; i < exp.length; i++) {
//            if (isDigit(exp[i])){
//                st.push(Integer.parseInt(exp[i]));
//            }else {
//                switch (exp[i]){
//                    case "+":
//                        res = st.pop() + st.pop();
//                        st.push(res);
//                        break;
//                    case "-":
//                        res = -st.pop() + st.pop();
//                        st.push(res);
//                        break;
//                    case "*":
//                        res = st.pop() * st.pop();
//                        st.push(res);
//                        break;
//                    case "/":
//                        res = st.pop() / st.pop();
//                        st.push(res);
//                        break;
//                    default:
//                        break;
//                }
//            }
//        }
    }
}
