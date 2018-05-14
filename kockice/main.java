import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int prvaKocka;
    int drugaKocka;
    int counter = 0;

    while(true) {

      prvaKocka = (int) (Math.random() * 6) + 1;
      drugaKocka = (int) (Math.random() * 6) + 1;

      System.out.println(prvaKocka + " " + drugaKocka);

      counter++;

      if (prvaKocka == 1 && drugaKocka == 1) {
        System.out.println(counter);
        break;
      }
    }
  }
}
