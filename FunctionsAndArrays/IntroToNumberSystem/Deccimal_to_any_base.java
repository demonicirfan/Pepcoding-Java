package FunctionsAndArrays.IntroToNumberSystem;

import java.util.*;

import java.lang.Math;

public class Deccimal_to_any_base {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueIndecimal(n, b);
        System.out.println(dn);

    }

    public static int getValueInBase(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % b;
            n = n / b;

            rv += dig * p;
            p = p * 10;

        }
        return rv;
    }

    public static int getValueIndecimal(int n, int b) {
        // write your code here
        double sum = 0;
        for (int i = 0; n > 0; i++) {
            int dig = n % 10;
            n = n / 10;
            sum += dig * Math.pow(b, i);
        }

        return (int) sum;
    }
}
