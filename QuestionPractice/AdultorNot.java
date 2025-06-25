package QuestionPractice;

import java.util.Scanner;

public class AdultorNot {
  public static boolean isEligibile(int age){
    if (age>=18) {
        return true;
        
    } else {
        return false;
        
    }
    
  }
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(isEligibile(age));
    }
}
