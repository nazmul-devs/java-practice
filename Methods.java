
import java.util.*;
import java.util.function.IntUnaryOperator;
public class Methods {

    // print full name
    public static void printFullName() {
        String firstName,  lastName;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        firstName=input.nextLine();
        System.out.print("Enter your last name: ");
        lastName=input.nextLine();
        String fullName = firstName + " " + lastName;
        System.out.println( "Your full name is : "+ fullName);        
    }

    // sum two numbers
    public static void sumTwoNumber() {
        int num1,  num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        num1= input.nextInt();
        System.out.print("Enter your second number : ");
        num2= input.nextInt();
        int result = num1 + num2;
        System.out.println(result);        
    }

    // convert celcious to farenheit
    public static void convertCelciousToFarenheit() {
        Double celcious;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your tampareture in celciout : ");
        celcious = input.nextDouble();
        Double farenheit = (celcious * 9/5)+32 ;
        System.out.println(celcious + " (°C) equal " + farenheit +" (°F)");
        
    }
  public static void main(String[] args) {
    // printFullName();
    // sumTwoNumber();
    convertCelciousToFarenheit();
  }
}
