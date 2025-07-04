public class Exponent {
    public static int calcExponent(int x , int n){

        if ( n==0){ // base case 1
            return  1;
        }
        if(x==0 ){ // base case 2
            return 0;
        }
    


 int xExponm1 = calcExponent(x, n-1);
        int xExpon = x* xExponm1;
        return xExpon;
    }
    public static void main(String[] args) {
        int x =2 ;
        int n = 5;
        System.out.println(calcExponent(x, n));
        
    }                                        
}
