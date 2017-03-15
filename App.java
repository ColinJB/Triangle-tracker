import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console userConsole = System.console();

    List<Triangle> allTriangles = new ArrayList<Triangle>();

    boolean programRunning = true;
    while(programRunning){

      System.out.println("Hello! Welcome to the Triangle Tracker! If you have created triangles already and wish to see them, enter 'See all triangles'. Otherwise, Would you like to track a triangle?.");
      String trackTriangle = userConsole.readLine();

      if ( trackTriangle.equals("See all triangles") ) {
        for ( Triangle individualTriangle : allTriangles ) {
            System.out.println("-------------");
            System.out.println( individualTriangle.mSide1 );
            System.out.println( individualTriangle.mSide2 );
            System.out.println( individualTriangle.mSide3 );
            System.out.println( individualTriangle.mType );
        }
      } else if ( trackTriangle.equals("yes") ) {
            System.out.println("Great!! Please enter the length of side #1.");
            String stringSide1 = userConsole.readLine();
            Integer side1 = Integer.parseInt(stringSide1);
            System.out.println("Thanks! What about side #2?");
            String stringSide2 = userConsole.readLine();
            Integer side2 = Integer.parseInt(stringSide2);
            System.out.println("Fantastic. Finally, how long is side #3?");
            String stringSide3 = userConsole.readLine();
            Integer side3 = Integer.parseInt(stringSide3);

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
      } else if ( trackTriangle.equals("no") ) {
        System.out.println("Oh, darn. Well maybe next time!");
        programRunning = false;
      } else {
        System.out.println("Please enter one of the following: 'yes', 'no', or 'See all triangles'.");
      }
    }
  }
}
