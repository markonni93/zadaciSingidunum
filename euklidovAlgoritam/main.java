import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

  public static int euklidovAlgoritam(int a, int b) {
    int manji;
    int razlika;
    int nzd;

    manji = a < b ? a : b;

    razlika = a > b ? a - manji : b - manji;

    nzd = a < b ? a : b;

    while (( razlika % nzd != 0) || (manji % nzd != 0)) {
      nzd = nzd - 1;
    }

    return nzd;
  }

  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();
    int rezultat;

    rezultat = euklidovAlgoritam(a, b);
    System.out.println(rezultat);
    
  }
}
