
import java.io.BufferedInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.LocalTime;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    Scanner in = new Scanner(System.in);

    LocalDateTime now = LocalDateTime.now();
    int month = now.getMonthValue();
    int day = now.getDayOfMonth();
    int year = now.getYear();
    int hour = now.getHour();
    int minute = now.getMinute();

    int packed = year << 20 | month << 16 | day << 11 | hour << 6 | minute;

    binarnaReprezentacija(packed);
    binarnaReprezentacija(packed >>> 16);
    binarnaReprezentacija(0xf);
    binarnaReprezentacija((packed >>> 16) & 0xf);


    int godina = packed >>> 20;
    int mesec = (packed >>> 16) & 0xf;
    int dan = (packed >>> 11 ) & 0x1f;
    int sat = (packed >>> 6) & 0x1f;
    int minut = packed & 0x2f;

    System.out.println(dan + " " + mesec + " " + godina + " " + sat + " " + minut);

    System.out.println(mesec);
    System.out.println(dan);
    System.out.println(godina);
    System.out.println(sat);
    System.out.println(minut);

    binarnaReprezentacija(year);
    binarnaReprezentacija(month);
    binarnaReprezentacija(day);
    binarnaReprezentacija(hour);
    binarnaReprezentacija(minute);

  }

  public static void binarnaReprezentacija(int a) {
    int c = 0x80000000;
    do {
        System.out.print((a & c) == 0 ? "0" : "1");
        c = c >>> 1;
      }
    while (c != 0);
    System.out.println();
  }
}
