import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
