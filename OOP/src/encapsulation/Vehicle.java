package encapsulation;

public class Vehicle {
    public static void main(String[] args) {
        Car  c1 = new Car();
        c1.setModel("Maruti");
        c1.setName("Alto");
        c1.setNumber(9912);
        c1.setPrice(10000);
        System.out.println(c1);
    //    System.out.println(c1.getModel()); 
    }
}
