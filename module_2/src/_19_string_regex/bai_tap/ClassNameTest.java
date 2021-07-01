package _19_string_regex.bai_tap;

public class ClassNameTest {
    private static ClassName className;
    public static final String[] str1 = new String[] {"C0421G", "C0321G", "C0221H", "C0121I"};
    public static final String[] str2 = new String[] {"C0421E", "C03G", "C0221HL", "C012I"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String string : str1) {
            boolean valid = className.validate(string);
            System.out.println("Class name " + string + " is " + valid);
        }
        for (String string : str2) {
            boolean valid = className.validate(string);
            System.out.println("Class name " + string + " is " + valid);
        }
    }
}
