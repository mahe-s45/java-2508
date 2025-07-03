package third;

public class LMSOperators {
    public static void main(String[] args) {
        // Declare Values
        int studentId = 456;
        String studentName = "Sashi";
        byte age = 23;
        double quizScore = 75;
        double assignmentScore = 80;
        double examScore = 78;
        double attendence = 75;

        // Calculate total & Avg Scores
        double totalScore = quizScore+assignmentScore+examScore;
        double avgScore = totalScore/3;

        // If avg score >= 75 -> PASS
        boolean isPassed = avgScore >= 70;

        // Simulate Attendence
        attendence++;

        // student qualified for AWARD
        // If avg attendence >= 75 -> PASS
        boolean isqualified = isPassed && attendence >= 70;

        System.out.println("Studnet Name: "+studentName);
        System.out.println("Student ID: "+studentId);
        System.out.println("Student Age: "+age);
        System.out.println("Total Score: "+totalScore);
        System.out.println("Average Score: "+ avgScore);
        System.out.println("Is Student Passed: "+isPassed);

        System.out.println("Student Attendence After Attending: "+attendence);
        System.out.println("Is Student Qualified: "+isqualified);


    }

}
