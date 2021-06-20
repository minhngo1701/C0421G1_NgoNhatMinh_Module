package _11_dsa_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String str = "Tôi tên là     Nguyễn Văn A, tôi   học lớp   C0421G1";
        String[] string = str.toUpperCase().replaceAll(",", "").split(" +");
        System.out.println(Arrays.toString(string));
        System.out.println();


        for (int i = 0; i < string.length; i++) {
            if (treeMap.containsKey(string[i])) {
                treeMap.put(string[i], treeMap.get(string[i]) + 1);
            } else {
                treeMap.put(string[i], 1);
            }
        }

        Set<String> keySet = treeMap.keySet();
        for (String key1 : keySet) {
            System.out.println("Từ " + key1 + " - " + treeMap.get(key1) + " lần ");
        }
    }
}
