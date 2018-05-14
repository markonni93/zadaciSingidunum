import java.io.BufferedInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    int katetaA = in.nextInt();
    int katetaB = in.nextInt();

    long vremePre = System.currentTimeMillis();
    System.out.println(vremePre);

    int temp = (katetaA * katetaA) + (katetaB * katetaB);
    double hipotenuza = Math.sqrt(temp);
§
    long vremePosle = System.currentTimeMillis();
    System.out.println(vremePosle);

    long vreme = vremePosle - vremePre;

    System.out.println("Hipotenuza je " + hipotenuza);
    System.out.println(vreme + "ms");

  }
}
