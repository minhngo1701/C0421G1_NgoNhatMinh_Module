package _13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class AscendingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        System.out.println(max.size());
//        for (int i = 0; i < str.length(); i++) {
//            LinkedList<Character> list = new LinkedList<>();
//            list.add(str.charAt(i));
//            for (int j = 0; j < str.length(); j++) {
//                if (str.charAt(j) > list.getLast()) {
//                    list.add(str.charAt(j));
//                }
//            }
//            if (list.size() > max.size()) {
//                max.clear();
//                max.addAll(list);
//            }
//            list.clear();
//            System.out.println(list.size());
//        }
//
//
//        for (Character character:max) {
//            System.out.print(character);
//        }

    }
}
