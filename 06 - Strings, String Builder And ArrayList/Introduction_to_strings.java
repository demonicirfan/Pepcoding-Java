import java.util.Scanner;

public class Introduction_to_strings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        System.out.println(s1);

        char c = s1.charAt(2);
        System.out.println(c);

        scn.close();
    }
}
