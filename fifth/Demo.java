package fifth;

public class Demo {
    public static void main(String[] args) {
        // without Loops
        // Say HI for 10 times
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        
        // fill 5 water bottles
        for (int i=1; i<=5; i++){

         // skip bottle 3, it's broken
            // continue --> skip that specific condition
            if(i==3){
                continue;
            }
            System.out.println("Filling water bottle: "+i);
        }   
    }

}
