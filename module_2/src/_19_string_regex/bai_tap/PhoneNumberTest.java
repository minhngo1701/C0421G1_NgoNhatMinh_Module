package _19_string_regex.bai_tap;

public class PhoneNumberTest {
    private static PhoneNumber phoneNumber;
    public static final String[] phone1 = new String[] {"(84)-(0978489648)", "(84)-(0978456435)", "(84)-(0969699696)"};
    public static final String[] phone2 = new String[] {"(84)-(09784896)", "(84)-(097845643534)", "(84)-(09696996ab)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumber();
        for (String phone : phone1) {
            boolean phoneTest = phoneNumber.validate(phone);
            System.out.println("Phone number " + phone + " is " + phoneTest);
        }
        for (String phone : phone2) {
            boolean phoneTest = phoneNumber.validate(phone);
            System.out.println("Phone number " + phone + " is " + phoneTest);
        }
    }
}
