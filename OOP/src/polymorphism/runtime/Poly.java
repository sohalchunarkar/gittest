package polymorphism.runtime;
//run time poly (method overridding)
public class Poly {
     public int sum(int a , int b)
     {
        return a+b;
     }
     public int sum(int a , int b , int c)
     {
        return a+b+c;
     }
     
     public int sum(int a , int b , int c ,int d)
     {
        return a+b+c+d;
     }
}
