package _19_string_regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String PHONE_NUMBER = "^\\([0-9]{2}\\)\\-\\(0\\d{9}\\)$";

    public PhoneNumber() {
    }

    public static boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
