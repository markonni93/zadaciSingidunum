import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    String recenica = in.nextLine();


    String[] words = recenica.split("\\W+");

    for (int i = 0; i < words.length; i++) {
      System.out.println(words[i]);
    }


  }
}
