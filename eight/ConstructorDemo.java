package eight;

public class ConstructorDemo {

    // explicit Constructor
        public ConstructorDemo(){

    }

    // explicit constructor with parameters
    public ConstructorDemo(int num) {

    }

    public static void main(String[] args) {

        // new --> allocate memory, create a space for obj
         ConstructorDemo obj = new ConstructorDemo();

         System.out.println("Implicit Constructor will be called: ");

    }

}
