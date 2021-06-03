package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChangeNumberToText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int soHangTram = number / 100;
        int soHangChuc = (number % 100) / 10;
        int soHangDonVi = number - soHangTram * 100 - soHangChuc * 10;

        hangTram(soHangTram);
        if (soHangChuc == 1) {
            hangChuc(soHangChuc, soHangDonVi);
        } else {
            hangChuc(soHangChuc, soHangDonVi);
            hangDonVi(soHangDonVi);
        }
    }

    public static void hangTram(int hangTram) {
        switch (hangTram) {
            case 1:
                System.out.println("One hundred ");
                break;
            case 2:
                System.out.println("two hundred ");
                break;
            case 3:
                System.out.println("three hundred ");
                break;
            case 4:
                System.out.println("four hundred ");
                break;
            case 5:
                System.out.println("five hundred ");
                break;
            case 6:
                System.out.println("Six hundred ");
                break;
            case 7:
                System.out.println("Seven hundred ");
                break;
            case 8:
                System.out.println("eight hundred ");
                break;
            case 9:
                System.out.println("nine hundred ");
                break;
        }
    }

    public static void hangChuc(int soHangChuc, int soHangDonVi) {
        int hangChuc = 10 + soHangDonVi;
        if (soHangChuc == 1) {
            switch (hangChuc) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        } else {
            switch (soHangChuc) {
                case 2:
                    System.out.println("twenty");
                    break;
                case 3:
                    System.out.println("thirty");
                    break;
                case 4:
                    System.out.println("fourty");
                    break;
                case 5:
                    System.out.println("fifty");
                    break;
                case 6:
                    System.out.println("sixty");
                    break;
                case 7:
                    System.out.println("seventy");
                    break;
                case 8:
                    System.out.println("eighty");
                    break;
                case 9:
                    System.out.println("ninety");
                    break;
            }

        }
    }

    public static void hangDonVi(int soHangDonVi) {
        switch (soHangDonVi) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
        }
    }
}

