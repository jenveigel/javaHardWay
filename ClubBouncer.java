public class ClubBouncer {
  public static void main( String[] args ) {
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if ( onGuestList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
      System.out.println("You are allowed to enter the club.");
    }
    /* a line of code here will break the program
    because an else is only allowed directly after the "if" {}
    So something like this
      System.out.println("I don't think so...");
    won't work here*/
    else {
      System.out.println("you are not allowed to enter the club.");
    }
  }
}
