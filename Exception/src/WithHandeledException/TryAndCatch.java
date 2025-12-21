package WithHandeledException;

public class TryAndCatch {
   public static void main(String[] args) {
      int a  = 109;
      int b = 0;
      try {
        int res = a/b;
        System.out.println(res);
      } catch (ArithmeticException e) {
        System.out.println("The exception occured is" +e);
      }
      finally{
        System.out.println("This is The Execution Of Finally Block");
      }

      System.out.println("This is The Rest Of The Code Normally");
   }
}
