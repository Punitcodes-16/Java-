package conditional_statements;

public class ElseIfExample {
    public static void main(String[] args) {
        int number = 15;

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
