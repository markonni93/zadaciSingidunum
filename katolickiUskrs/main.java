import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int godina = in.nextInt();

    int a = godina % 19;
    int b = godina % 4;
    int c = godina % 7;
    int d = (19 * a + 24) % 30;
    int e = (2 * b + 4 * c + 6 * d + 5) % 7;

    int de = 22 + d + e;

    if (de > 31) {
      System.out.println("Katolicki uskrs je " + (de - 31) + " .aprila");
    } else {
      System.out.println("Katolicki uskrs je " + de + " .marta");
    }
  }
}
