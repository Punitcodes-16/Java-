package conditonal_statements;

import java.util.Scanner;

public class ElseIfExample {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x > 0) {
            System.out.println("The number is positive.");
        } else if (x < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
