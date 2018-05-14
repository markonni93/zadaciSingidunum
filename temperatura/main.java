import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    System.out.println("Unesite temperatura u C");
    double temperatura = in.nextDouble();

    double temperaturaF = (9 * temperatura)/5 + 32;

    System.out.println(temperaturaF);


  }
}
