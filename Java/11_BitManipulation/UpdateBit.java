import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int oper = sc.nextInt();
        //oper=1  : set  oper = 0 : clear
        int n = 5;
        int pos = 1;

        int bitMask = 1<<pos;
        if(oper ==1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else{
            int newbitMask = ~(bitMask);
            int newNumber= newbitMask & n;
            System.out.println(newNumber);
        }

    }
}
