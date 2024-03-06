package exercises.exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        String choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Write an integer number from 0 to 3 included:");
            int number = sc.nextInt();
            System.out.println(numberToText(number));
            System.out.println();
            System.out.print("Do you want to restart the program? (Y/N) ");
            System.out.println();

            choice = sc.next();

        } while (choice.equalsIgnoreCase("y"));
        sc.close();
        if (!choice.equalsIgnoreCase("y")) {
            System.out.println("Goodbye!");
        }
    }

    public static String numberToText(int number) {
        return switch (number) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            default -> "The only valid numbers are 0, 1, 2, 3";
        };
    }
}
