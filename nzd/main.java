import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();

    int d;

    if (a < b) {
      d = a;
    } else {
      d = b;
    }

    while (( a % d != 0) || (b % d != 0)) {
      d = d - 1;
      System.out.println(d);
    }

    System.out.println("NZD za unete brojeve je " + d);
  }
}
