package _11_dsa_stack_queue.bai_tap.optional;

import java.util.Scanner;
import java.util.Stack;

public class CovertStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        while ((number / 2) != 0) {
            stack.add(number % 2);
            int temp = number / 2;
            int temp1 = temp;
            number = temp1;
        }
        if ((number / 2) == 0) {
            stack.add(number % 2);
        }

        Stack<Integer> stack1 = new Stack<>();
        while (!stack.isEmpty()){
            stack1.add(stack.pop());
        }

        System.out.println(stack1.toString());
    }
}
