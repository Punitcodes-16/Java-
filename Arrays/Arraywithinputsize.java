import java.util.Scanner;

public class Arraywithinputsize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
//input
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= sc.nextInt();
        }
        //output
        for (int i= 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
    }
}
