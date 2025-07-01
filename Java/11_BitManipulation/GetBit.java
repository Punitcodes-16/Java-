

public class GetBit {
    public static void main(String[] args) {
        int n = 9;
        int pos =2 ;
        int bitMask = 1 <<pos;

        if((bitMask & n)==0){
            System.out.println("Bit was zero");

        }
        else{
            System.out.println("bit was one");
        }
    }
    
}
