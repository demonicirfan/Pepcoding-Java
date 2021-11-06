import java.util.Scanner;

public class Bar_Chart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        Chart(arr);
        scn.close();
    }

    public static void Chart(int[] a) {
        int max = a[0];
        for (int j = 0; j < a.length; j++) {
            if (max < a[j]) {
                max = a[j];
            }
        }
        for (int floor = max; floor >= 1; floor--) {
            for (int buildingNo = 0; buildingNo < a.length; buildingNo++) {
                if (a[buildingNo] >= floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
