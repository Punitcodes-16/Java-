

public class FirstNaturalNumbers {
    public static void printNaturalnumb(int i , int n, int sum){
    
if(i==n){
    sum+=i;
    System.out.println(sum);
    return;
}
        sum += i;
        printNaturalnumb(i+1, n, sum);
        System.out.println(i);
    }
    public static void main(String[] args) { 
       

      printNaturalnumb(1, 7, 0);
   
        
    }
}
