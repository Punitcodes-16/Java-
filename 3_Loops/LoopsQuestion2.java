package loops;

import java.util.Scanner;

//print the table if a number input by user
public class LoopsQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
for (int i = 1; i < 11; i++) {
    System.out.println(i*n);
    
}
    }
}
