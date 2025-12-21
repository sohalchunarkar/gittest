package WithHandeledException;

public class ThrowExample {
    
    public static void main(String[] args) {
        try{
            int a = 10;
            if(a != 10)
            {
                System.out.println("A is not equal to 10");
            }
            else{
                throw new Exception("This is because a is equal to 10" );
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Here code working normally");
    }
}
