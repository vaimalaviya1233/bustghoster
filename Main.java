import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static java.lang.System.*;

class Main {
  public static void main(String[] args) throws FileNotFoundException {
    System.out.println("Hello world!");
    System.out.println();
    Scanner scn = new Scanner(new File("ready.txt"));
    //String cmd[] = new String[3764];
    String cmd = "";
    int lin = 0;
    while (scn.hasNextLine()) {
      cmd = cmd + (scn.nextLine() + "; ");
      //out.println(cmd[lin]);
      lin++;
      
    }
    out.println(cmd.toString());
    // while(scn.hasNextLine()){}
    PrintWriter writer = new PrintWriter("output.txt");
    writer.println(cmd);
    writer.close();
  }
}
