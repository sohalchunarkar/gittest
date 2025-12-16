package test;

import java.util.*;

// import javax.crypto.AEADBadTagException;

public class Vehicle {
    public static void main(String[] args) {
        air  v1 = new air();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fule you want to put : ");
        int input = sc.nextInt();
        v1.fule();
        v1.tyre();
        v1.engine();
        v1.fule(input);
        sc.close();

        
    }
}