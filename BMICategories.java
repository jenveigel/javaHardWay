import java.util.Scanner;

public class BMICategories {
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

    System.out.print( "Your BMI is " + bmi );

    System.out.print( "BMI category: " );
    if ( bmi < 15.0 ) {
      System.out.println( "very severely underweight" );
    }

    else if ( bmi <= 16.0 ) {
      System.out.println( "severely underweight" );
    }

    else if ( bmi < 18.5 ) {
      System.out.println( "underweight" );
    }

    else if ( bmi < 25.0 ) {
      System.out.println( "normal weight" );
    }

    else if ( bmi < 30.0 ) {
      System.out.println( "overweight" );
    }

    else if ( bmi < 35.0 ) {
      System.out.println( "moderately obese" );
    }

    else if ( bmi < 40.0 ) {
      System.out.println( "severely obese" );
    }

    else {
      System.out.println( "very severely/\"morbidly\" obese" );
    }

  }
}
