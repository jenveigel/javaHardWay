import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double lb, m, totIn, kg, bmi;
    int ft, in;

    System.out.print( "Your height in feet: "  );
    ft = keyboard.nextInt();
    System.out.print( " and inches: " );
    in = keyboard.nextInt();
    //how do I get feet & inches on one line?

    totIn = ft*12+in;

    m = totIn*0.0254;

    System.out.print( "Your weight in lbs: " );
    lb = keyboard.nextDouble();
    kg = lb*0.4536;

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );

  }
}
