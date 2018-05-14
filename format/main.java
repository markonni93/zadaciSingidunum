import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    double width = 210.0;
    double height = 297.0;

    double widthInches;
    double heightInches;

    widthInches = width / 25.4;
    heightInches = height / 25.4;

    System.out.println(widthInches + " " + heightInches);

  }
}
