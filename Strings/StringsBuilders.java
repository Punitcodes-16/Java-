package Strings;

public class StringsBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("eaoph cruge");
        System.out.println(sb);

        sb.setCharAt(3, 't');
        System.out.println(sb);
        sb.insert(0, 'd');
        System.out.println(sb);
        sb.delete(3, 4);
        System.out.println(sb);
        sb.append('r');
        System.out.println(sb);
    }
}

