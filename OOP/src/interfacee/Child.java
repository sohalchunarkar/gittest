package interfacee;

public class Child implements Parent{

     String cname;
    Child(){}
    Child(String cname){
        this.cname = cname;
    }

    @Override
    public void name() {
        System.out.println("The name of Parent is class " + Parent.n1);
        
    }
    public void cname()
    {
        System.out.println("this is child name " +cname);
    }
}
