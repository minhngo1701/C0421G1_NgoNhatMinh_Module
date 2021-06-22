package _11_dsa_stack_queue.bai_tap.optional;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            stack.add(str.charAt(i));
        }
        System.out.println(stack);

        boolean check = true;
        for (int i = 0; i < stack.size(); i++) {
            if (stack.peek().equals(str.charAt(i))) {
                check = true;
            } else {
                System.out.println("Không phải là chuỗi palindrome");
                break;
            }

        }
        if (check) {
            System.out.println("là chuỗi palindrome");
        }
    }
}
