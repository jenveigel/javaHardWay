import java.util.Scanner;

public class EnterPIN {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String pwd, typedPwd;

    pin = 12345;
    pwd = "Blue5";

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.println("ENTER YOUR PASSWORD.");
    typedPwd = keyboard.next();

      while ( ! typedPwd.equals(pwd) ) {
        System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
        System.out.print("ENTER YOUR PASSWORD.");
        typedPwd = keyboard.next();
      }

    System.out.println("\nPIN ACCEPTED");

    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while ( entry != pin ) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }
    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
