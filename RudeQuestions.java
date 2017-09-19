import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name, religion;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name?" );
    name = keyboard.next();
    //unable to blow up the program here
    //numbers and symbols can be part of a String of characters

    System.out.print( "Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();
    //letters and numbers wtih decimals blow up the program here since neither is an integer

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();
    /* entering an integer here does not blow up the program
    because integers are included in doubles. Not vice-versa.*/

    System.out.println( weight + "! Better keep that quiet!!" );

    System.out.print( "Just kidding! What religion are you? " );
    religion = keyboard.next();

    System.out.print("Finally, what's your income, " + name + "? " );
    income = keyboard.nextDouble();
    //only letters and symbols (other than decimal) blow up the program here
    //integers and fractions expressed with decimals work--positive and negative

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, ");
    System.out.println( name + "." );

  }
}
