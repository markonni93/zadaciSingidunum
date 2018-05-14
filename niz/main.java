import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int broj = in.nextInt();

    while (true) {
      System.out.println(broj);
      if (broj == 1) break;
      broj = (broj % 2 == 0) ? broj / 2 : broj * 3 + 1;
    }
  }
}
