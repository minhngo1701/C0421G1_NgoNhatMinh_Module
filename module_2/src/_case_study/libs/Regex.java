package _case_study.libs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    static final String REGEX_VILLA = "^SVVL-[0-9]{4}$";//tên villa
//    static final String REGEX_HOUSE = "^SVHO-[0-9]{4}$";
//    static final String REGEX_ROOM = "^SVRO-[0-9]{4}$"; // ràng buộc về SV room-YYYY
    static final String REGEX_SERVICE = "^[A-Z][a-z]{1,}"; // viết hoa kí tự đầu
    static final String REGEX_AREA_POOL = "^([3-9]\\d[.]?\\d*|[0-9]\\d{2,}[.]?\\d*)$"; // 1 số lớn hơn bao nhiêu ( cụ thể là 30)
    static final String REGEX_RENTAL_FEE = "^[+]?([.]\\d+|\\d+[.]?\\d*)$"; // số dương thập phân
    static final String REGEX_NUMBER_OF_PEOPLE = "^([1]\\d|[1-9])$"; // LỚN HƠN 1 SỐ VÀ BÉ HƠN 20
    static final String REGEX_NUMBER_OF_FLOOR = "^[+]?([.]\\d+|\\d+[.]?\\d*)$"; // số dương thập phân
    static final String REGEX_RENT_OF_TYPE = "^(NORMAL|LOW|VIP)-[0-9]{4}$";
    static final String REGEX_DD_MM_YY = "^(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d\\d$";
    public boolean regexFacilities(String regex) {
        Pattern pattern = Pattern.compile(REGEX_VILLA);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean regexService(String regex) {
        Pattern pattern = Pattern.compile(REGEX_SERVICE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean regexPoolArea(String regex) {
        Pattern pattern = Pattern.compile(REGEX_AREA_POOL);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean regexRentCost(String regex) {
        Pattern pattern = Pattern.compile(REGEX_RENTAL_FEE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean regexNumberPeople(String regex) {
        Pattern pattern = Pattern.compile(REGEX_NUMBER_OF_PEOPLE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean regexNumberFloor(String regex) {
        Pattern pattern = Pattern.compile(REGEX_NUMBER_OF_FLOOR);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean regexRentType(String regex) {
        Pattern pattern = Pattern.compile(REGEX_RENT_OF_TYPE);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean regexDateMonth(String regex) {
        Pattern pattern = Pattern.compile(REGEX_DD_MM_YY);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
