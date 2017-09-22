import java.util.Scanner;

public class SafeSquareRoot {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String askReady, answReady;

    System.out.print("Give me a number, and I'll find it's square root. ");
    System.out.println("(No negatives, please.) ");

    askReady = "YES!";

    System.out.print("Are you ready?!?\nPlease enter YES! or NO!");
    answReady = keyboard.next();

      while ( ! answReady.equals(askReady) ) {
        System.out.print("Now, are you ready?!? (YES! or NO!)");
        answReady = keyboard.next();
      }
      System.out.println("Great! Love that enthusiasm!! Give me a number.");
        x = keyboard.nextDouble();

    while ( x < 0 ) {
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x = keyboard.nextDouble();
    }
    y = Math.sqrt(x);

    System.out.println("The square root of "+x+" is "+y);
  }
}
