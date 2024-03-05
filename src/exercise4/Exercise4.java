package exercise4;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number to display a countdown (should be greater than 0):");
        int number = sc.nextInt();
        if (number <=0 ){
            throw new Error("The number should be grater than 0");
        }
        System.out.println("Countdown started");
        for (int i = number; i >= 0; i--) {
            if (i!= number) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println(i);
        }
        System.out.println("Countdown ended");
    }
}
