package chapter1;
import java.util.*;
// import java.util.Random;
/**
 * this is a sample class for Ciicc Batch3
 */
 
public class JavaBasics{
    public static void main(String[] args){
        System.out.println("Hello World!" );
        Random r = new Random();
        // System.out.println(r.nextInt());

        //this is a single line comment
        /**
         * this is 
         * a multi line
         */
    }
}

class Car{
    int year = 2005;
    String Name = "misyubibi";
    String Color = "penk";
}

class Basics2{
    JavaBasics mb;
    Car car1 = new Car();
    Car car2 = new Car();
}