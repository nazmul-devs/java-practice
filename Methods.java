public class Methods {

    // print full name
    public static void printFullName(String firstName, String secondName) {
        String fullName = firstName + " " + secondName;
        System.out.println(fullName);        
    }

    // sum two numbers
    public static void sumTwoNumber(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);        
    }

    // convert celcious to farenheit
    public static void convertCelciousToFarenheit(Double celcious) {
        Double farenheit = (celcious * 9/5)+32 ;
        System.out.println(celcious + " (°C) equal " + farenheit +" (°F)");
        
    }
  public static void main(String[] args) {
    printFullName("Nazmul", "Ahmed");
    sumTwoNumber(555, 30);
    convertCelciousToFarenheit(33.0);
  }
}
