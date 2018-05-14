import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    String broj = in.nextLine();
    int number;
    char karakter;
    int rezultat = 0;
    int stepen = broj.length() - 1;

    for (int i = 0; i < broj.length(); i++) {
      karakter = broj.charAt(i);
      karakter = Character.toUpperCase(karakter);

      number = Character.isLetter(karakter) ? heksVrednost(karakter) : Character.getNumericValue(karakter);

      rezultat += number * (Math.pow(16, stepen));
      stepen--;

      System.out.println(number);

      System.out.println(rezultat);
    }
  }

  public static int heksVrednost(char a) {

    int vrednost = 0;

    switch(a) {
      case 'A':
      vrednost = 10;
      break;
      case 'B':
      vrednost = 11;
      break;
      case 'C':
      vrednost = 12;
      break;
      case 'D':
      vrednost = 13;
      break;
      case 'E':
      vrednost = 14;
      break;
      case 'F':
      vrednost = 15;
      break;
      default:
      vrednost = -1;
      break;
    }
    return vrednost;
  }
}
