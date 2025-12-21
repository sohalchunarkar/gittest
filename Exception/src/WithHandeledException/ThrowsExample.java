package WithHandeledException;

// import java.util.Scanner;

public class ThrowsExample {

    public static void demo(int a , int b) throws InterruptedException {

       if(a*b % 2 == 0)
       {
          throw new ArithmeticException("This is an odd number cannot be considered");
       }

    }
   public static void main(String[] args) {
  
      int a = 2;
  
      int b = 2;    
      try{

          demo(a, b);   
      } 
      catch(Exception e)
      {
        System.out.println(e);
      }
     System.out.println("running code normally");
    //   sc.close();
   }
}
