import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console userConsole = System.console();

    List<Triangle> allTriangles = new ArrayList<Triangle>();

    boolean programRunning = true;
    while(programRunning){

      System.out.println("Hello! Welcome to the Triangle Tracker! Would you like to track a triangle?.");
      String trackTrianlge = userConsole.readLine();

      if ( trackTrianlge == "yes" ) {
        System.out.println("Great!! Please enter the length of side #1.");
        String stringSide1 = userConsole.readLine();
        Interger side1 = Integer.parseInt(stringSide1);

      } else {
        System.out.println("Oh, darn. Well maybe next time!");
        programRunning = false;
      }
    }
  }
}
