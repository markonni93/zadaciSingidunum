import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    double depozit = in.nextDouble();
    double kamatnaStopa = in.nextDouble();

    double novcaniIznosKamate = (depozit/100) * kamatnaStopa;
    double uvecaniDepozit = depozit + novcaniIznosKamate;

    System.out.println("Iznos kamate je " + novcaniIznosKamate);
    System.out.println("Uvecani depozit " + uvecaniDepozit);
    
  }
}
