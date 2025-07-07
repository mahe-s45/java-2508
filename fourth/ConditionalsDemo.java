package fourth;

public class ConditionalsDemo {
    public static void main(String[] args) {
        // if Condition will execute if the condition is true
        int num = 10;
        // verify if given num is positive
        if (num>=10){
            System.out.println("The given Number is Positive");
        }

        // check if the number is in given range 10 - 20
        if (num >=10 && num <= 20) {
            System.out.println("The given is in range");
        }

        // if-else
        // verify if given num is postitive or negative
        if (num>0) {
            System.out.println("The given number is positive");
         } else {
                System.out.println("The given number is Negative");
        }

        // Voting App
        int age = 16;
        if (age>=18){
            System.out.println("You can Vote");
        }else{
            System.out.println("You Cannot Vote");
        }

        // Ternary Operator --> consise form of if-else
        // variable = (condition) ? value_if_true:value_if_false;
        String voteEligibility = (age>=18) ? "You Can Vote":"You Cannot Vote";
        System.out.println(voteEligibility);

        // nested else if (else if ladder)
        int marks = 73;
        if (marks>=90){
            System.out.println("Grade A");
        }else if (marks>=75) {
            System.out.println("Grade B");   
        }else if(marks>=65){
            System.out.println("Grade C");
        }else {
            System.out.println("Fail");    
        }
        
        // Switch Statement demo
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
                break;     
        }

        // fall through use-case
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("WEEKDAYS");
                break;
            case 6:
            case 7:
                System.out.println("WEEKENDS");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
        // new switch demo --> problem fixed --> consice form
        int ages = 25;
        String category = switch (ages) {
            case 0,1,2,3,4 -> "Toddler";
            case 5,6,7,8,9,10,11,12 -> "Child";
            case 13,14,15,16,17,18,19 -> "Teenager";
            case 20,21,22,23,24,25 -> "Young Adult";
            default -> "Adult";
        };
        System.out.println(category);


    }

}
