import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
      public static void main(String[] args) {
            try {
                  int result = divide();
                  System.out.println(result);
            } catch(ArithmeticException |NoSuchElementException  g)
            {
                  System.out.println(g.toString());
                  System.out.println("Unable to preform operations.");
            }
      }
      private static int divide(){
            int x, y;
//            try {
                  x =getInt();
                  y =getInt();
                  System.out.println("x: " + x + " y: " + y);
                  return x/y;
//            } catch(NoSuchElementException e) {
//                  throw new ArithmeticException("No suitable input");
//            } catch(ArithmeticException g) {
//                  throw new ArithmeticException("Attempted to divide by 0");
//            }


      }
      private static int getInt() {
            Scanner s = new Scanner(System.in);
            System.out.println("Please enter an integer:");
            while (true){
                  try {
                        return s.nextInt();
                  } catch(InputMismatchException e){
                        // go round again
                        s.nextLine();
                        System.out.println("Please enter a number, not letters.");
                  }
            }

      }


}
