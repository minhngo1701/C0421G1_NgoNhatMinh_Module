package _case_study.libs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex extends Exception {
    static final String REGEX_VILLA = "^SVVL-[0-9]{4}$";//tên villa
    static final String REGEX_HOUSE = "^SVHO-[0-9]{4}$";
    static final String REGEX_ROOM = "^SVRO-[0-9]{4}$"; // ràng buộc về SV room-YYYY
    static final String REGEX_SERVICE = "^[A-Z][a-z]{1,}"; // viết hoa kí tự đầu
    static final String REGEX_AREA_POOL = "^([3-9]\\d[.]?\\d*|[0-9]\\d{2,}[.]?\\d*)$"; // 1 số lớn hơn bao nhiêu ( cụ thể là 30)
    static final String REGEX_RENTAL_FEE = "^[+]?([.]\\d+|\\d+[.]?\\d*)$"; // số dương thập phân
    static final String REGEX_NUMBER_OF_PEOPLE = "^([1]\\d|[1-9])$"; // LỚN HƠN 1 SỐ VÀ BÉ HƠN 20
    static final String REGEX_NUMBER_OF_FLOOR = "^[0-9]+$"; // số nguyên dương
    static final String REGEX_RENT_OF_TYPE = "^[ngàyNgàythángThángnămNăm]+$";
    static final String REGEX_DD_MM_YY = "^(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d\\d$";
    static final String REGEX_NAME = "^[a-zA-Z ]{2,}$";
    static final String REGEX_PHONE_NUMBER = "^[0-9]{10,11}$";
    static final String REGEX_IDENTITY_NUMBER = "^[0-9]{9}$";
    static final String REGEX_EMAIL = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";

    public boolean regexVilla(String regex) {
        Pattern pattern = Pattern.compile(REGEX_VILLA);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public double regexVillaTest() {
        double input = 0.0f;
        while (!regexVilla(String.valueOf(input))) {
            System.out.println("Enter wrong");
            input = choiceDouble();
        }
        return input;
    }
    public boolean regexService(String regex) {
        Pattern pattern = Pattern.compile(REGEX_SERVICE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public String regexServiceTest() {
        String input = sc.nextLine();
        while (!regexService(String.valueOf(input))) {
            System.out.println("Enter wrong");
            input = sc.nextLine();
        }
        return input;
    }
    public boolean regexPoolArea(String regex) {
        Pattern pattern = Pattern.compile(REGEX_AREA_POOL);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public double regexPoolAreaTest() {
        double input = 0.0f;
        while (!regexPoolArea(String.valueOf(input))) {
            System.out.println("Enter wrong");
            input = choiceDouble();
        }
        return input;
    }
    public boolean regexRentCost(String regex) {
        Pattern pattern = Pattern.compile(REGEX_RENTAL_FEE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public double regexRentCostTest() {
        double input = 0.0f;
        while (!regexRentCost(String.valueOf(input))) {
            System.out.println("Enter wrong");
            input = choiceDouble();
        }
        return input;
    }
    public boolean regexNumberPeople(String regex) {
        Pattern pattern = Pattern.compile(REGEX_NUMBER_OF_PEOPLE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public int regexNumberPeopleTest() {
        int input = choiceNumber();
        while (!regexNumberPeople(String.valueOf(input))) {
            System.out.println("Enter wrong");
            input = choiceNumber();
        }
        return input;
    }
    public boolean regexNumberFloor(String regex) {
        Pattern pattern = Pattern.compile(REGEX_NUMBER_OF_FLOOR);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public int regexNumberFloorTest() {
        int input = choiceNumber();
        while (!regexNumberFloor(String.valueOf(input))) {
            System.out.println("Enter wrong");
            input = choiceNumber();
        }
        return input;
    }
    public boolean regexRentType(String regex) {
        Pattern pattern = Pattern.compile(REGEX_RENT_OF_TYPE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public String regexRentTypeTest() {
        String input = sc.nextLine();
        while (!regexRentType(String.valueOf(input))) {
            System.out.println("Enter wrong");
            input = sc.nextLine();
        }
        return input;
    }
    public boolean regexDateMonth(String regex) {
        Pattern pattern = Pattern.compile(REGEX_DD_MM_YY);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public String regexDateMonthTest() {
        String input = sc.nextLine();
        while (!regexDateMonth(String.valueOf(input))) {
            System.out.println("Enter wrong");
            input = sc.nextLine();
        }
        return input;
    }
    public boolean regexHouse(String regex) {
        Pattern pattern = Pattern.compile(REGEX_HOUSE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public String regexHouseTest() {
        String input = sc.nextLine();
        while (!regexHouse(String.valueOf(input))) {
            System.out.println("Enter wrong");
            input = sc.nextLine();
        }
        return input;
    }
    public boolean regexRoom(String regex) {
        Pattern pattern = Pattern.compile(REGEX_ROOM);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public String regexRoomTest() {
        String input = sc.nextLine();
        while (!regexRoom(String.valueOf(input))) {
            System.out.println("Enter wrong");
            input = sc.nextLine();
        }
        return input;
    }
    public boolean regexEmail(String regex) {
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public String regexEmailTest() {
        String input = sc.nextLine();
        while (!regexEmail(String.valueOf(input))) {
            System.out.println("Enter wrong");
            input = sc.nextLine();
        }
        return input;
    }
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
    public boolean regexPhoneNumber(String regex) {
        Pattern pattern = Pattern.compile(REGEX_PHONE_NUMBER);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public String regexPhoneNumberTest() {
        String input = sc.nextLine();
        while (!regexPhoneNumber(String.valueOf(input))) {
            System.out.println("Enter wrong");
            input = sc.nextLine();
        }
        return input;
    }
    public boolean regexIdentityNumber(String regex) {
        Pattern pattern = Pattern.compile(REGEX_IDENTITY_NUMBER);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public String regexIdentityNumberTest() {
        String input = sc.nextLine();
        while (!regexIdentityNumber(String.valueOf(input))) {
            System.out.println("Enter wrong");
            input = sc.nextLine();
        }
        return input;
    }
}
