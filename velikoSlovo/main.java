import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

  public static void kapitalizuj(String a) {

    String[] words = a.split("\\W+");

    for (int i = 0; i < words.length; i++) {
      words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
      System.out.print(words[i] + " ");
    }
  }

  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    String recenica = in.nextLine();
    kapitalizuj(recenica);

  }
}
