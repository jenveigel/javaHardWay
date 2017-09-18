public class MathOperations {
  public static void main( String[] args ){
  int a, b, c, d, e, f, g;
  double x, y, z;
  String one, two, both;

  a = 10;
  b = 27;
  System.out.println( "a is " + a + ", b is " + b );

  c = a + b;
  System.out.println( "a+b is " + c );
  d = a - b;
  System.out.println( "a-b is " + d );
  e = a+b*3;
  System.out.println( "a+b*3 is " + e );
  f = b / 2;
  System.out.println( "b/2 is " + f );
  g = b % 10;
  System.out.println( "b%10 is " + g );

  x = 1.1;
  System.out.println( "\nx is " + x );
  y = x*x;
  System.out.println( "x*x is " + y );
  z = b / 2;
  System.out.println( "b/2 is " + z);
  System.out.println();

  one = "dog";
  two = "house";
  both = one + two;
  System.out.println( both );

  int h, j, k, l, m;
  double q, r, s;

  h = 5;
  q = 2.13;

  j = 4*h;
  System.out.println( "4*h is " + j);
  k = (h+b)/4;
  System.out.println( "(h+b)/4 is " + k);
  l = (a-h)%3;
  System.out.println( "(a-h)%3 is " + l);
  r = k-q;
  System.out.println( "k-q is " + r);


  }
}
