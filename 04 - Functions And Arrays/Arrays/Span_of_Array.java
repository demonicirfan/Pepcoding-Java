import java.util.Scanner;

public class Span_of_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(SpanOfArray(arr));
        scn.close();
    }

    public static int SpanOfArray(int[] a) {
        int max = a[0];
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return max - min;
    }
}
