package exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write an integer number from 0 to 3 included:");
        int number = sc.nextInt();
        switch (number){
            case 0 :{
                System.out.println("Zero");
                break;
            }case 1 :{
                System.out.println("One");
                break;
            }case 2 :{
                System.out.println("Two");
                break;
            }case 3 :{
                System.out.println("Three");
                break;
            }
            default:{
                System.out.println("The only valid number are 0, 1, 2, 3");
            }

        }
    }
}
