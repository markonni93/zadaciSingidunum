import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int c = 0x80000000;
    int bite;

    binarnaReprezentacija(111);

    for (int i = 0; i < 32; i++) {
        bite = a & c;

        if (bite == 0) {
          System.out.print("0");
        } else {
          System.out.print("1");
        }
        binarnaReprezentacija(c);
        c = c >>> 1;
    }
  }

  public static void binarnaReprezentacija(int a) {
    int c = 0x80000000;
    do {
        System.out.print((a & c) == 0 ? "0" : "1");
        c = c >>> 1;
      }
    while (c != 0);
    System.out.println();
  }
}
