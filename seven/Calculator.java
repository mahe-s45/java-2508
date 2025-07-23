package seven;

public class Calculator {
    //method with no parameters & no return types
    public void greetingMsg(){
        System.out.println("Welcome To CASIO Calculator");
    }
    //method with one parameter and return type
    public String numberType(int num){
        if ( num>0) {
            return "Positive Number";
        }else {
            return "Negative Number";
        }
    }

    //method with multiple parameter with same type and return type
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    //method with multiple parameter with different types and return types
    public double productNumbers(int num1, double num2) {
        return num1 * num2;
    }

}
