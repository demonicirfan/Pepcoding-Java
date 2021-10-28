package java;
import java.util.*;

public class Pattern1 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();

    for (int n = 0; n < num; n++) {
      for (int j = 1; j <= n; j++) {
        System.out.print("\t");
      }
      for (int i = 1; i <= num-n; i++) {
        System.out.print("*\t");
      }
      System.out.println();
    }
  }
}