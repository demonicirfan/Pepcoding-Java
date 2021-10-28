package java;
import java.io.*;
import java.util.*;

public class ElementInArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == d) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println(index);
        }
    }

}