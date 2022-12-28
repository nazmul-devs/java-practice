import java.util.*;

public class IfElseCondition {

    static void twoNumCheck(){
        Scanner userInput = new Scanner(System.in);
        int firstNum, secondNum;
        System.out.print("Enter your first number : ");
        firstNum=userInput.nextInt();
        System.out.print("Enter your second number : ");
        secondNum=userInput.nextInt();


        if(firstNum==secondNum){
            System.out.println(firstNum + " And " + secondNum + " is equal");
        }else if(firstNum> secondNum){
            System.out.println(firstNum + " is gretter then " + secondNum);
        }else if(firstNum< secondNum){
            System.out.println(firstNum + " is less then " + secondNum);

        }

    }

    static void switchCheck(){
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("How are you ? ");
                break;
            case 3:
                System.out.println("What's up ? ");
                break;
        
            default:
            System.out.println("Invalid input");
                break;
        }
    }
    public static void main(String[] args) {
        // twoNumCheck();
        switchCheck();
    }
    
}
