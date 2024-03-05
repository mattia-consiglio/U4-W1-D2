package exercise3;

import java.util.Objects;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "";
        do {
            System.out.println("Insert a string: you can exit the program writing \":q\"");
            string = sc.nextLine();
            if (!Objects.equals(string, ":q")) {
                String[] letters = string.split("");
                String stringWthCommas = String.join(", ", letters);
                System.out.println("letters in the string: " + stringWthCommas);
            }
        } while (!Objects.equals(string, ":q"));
    }
}
