package encapsulation;

public class Car {
     private int price;
     private int number;
     private String name;
     private String model;
     int wheel = 10;

     void setName(String name)
     {
        this.name = name;
     }
     void setModel(String model)
     {
        this.model = model;
     }
     void setPrice(int price)
     {
        this.price  = price;
     }
     void setNumber(int number)
     {
        this.number = number;
     }
     
     public int getPrice() {
         return price;
     }
     public int getNumber() {
         return number;
     }
     public String getName() {
         return name;
     }
     public String getModel() {
         return model;
     }
     @Override
     public String toString() {
        return "Car [price=" + price + ", number=" + number + ", name=" + name + ", model=" + model + "]";
     }

     
}
