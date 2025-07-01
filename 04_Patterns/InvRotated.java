package Patterns;

public class InvRotated {
    public static void main(String[] args) {
        int n = 6;
        //outer loop
        for (int i = 1; i <=n; i++) {
            //for space
            for (int j = 1; j <=n-i ; j++) {
               System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
             System.out.println();
        }
       
    }
}
