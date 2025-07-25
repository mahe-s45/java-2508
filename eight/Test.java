package eight;

public class Test {

    // instance Variable
    int x;
    int y;
    int z;
    double a;

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
    // number of parameters changed
     public Test (int x, int y, int z){
        // The above x & y are local Variables
       this.x = x;
       this.y = y;
       this.z = z;
     }
     // type of parameters changed
      public Test (int x, double a){
        // The above x & y are local Variables
       this.x = x;
       this.a = a;
      }
      // order of paramerters changed
       public Test (double a, int x){
        // The above x & y are local Variables
       this.x = x;
       this.a = a;
    }

    public int addNumbers () {
        return x+y+z;
    }

    public static void main(String[] args) {
        int a = 1; // local Variable
        System.out.println(a);
        Test t1 = new Test();
        System.out.println("Sum of values is "+t1.addNumbers());

        Test t2 = new Test(10, 20);
        System.out.println("Sum of values from parametrised "+t2.addNumbers());

        Test t3 =new Test(10, 20, 30);
        System.out.println("Sum of values: "+t3.addNumbers());
    }


}
