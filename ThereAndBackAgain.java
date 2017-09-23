public class ThereAndBackAgain {
  public static void main( String[] args ) {
     System.out.println( "Here." );
     erebor();
     //if parentheses above are removed, does not compile
     System.out.println( "Back first time." );
     /*erebor();*/
     System.out.println( "Back second time." );
  }

  public static void erebor() {
    System.out.println( "There." );
  }
}
