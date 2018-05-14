import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int a = 6;
    int b = 10;
    int c = 10;


    int prazno = a - 2;

    for (int i = 0; i < a; i++ ) {
      for (int j = 0; j < b; j++) {
        // if (i == 0 && j == 0 || i == 0 && j == b - 1 || i == a - 1 && j == 0 || i == a - 1 && j == b - 1) {
        //   System.out.print("-");
        // if (j == 0 || j == b - 1) {
        //   System.out.print("|");
        // } else if (i == 0 || i == a - 1) {
        //   System.out.print("-");
        // } else {
        //   System.out.print("*");
        // }
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 0; i < b; i++) {
      for (int j = 0; j < c; j++) {
        if (i <= j) {
          System.out.print("*");
        }
      }
      System.out.println();
    }

    for (int i = 0; i < b; i++) {
      for (int j = 0; j < c; j++) {
        if (j <= i) {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
