import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

  public static int baciZaZbir(int broj) {

    int counter = 0;
    int zbir;
    int prvaKocka;
    int drugaKocka;

    while (true) {

      prvaKocka = (int) (Math.random() * 6) + 1;
      drugaKocka = (int) (Math.random() * 6) + 1;

      zbir = prvaKocka + drugaKocka;
      counter++;

      if (zbir == broj) {
        break;
      }
    }

    return counter;

  }

  public static double prosekZaZbir(int broj) {

    int whileCounter = 100000;
    int brojBacanja = 0;
    double zbir = 0.0;
    double prosek;

    while (whileCounter-- > 0) {

      brojBacanja = baciZaZbir(broj);
      zbir += brojBacanja;

      whileCounter--;
    }

    prosek = zbir / 100000;

    return prosek;
  }

  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int counter = 2;

    System.out.println("Zbir dve kocke" + "    " + "Prosecan broj bacanja");
    System.out.println("--------------" + "    " + "---------------------");

    for (int i = 2; i < 12; i++) {
      prosekZaZbir(counter);
      counter++;
      System.out.print(String.format("%7s%9s%14.2f", counter, "|", prosekZaZbir(counter)));
      System.out.println();
    }
  }
}
