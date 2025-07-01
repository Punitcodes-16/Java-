import java.util.Scanner;

public class Takinginputandoutput {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int colms = sc.nextInt();

    int[][] numbers = new int[rows][colms];


//input
// outer loop for rows
for (int i = 0; i < rows; i++) {
    //inner loop for colms
    for (int j = 0; j < colms; j++) {
        numbers[i][j]= sc.nextInt();

    }
    
}
//output
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < colms; j++) {
        System.out.print(numbers[i][j] + " ");
        
    }
    System.out.println();
    
}

    }
}
