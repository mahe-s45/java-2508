package fifth;

public class WhileDemo {
    public static void main(String[] args) {
        // water bottle sips = 5
        int waterInBottle = 5;
        System.out.println("Drinking Water");

        while (waterInBottle > 0) {
            System.out.println("Took asip, Remaianing Sips: "+(waterInBottle-1));
            waterInBottle--;
            
        }
    }

}
