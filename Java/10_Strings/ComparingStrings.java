package Strings;

public class ComparingStrings {
    public static void main(String[] args) {
        // compare
        String name1 = "Death";
        String name2 = "death" ;

        //1) s1>s2 : +ve value
        //2) s1==s2 : 0
        //3) s1<s2 : -ve value

        if (name1.compareTo(name2)==0) {
            System.out.println("Strings are equal");
            
        } else {
            
            System.out.println("Strings are not equal");
        }

    }
}
