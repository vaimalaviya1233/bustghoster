import java.util.Scanner;
import java.nio.file.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println();
    Scanner scn = new Scanner("ready.txt");
    String cmd[] = new String[3764];
    int lin = 0;
    while(scn.hasNextLine()){
      lin++;
    }
    System.out.println(lin);
    //while(scn.hasNextLine()){}
  }
}
