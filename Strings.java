import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // declare strign
        String firstName, lastName, fullName;
        // user input
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        firstName = userInput.nextLine();
        System.out.print("Enter your last name: ");
        lastName = userInput.nextLine();
        // concatenation
        fullName = firstName + " " + lastName;
        // string length
        int nameSize = fullName.length();
        // print full name
        System.out.println("Your name is " + fullName);
        System.out.println(nameSize);


        // charAt
        for(int i =0; i<nameSize; i++){
            System.out.print( fullName.charAt(i) + " ");
        }


        // compare
        String name1,name2;
        name1 = userInput.nextLine();
        name2 = userInput.nextLine();

        if(name1.compareTo(name2)==0){
            System.out.println("Two name is equal");
        }else{
            System.out.println("Two string is not equal");
        }
    }
}
