/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
  Scanner reader = new Scanner(System.in);
  System.out.println("What is your name?");
   String name = reader.nextLine();
   
    if( name.equals("Alice")) {
        System.out.println("yo Alice");

    } 
    else if(name.equals("Bob")) {
        System.out.println( "yo Bob");
    } else {
    System.out.println("finish the dam labs");
    }
  }
   
}
