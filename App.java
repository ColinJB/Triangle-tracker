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
        System.out.println("Thanks! What about side #2?");
        String stringSide2 = userConsole.readLine();
        Integer side2 = Interger.parseInt(stringSide2);
        System.out.println("Fantastic. Finally, how long is side #3?");
        String stringSide3 = userConsole.readLine();
        Interger side3 = Interger.parseInt(stringSide3);

        if ( side1 > side2 + side3 || side2 > side1 + side3 || side3 > side2 + side1 ) {
          System.out.println("I'm sorry. Your inputted lengths do not form a trianlge. Please adjust the numbers.");
        } else if ( side1 == side2 && side1 == side3 ) {
          String type = "Equilateral";
          Triangle newTriangle = new Triangle(side1, side2, side3, type);
          allTriangles.add(newTriangle);
          System.out.println("Great! Here is your triangle:");
          System.out.println("--------------");
          System.out.println( newTriangle.mSide1 );
          System.out.println( newTriangle.mSide2 );
          System.out.println( newTriangle.mSide3 );
          System.out.println( newTriangle.mType );
          System.out.println( "Your new triangle has been added to the queue." );
        } else if ( (side1 == side2 && side2 != side3) || (side2 == side3 && side3 != side1)  || (side1 == side3 && side3 != side2) ) {
          String type = "Isosceles";
          Triangle newTriangle = new Triangle(side1, side2, side3, type);
          allTriangles.add(newTriangle);
          System.out.println("Great! Here is your triangle:");
          System.out.println("--------------");
          System.out.println( newTriangle.mSide1 );
          System.out.println( newTriangle.mSide2 );
          System.out.println( newTriangle.mSide3 );
          System.out.println( newTriangle.mType );
          System.out.println( "Your new triangle has been added to the queue." );
        } else if ( side1 != side2 && side1 != side3 && side2 != side3 ) {
          String type = "Scalene";
          Triangle newTriangle = new Triangle(side1, side2, side3, type);
          allTriangles.add(newTriangle);
          System.out.println("Great! Here is your triangle:");
          System.out.println("--------------");
          System.out.println( newTriangle.mSide1 );
          System.out.println( newTriangle.mSide2 );
          System.out.println( newTriangle.mSide3 );
          System.out.println( newTriangle.mType );
          System.out.println( "Your new triangle has been added to the queue." );
        }


        Triangle newTriangle = new Triangle(side1, side2, side3,);

      } else {
        System.out.println("Oh, darn. Well maybe next time!");
        programRunning = false;
      }
    }
  }
}
