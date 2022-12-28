import java.util.*;
public class InputFromUser {
    static void userInput(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String userName= input.nextLine();
        System.out.print("Enter your age : ");
        int userAge = input.nextInt();
        if(userAge>18){

            System.out.println("WELLCOME " + userName.toUpperCase());
        }else{
            System.out.println("Access denite you are not old enough");
        }
    }

    static void sumTwoNums(){
        Scanner input = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter your first numbers : ");
         num1= input.nextInt();
        System.out.print("Enter your second numbers : ");



        
         num2= input.nextInt();
sum = num1+num2;
System.out.println("Your two number sum is : "+ sum);
         
    }
    public static void main(String[] args) {
        // userInput();
        sumTwoNums();
    }
    
}
