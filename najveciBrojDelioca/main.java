import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b;
    int max = 0;
    int broj = 0;

    for (int i = 1; i <= a; i++) {
      b = brojDelioca(i);
      if (b > max) {
        max = b;
        broj = i;
      }
    }

    System.out.println("Broj sa najvise delilaca je " + broj + " a broj delilaca je " + max);
  }

  public static int brojDelioca(int a) {

    int counter = 0;
    for (int i = 1; i <= a; i++) {
      counter = a % i == 0 ? counter + 1 : counter;
    }

    return counter;
  }
}
