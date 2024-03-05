package exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to do?");
        System.out.println("1. Check if a string is even or odd");
        System.out.println("2. Check an year is a leap year");
        int option = Integer.parseInt(sc.nextLine());
        switch (option) {
            case 1:{
                System.out.println("Write a string to get if it's length is even or odd");
                String string = sc.nextLine();
                if (stringLengthIsEven(string)) {
                    System.out.println("The string length of \""+ string+"\" is even");
                } else {
                    System.out.println("The string length of \""+ string+"\" is odd");
                }
                break;
            }
            case 2: {
                System.out.println("Write an year to get if it's a leap year");
                int year = Integer.parseInt(sc.nextLine());
                if (isLeapYear(year)){
                    System.out.println(year+ " is a leap year");
                } else {
                    System.out.println(year+ " is not a leap year");
                }
                break;
            }
            default: {
                //start again the program
                System.out.println("The option selected is not valid");
                main(args);
                sc.close();
                break;
            }
        }

        sc.close();
    }

    public static boolean stringLengthIsEven(String string)    {
        return string.length() % 2 ==0;
    }

    public static boolean isLeapYear(int year){
        if (year%4 == 0) {
            if (year>400 && year % 100 ==0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}