package exercises.exercise3;

import java.util.Objects;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;
        do {
            System.out.println("Insert a string: you can exit the program writing \":q\"");
            string = sc.nextLine();
            if (!Objects.equals(string, ":q")) {
                System.out.println("Letters in the string: " + String.join(", ", string.split("")));
            }
        } while (!Objects.equals(string, ":q"));
        System.out.println("Do you want to restart the program? (Y/N)");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("y")) {
            main(args);
        } else return;
        sc.close();
    }
}
