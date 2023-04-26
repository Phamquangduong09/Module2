package day17_4.ChuoiPalindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        String[] strings = string.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (String s : strings) {
            stack.push(s);
        }
        for (String s : strings) {
            queue.offer(s);
        }
        int n = strings.length;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            String a = stack.pop().toLowerCase();
            String b = queue.poll().toLowerCase();
            if (!a.equals(b)) {
                flag = false;
                break;
            } else {
                System.out.println(a + " " + b + " là chuỗi Palindrome");
            }
        }
        if(!flag) {
            System.out.println("Không phải chuỗi");
        }

    }
}
