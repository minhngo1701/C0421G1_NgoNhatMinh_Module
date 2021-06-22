package _10_dsa_danh_sach.bai_tap;



public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("Minh");
        myList.add("Phú");
        myList.add("Hoàng");
        myList.add(2,"Luân");
        myList.add(3,"Tuấn");
        System.out.println(myList);
//        myList.remove(2);
//        System.out.println(myList);
//        System.out.println(myList.size());
//        System.out.println(myList.indexOf("Hoàng"));
//        myList.clear();
//        System.out.println(myList);
//        System.out.println(myList.get(1));
//        System.out.println(myList.contain("Minh"));
//        System.out.println(myList.clone());
    }
}
