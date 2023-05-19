import java.util.Scanner;

public class functions {
    public static void main(String[] args){
        greetings(56);


    }
    static void greetings(String a){
        System.out.println("Hello "+a);
    }
    //overloading
    static void greetings(Integer a){
        System.out.println("Hola "+a);
    }
}

