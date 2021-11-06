import java.util.Scanner;

public class Find_Element_In_An_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int b = scn.nextInt();

        System.out.println(Element_Position(arr, b));

        scn.close();
    }

    public static int Element_Position(int[] a, int b) {
        int x = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                return i;
            }
        }
        return x;

    }
}