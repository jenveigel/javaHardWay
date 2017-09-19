import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double lb, in, m, kg, bmi;

    System.out.print( "Your height in inches: " );
    in = keyboard.nextDouble();
    m = in*0.0254;

    System.out.print( "Your weight in lbs: " );
    lb = keyboard.nextDouble();
    kg = lb*0.4536;

    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );

  }
}
