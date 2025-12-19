package OOP;

public class Teacher {
     public static int mobile = 29;
     public int date = 19;
   
     
    //  public Teacher(){
    //     System.out.println("this is a non ");
    //  }
    //static mehtod can be accessed without it's object
     public static void demo1(){
        mobile  = 234;
        //cant use non static variables
        // date = 23; static method can only use static things
        System.out.println("This is a static method");
     }
     public void demo2()
     {  // non static method use static as well non static 
        mobile = 23525;
        date = 2342;
        System.out.println("this is a non staic method");
     }

  
 }
