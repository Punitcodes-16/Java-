public class ClearBit {
    public static void main(String[] args) {
        int n =5;
        int pos = 0 ;
        int bitMask = 1<<pos;
        int notbitMask = ~(bitMask);

        int newNumber = notbitMask & n;
        System.out.println(newNumber);
    }
}
