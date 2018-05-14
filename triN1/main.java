import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

  public static void funkcija(int a) {
    while (true) {
      System.out.println(a);
      if (a == 1) break;
      a = (a % 2 == 0) ? a / 2 : a * 3 + 1;
    }
  }

  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int a = in.nextInt();

    funkcija(a);

  }
}
