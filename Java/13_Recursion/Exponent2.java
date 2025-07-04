public class Exponent2 {
    public static int calcExponent(int x , int n){

        if ( n==0){ // base case 1
            return  1;
        }
        if(x==0 ){ // base case 2
            return 0;
        }
    // if n is even
    if( n%2 == 0) {
        return calcExponent(x, n/2) *calcExponent(x , n/2);

    }
    else {
        return calcExponent(x, n/2) * calcExponent(x, n/2)* x ;
    }


 
    }
    public static void main(String[] args) {
        int x =2 ;
        int n = 5;
        System.out.println(calcExponent(x, n));
        
    }                                
}
