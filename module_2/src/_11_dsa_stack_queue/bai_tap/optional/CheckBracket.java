package _11_dsa_stack_queue.bai_tap.optional;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static boolean check(String str) {
        char left;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            left = str.charAt(i);
            if (left == '(') {
                stack.push(left);
            }else if (left == ')' ) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(check(str));
    }
}
