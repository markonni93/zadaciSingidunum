import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int brojBacanja;
    int rezultat;
    int counterPismo = 0;
    int counterGlava = 0;
    double kolicnikPismo;
    double kolicnikGlava;

    while (true) {

      brojBacanja =  in.nextInt();
      int broj = brojBacanja;

      if (brojBacanja == 0) {
        break;
      }

      while (brojBacanja > 0) {

        rezultat = (int) (Math.random() * 2);

        if (rezultat == 0) {
          counterPismo++;
        } else {
          counterGlava++;
        }

        brojBacanja--;
      }

      kolicnikPismo = (double) counterPismo / broj;
      kolicnikGlava = (double) counterGlava / broj;

      System.out.println("Pismo je palo " + counterPismo);
      System.out.println("Glava je pala " + counterGlava);

      System.out.println("Pismo kolicnik je " + kolicnikPismo);
      System.out.println("Glava kolicnik je " + kolicnikGlava);

    }
  }
}
