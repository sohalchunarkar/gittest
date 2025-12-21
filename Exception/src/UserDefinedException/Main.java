package UserDefinedException;

public class Main {
  public static void main(String[] args) {
    try {
        String A = null;
        if(A == null)
        {
            throw new UserException("This is my defined exception");
        }
    } catch (Exception e) {
        
        System.out.println(e);
    }
  }
}
