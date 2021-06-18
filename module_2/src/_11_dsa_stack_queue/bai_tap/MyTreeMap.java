package _11_dsa_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String str = "Tôi tên là Nguyễn Văn A, học lớp C0421G1";
        String str1 = str.toUpperCase().replaceAll(",", "");
        String[] string = str1.split(" ");
        System.out.println(Arrays.toString(string));
    }
}
