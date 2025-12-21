package WithHandeledException;

public class finallyBlock {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch(Exception e)
        {
            System.out.println("This Exception Occures   --->   " + e.getMessage());
        }
        finally{
            System.out.println("This block execute exception occurs or not");
        }

        System.out.println("hello world");
    }
}
