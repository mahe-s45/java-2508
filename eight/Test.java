package eight;

public class Test {

    // instance Variable
    int x;
    int y;

    // explicit constructors without parameters -> what values you wanted, you defined
    public Test (){
        x = 100;
        y = 200;
    }

    // explicit constructors with parameters -> what values you wanted, you defined
    public Test (int x, int y){
        // The above x & y are local Variables
       this.x = x;
       this.y = y;
    }

    public int addNumbers () {
        return x+y;
    }

    public static void main(String[] args) {
        int a = 1; // local Variable
        System.out.println(a);
        Test t1 = new Test();
        System.out.println("Sum of values is "+t1.addNumbers());

        Test t2 = new Test(10, 20);
        System.out.println("Sum of values from parametrised "+t2.addNumbers());
    }


}
