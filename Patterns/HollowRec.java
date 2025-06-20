package Patterns;

public class HollowRec {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        // Outer loop (rows)
        for (int i = 1; i <= n; i++) {
            // Inner loop (columns)
            for (int j = 1; j <= m; j++) {
                // Print '*' at border cells
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");  // print space inside
                }
            }
            // Move to next line after every row
            System.out.println();
        }
    }
}



