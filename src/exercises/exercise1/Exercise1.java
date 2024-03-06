package exercises.exercise1;

import java.util.Objects;
import java.util.Scanner;

import static exercises.Utils.ANSI_RED;
import static exercises.Utils.ANSI_RESET;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (Objects.equals(choice, "y")) {
            int option;
            String scOption;


            do {
                System.out.println("What do you want to do?");
                System.out.println("1. Check if a string is even or odd");
                System.out.println("2. Check an year is a leap year");
                scOption = sc.nextLine();
                try {
                    option = Integer.parseInt(scOption);

                    switch (option) {
                        case 1: {
                            System.out.println("Write a string to get if it's length is even or odd");
                            String string = sc.nextLine();
                            if (stringLengthIsEven(string)) {
                                System.out.println("The string length of \"" + string + "\" is even");
                            } else {
                                System.out.println("The string length of \"" + string + "\" is odd");
                            }
                            break;
                        }
                        case 2: {
                            int year;
                            String scYear;
                            do {
                                System.out.println("Write an year to get if it's a leap year");
                                scYear = sc.nextLine();
                                try {
                                    year = Integer.parseInt(scYear);
                                    if (isLeapYear(year)) {
                                        System.out.println(year + " is a leap year");
                                    } else {
                                        System.out.println(year + " is not a leap year");
                                    }
                                } catch (NumberFormatException nfe) {
                                    System.out.println(ANSI_RED + "The year must be a number" + ANSI_RESET);
                                    scYear = "";
                                }
                            } while (scYear.isEmpty());

                            break;
                        }
                        default: {
                            System.out.println(ANSI_RED + "The option selected is not valid" + ANSI_RESET);
                            break;
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("You should write a number");
                    scOption = "";
                }
            } while (scOption.isEmpty());


            System.out.print("Do you want to restart the program? (Y/N) ");
            choice = sc.next();
        }

        sc.close();
    }

    public static boolean stringLengthIsEven(String string) {
        return string.length() % 2 == 0;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year > 400 && year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}