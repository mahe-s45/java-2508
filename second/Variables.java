package second;

public class Variables {

    static int numb; //static variables -> we can use static variables without Intialization
    int num; // instance variable -> we can use variables without Instalization in non-static methods

    //non-static method
    public void displayNumber(){
        System.out.println(num);
    }

    public static void main(String[] args) {
        int number; // local Variables -> where a variable defined inside a method -> must be Intialized
        System.out.println(numb);
      //  System.out.println(num);
      //  System.out.println(number);
    }

}
