import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    // for (int i = 0; i < 5; i++) {
    //   for (int j = 0; j <= 18; j++) {
      //   if(i == 0 && j == 0) {
      //     System.out.print('+');
      //   } else if (i == 0 && j < 18) {
      //     System.out.print('-');
      //   } else if (i == 0 && j == 18){
      //     System.out.print('+');
      //     System.out.println();
      //   } else if (i == 1 && j == 0) {
      //     System.out.print('|');
      //   } else if (i == 1 && j < 18) {
      //     System.out.print(' ');
      //   } else if (i == 1 && j == 18) {
      //     System.out.print('|');
      //     System.out.println();
      //   } else if (i == 2 && j == 0) {
      //     System.out.print('|');
      //   } else if (i == 2 && j < 18) {
      //     System.out.print(' ');
      //   } else if (i == 2 && j == 18) {
      //     System.out.print('|');
      //     System.out.println();
      //   } else if (i == 3 && j == 0) {
      //     System.out.print('|');
      //   } else if (i == 3 && j < 18) {
      //     System.out.print(' ');
      //   } else if (i == 3 && j == 18) {
      //     System.out.print('|');
      //     System.out.println();
      //   } else if (i == 4 && j == 0) {
      //     System.out.print('+');
      //   } else if (i == 4 && j < 18) {
      //     System.out.print('-');
      //   } else if (i == 4 && j == 18){
      //     System.out.print('+');
      //     System.out.println();
      //   }
      //
      System.out.println("------------------");
      System.out.println("| Marko Djurdjev |");
      System.out.println("------------------");
      ispisiUPravougaoniku("Marko");
      ispisiUPravougaoniku("");
      ispisiUPravougaoniku("   Marko");
      ispisiUPravougaoniku("Marko     ");
      ispisiUPravougaoniku("    Marko    ");
      String s1 = "pera";
      String s2 = "zika";
      String s3 = s1 + s2;
      System.out.println(s3);
      int i = Integer.valueOf("35");
  }

  public static void ispisiUPravougaoniku(String text) {
    if (text == null)
      return;
    String trimedText = text.trim();
    int textLength = trimedText.length();
    ispisiPunRed(textLength + 2);
    System.out.println("| " + text + " |");
    ispisiPunRed(textLength + 2);
  }

  public static void ispisiPunRed(int duzina) {
    System.out.print('+');
    for (int i = 0; i < duzina; i++) {
      System.out.print('-');
    }
    System.out.println('+');
  }
}
