package fifth;

import java.util.Scanner;

public class LMSGradeTracker {
    public static void main(String[] args) {

        // input 
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter ID: ");
        int studentID = scanner.nextInt();

        System.out.println("Enter Name: ");
        scanner.nextLine(); // read the new line
        String studentName = scanner.nextLine();

        double attendence = 0;
        int totalScore = 0;
        int numberOfSubjects = 0;

        // store input given from student
        char continueInput = 'y';

        // why not 'for' here ? --> which students will input how many subjects scores
        while (continueInput == 'y' || continueInput == 'Y') {
            System.out.println("Enter Score Per Subject: "+(numberOfSubjects+1));
            int currentScore = scanner.nextInt();
            numberOfSubjects++;

            totalScore+= currentScore; // add each currentScore to totalScore
            // Ask the user if they want to enter another score
            System.out.println("Do you want to enter another score ? (y/n) ");
            continueInput = scanner.next().charAt(0);

        }
        // fix the issue here --> Type Casting Needed
        double avgScore = (double) totalScore/numberOfSubjects;

        String performance;
        if (avgScore >= 85) {
            performance = "Excellent";
            } else if (avgScore>=70) {
                performance = "Good";
            } else if (avgScore>=50) {
                performance = "Average";
            }
             else {
                    performance = "Need Improvement";
            }

        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
        System.out.println("Total Score: "+totalScore);
        System.out.println("Average Score: "+avgScore);
        System.out.println("Your Performence: "+performance);
        
    }

}
