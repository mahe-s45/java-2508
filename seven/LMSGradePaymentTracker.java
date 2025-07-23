package seven;

public class LMSGradePaymentTracker {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentID = 101;
        s1.studentName = "Mahesh";

        s1.studentInfo();
        System.out.println(s1.sessionsAttendedCredits());

       System.out.println(s1.performenceScoreCredits(90));

       System.out.println(s1.acheivementStatus());

       Trainer t1 = new Trainer();
       t1.trainerID = 456;
       t1.trainerName = "Mike";

       t1.trainerInfo();
       s1.trainerRatings();

       System.out.println(t1.trainerPaymentCal());
       System.out.println(s1.trainerRatings());
    }

}
