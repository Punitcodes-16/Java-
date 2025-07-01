package QuestionPractice;

import java.util.Scanner;

public class Circumference {
    public static double calculateCircumference(double a){

        return 2*3.14*a;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double a = sc.nextDouble();
        System.out.println(calculateCircumference(a));

    }
    
}
