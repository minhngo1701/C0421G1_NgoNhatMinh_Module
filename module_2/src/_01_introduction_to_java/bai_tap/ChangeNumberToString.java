package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChangeNumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter number you wanna spell: ");
        number = scanner.nextInt();
        if (number < 10 && number >= 0) {
            switch (number) {
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
                default:
                    System.out.println("ten");
            }
        } else if (number < 20) {
            switch (number % 10) {
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
                default:
                    System.out.println("ten");
            }
        } else if (number < 100) {
            String spellOnes = "";
            String spellTens = "";
            switch (number / 10) {
                case 2:
                    spellTens = "twenty ";
                    break;
                case 3:
                    spellTens = "thirty ";
                    break;
                case 4:
                    spellTens = "forty ";
                    break;
                case 5:
                    spellTens = "fifty ";
                    break;
                case 6:
                    spellTens = "sixty ";
                    break;
                case 7:
                    spellTens = "seventy ";
                    break;
                case 8:
                    spellTens = "eighty ";
                    break;
                case 9:
                    spellTens = "ninety ";
                    break;
            }
            switch (number % 10) {
                case 1:
                    spellOnes = "one";
                    break;
                case 2:
                    spellOnes = "two";
                    break;
                case 3:
                    spellOnes = "three";
                    break;
                case 4:
                    spellOnes = "four";
                    break;
                case 5:
                    spellOnes = "five";
                    break;
                case 6:
                    spellOnes = "six";
                    break;
                case 7:
                    spellOnes = "seven";
                    break;
                case 8:
                    spellOnes = "eight";
                    break;
                case 9:
                    spellOnes = "nine";
                    break;
            }
            System.out.println(spellTens + spellOnes);
        } else if (number < 1000 && (number % 100) / 10 > 1) {
            String spellhundreds = "";
            String spellTens = "";
            String spellOness = "";
            switch (number / 100) {
                case 1:
                    spellhundreds = "one hundred ";
                    break;
                case 2:
                    spellhundreds = "two hundred ";
                    break;
                case 3:
                    spellhundreds = "three hundred ";
                    break;
                case 4:
                    spellhundreds = "four hundred ";
                    break;
                case 5:
                    spellhundreds = "five hundred ";
                    break;
                case 6:
                    spellhundreds = "six hundred ";
                    break;
                case 7:
                    spellhundreds = "one hundred ";
                    break;
                case 8:
                    spellhundreds = "one hundred ";
                    break;
                case 9:
                    spellhundreds = "one hundred ";
                    break;
            }
            switch ((number % 100) / 10) {
                case 2:
                    spellTens = "twenty";
                    break;
                case 3:
                    spellTens = "thirty";
                    break;
                case 4:
                    spellTens = "forty";
                    break;
                case 5:
                    spellTens = "fifty";
                    break;
                case 6:
                    spellTens = "sixty";
                    break;
                case 7:
                    spellTens = "seventy";
                    break;
                case 8:
                    spellTens = "eighty";
                    break;
                case 9:
                    spellTens = "ninety";
                    break;
            }
            switch (number % 10) {
                case 1:
                    spellOness = "one";
                    break;
                case 2:
                    spellOness = "two";
                    break;
                case 3:
                    spellOness = "three";
                    break;
                case 4:
                    spellOness = "four";
                    break;
                case 5:
                    spellOness = "five";
                    break;
                case 6:
                    spellOness = "six";
                    break;
                case 7:
                    spellOness = "seven";
                    break;
                case 8:
                    spellOness = "eight";
                    break;
                case 9:
                    spellOness = "nine";
                    break;
            }
            System.out.println(spellhundreds + "and " + spellTens + spellOness);
        }
        if (((number % 100) / 10) == 1) {
            String spellhundreds = "";
            String spellOnes = "";
            switch (number / 100) {
                case 1:
                    spellhundreds = "one hundred ";
                    break;
                case 2:
                    spellhundreds = "two hundred ";
                    break;
                case 3:
                    spellhundreds = "three hundred ";
                    break;
                case 4:
                    spellhundreds = "four hundred ";
                    break;
                case 5:
                    spellhundreds = "five hundred ";
                    break;
                case 6:
                    spellhundreds = "six hundred ";
                    break;
                case 7:
                    spellhundreds = "one hundred ";
                    break;
                case 8:
                    spellhundreds = "one hundred ";
                    break;
                case 9:
                    spellhundreds = "one hundred ";
                    break;
            }
            switch ((number % 100) % 10) {
                case 1:
                    spellOnes = "eleven";
                    break;
                case 2:
                    spellOnes = "twelve";
                    break;
                case 3:
                    spellOnes = "thirteen";
                    break;
                case 4:
                    spellOnes = "fourteen";
                    break;
                case 5:
                    spellOnes = "fifteen";
                    break;
                case 6:
                    spellOnes = "sixteen";
                    break;
                case 7:
                    spellOnes = "seventeen";
                    break;
                case 8:
                    spellOnes = "eighteen";
                    break;
                case 9:
                    spellOnes = "nineteen";
                    break;
                default:
                    spellOnes = "ten";
            }
            System.out.println(spellhundreds + " and " + spellOnes);
        }
    }
}