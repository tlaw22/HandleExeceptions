import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
            // TODO Auto-generated constructor
            int x =getIntEAFP();
            System.out.println("x is " + x);
      }

      // section 3
      private static int getIntEAFP(){
            Scanner s = new Scanner(System.in);
            System.out.println("Please type an integer:");
            try {
                  return s.nextInt();
            } catch(InputMismatchException e) {
                  return 0;
            }
      }
      private static int getIntL() {
            Scanner s = new Scanner(System.in);
            return s.nextInt();
      }
      private static int getIntLBYL(){
            Scanner s = new Scanner(System.in);
            boolean isValid = true;
            System.out.println("Please enter and integer:");
            String input = s.next();
            for(int i = 0; i<input.length(); i++) {
                  if(!Character.isDigit(input.charAt(i))){
                        isValid = false;
                        break;
                  }
            }
            if(isValid){
                  return Integer.parseInt(input);
            }
            return 0;
      }
}