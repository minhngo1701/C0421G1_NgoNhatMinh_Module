package model.service.common;

public class Validate {
    public static String validateName(String name) {
        String message = null;
        String regex = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
        if (!name.matches(regex)) {
            message = "Not OK. Name is invalid";
        }
        return message;
    }

    public static String validatePhone(String phone) {
        String message = null;
        String regex = "^[(][84]{2}[)]\\+9[0-1]\\d{7}|09[0-1]\\d{7}$";
        if (!phone.matches(regex)) {
            message = "Not OK. Phone is invalid";
        }
        return message;
    }
    public static String validateEmail(String mail) {
        String message = null;
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (!mail.matches(regex)) {
            message = "Not OK. Email is invalid";
        }
        return message;
    }
    public static String validateCustomerCode(String customerCode) {
        String message = null;
        String regex = "^KH-\\d{4}$";
        if (!customerCode.matches(regex)) {
            message = "Not OK. Customer code is invalid";
        }
        return message;
    }

    public static String validateServiceCode(String serviceCode) {
        String message = null;
        String regex = "^DV-\\d{4}$";
        if (!serviceCode.matches(regex)) {
            message = "Not OK. Service code is invalid";
        }
        return message;
    }

    public static String validateDate(String date) {
        String message = null;
        String regex = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$";
        if (!date.matches(regex)) {
            message = "Not OK. Date is invalid";
        }
        return message;
    }

    public static String validateIdCard(String idCard) {
        String message = null;
        String regex = "^\\d{12}|\\d{9}$";
        if (!idCard.matches(regex)) {
            message = "Not OK. ID card is invalid";
        }
        return message;
    }
}
