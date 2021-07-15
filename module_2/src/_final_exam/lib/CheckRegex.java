package _final_exam.lib;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckRegex extends Check {
    static final String REGEX_NAME = "^[a-zA-Z0-9- ]{2,}$";

    public boolean regexName(String regex) {
        Pattern pattern = Pattern.compile(REGEX_NAME);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public String regexNameTest() {
        String input = sc.nextLine();
        while (!regexName(String.valueOf(input))) {
            System.out.println("Enter wrong");
            input = sc.nextLine();
        }
        return input;
    }
}
