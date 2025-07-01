package Strings;

public class StringConcatenation {
    public static void main(String[] args) {
        //concatenation
        String firstName = "DEATH ";
        String lastName = "CRUGER";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        //length of a string
        System.out.println(fullName.length());
        //charAt
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}
