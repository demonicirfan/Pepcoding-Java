import java.util.Scanner;

public class Sum_Of_Two_Arrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }

        int[] a = arr_sum(arr1, arr2);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        scn.close();

    }

    public static int[] arr_sum(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        int carry = 0;
        if (n1 < n2) {
            int[] sum = new int[n2];
            for (int i = n2 - 1, j = n1 - 1; i >= 0; i--, j--) {
                if (j < 0) {
                    sum[i] = b[i] + carry;
                } else {
                    sum[i] = (a[j] + b[i]) % 10 + carry;
                    carry = (a[j] + b[i]) / 10;
                }
            }
            return sum;
        } else {
            int[] sum = new int[n1];
            for (int i = n1 - 1, j = n2 - 1; i >= 0; i--, j--) {
                if (j < 0) {
                    sum[i] = a[i] + carry;
                } else {
                    sum[i] = (a[i] + b[j]) % 10 + carry;
                    carry = (a[j] + b[i]) / 10;
                }
            }
            return sum;
        }
    }
}
