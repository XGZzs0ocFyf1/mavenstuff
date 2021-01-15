package ru.gurzhiy;
import ru.gurzhiy.GetNumber;
 
public class Main {
    public static void main( String[] args ){
        System.out.println( "Hello main method invoked" );
		GetNumber gn = new GetNumber();
		System.out.println("calling GetNumber.getNumber(): " + gn.getNumber());
    }
}
