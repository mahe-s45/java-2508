package seven;

import java.util.*;

public class Trainer {

    int trainerID;
    String trainerName;
    int sessionTaken;
    int perSessionCost;
    int totalPayment;

    // Display trainer info
    public void trainerInfo() {
        System.out.println("===========TRAINER DETAILS============");
        System.out.println("Trainer ID: "+trainerID);
        System.out.println("Trainer NAME: "+trainerName);
    }

    // Calculate trainer payment
    public int trainerPaymentCal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number Of Sessions Taken");
        int numberOfSessionsTaken = sc.nextInt();
        int sessionBasedPayment = numberOfSessionsTaken * 1500; 
        return sessionBasedPayment;
    }

    public int totalPaymentForTrainer(){
        // assign trainer rating
        Student s1 = new Student();
        int bonus = s1.trainerRatings();
        int totalPaymentForTrainer = trainerPaymentCal() + bonus;
        return totalPaymentForTrainer;
    }
}
