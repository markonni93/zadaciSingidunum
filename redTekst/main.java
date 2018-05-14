import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    String recenica = in.nextLine();
    int brojBrojeva = 0;
    int brojSlova = 0;

    for (int i = 0; i < recenica.length(); i++) {
      System.out.print(recenica.charAt(i) + " ");
      if (Character.isDigit(recenica.charAt(i))) {
        brojBrojeva++;
      } else if (Character.isLetter(recenica.charAt(i))) {
        brojSlova++;
      }
    }
    System.out.println();
    System.out.println(brojBrojeva + " " + brojSlova);


  }
}
