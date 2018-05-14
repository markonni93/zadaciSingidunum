import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int brojRedova = in.nextInt();
    int prazno;
    int zvezdica;

    brojRedova = brojRedova % 2 == 0 ? brojRedova + 1 : brojRedova;

    //System.out.println(brojRedova);

    for(int i = 1; i <= brojRedova; i++) {
      prazno = brojRedova/2 - i + 1;
      //System.out.println(prazno);

      if (prazno < 0) {
        prazno = -(prazno);
        //System.out.println(prazno);
      }

      zvezdica = 2 * (brojRedova / 2 - prazno) + 1;

      for (int j = 1; j <= prazno; j++) {
        System.out.print(" ");
      }

      for (int k = 1; k <= zvezdica; k++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}
