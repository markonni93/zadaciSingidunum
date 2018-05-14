import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    String recenica = in.nextLine();
    char blank;

    for (int i = 0; i < recenica.length(); i++) {
      blank = recenica.charAt(i);

      if (Character.isSpaceChar(blank)) {
        System.out.println();
      } else if(Character.isLetter(recenica.charAt(i))) {
        System.out.print(recenica.charAt(i));
      }
    }


  }
}
