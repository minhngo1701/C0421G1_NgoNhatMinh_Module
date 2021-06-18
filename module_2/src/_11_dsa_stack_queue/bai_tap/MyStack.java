package _11_dsa_stack_queue.bai_tap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MyStack {
    private static void stackOfInterger() {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        for (int i = 0; i < arrayList.size(); i++) {
            stack.push(arrayList.get(i));
            arrayList.remove(arrayList.get(i));
            i--;
        }
        System.out.println("Trước khi đảo ngược: ");
        System.out.println(stack);


        while (!stack.isEmpty()) {
            arrayList.add(stack.pop());
        }
        System.out.println("Sau khi đảo ngược: ");
        System.out.println(arrayList);
    }

    public static void stackOfString() {
        Stack<String> wStack = new Stack<>();
        String str = "Tôi tên Nguyễn Văn A";
        String[] array = str.split(" ");
        for (String string : array) {
            wStack.push(string);
        }
        System.out.println("Trước khi đảo: ");
        System.out.println(wStack);

        int index = 0;
        while (!wStack.isEmpty()){
            array[index] = wStack.pop();
            index++;
        }
        System.out.println("Sau khi đảo: ");
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        System.out.println("Stack of integer: ");
        stackOfInterger();
        System.out.println();

        System.out.println("Stack of String: ");
        stackOfString();

    }
}
