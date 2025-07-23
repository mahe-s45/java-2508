package seven;

import java.util.*;

public class Student {
    
    //student attributes
    // ID, name, attendence, performence scores and trainer ratings
    int studentID;
    String studentName;
    int attendenceCredits;
    int performenceCredits;
    int finalCredits;
    int trainerRatings;

    //display student info
    public void studentInfo(){
        System.out.println("==========STUDENT DETAILS==========");
        System.out.println("Student ID: "+studentID);
        System.out.println("Student NAME: "+studentName);
    }

    //Take Input
    Scanner sc = new Scanner(System.in);

    //calculate attendence credits based on sessions attented
    public int sessionsAttendedCredits(){
        System.out.println("Enter Number Of Sessions Attented");
        int noOfSessionsAttended = sc.nextInt();

        // condition
        if(noOfSessionsAttended >= 30){
            return attendenceCredits+=5;
        }else if (noOfSessionsAttended >=20){
            return attendenceCredits+=3;
        }else {
            //return attendenceCredits+=0; // 1st
            return attendenceCredits=0; //2nd
        }
    }

    // calculate performance credits based on score
    public int performenceScoreCredits(int score){
        if(score>=85){
            return performenceCredits+=5;
        }else if(score>=60){
            return performenceCredits+=3;
        }else {
            return performenceCredits+=0;
        }
    }

    // Calculate final acheivement credits
    public String acheivementStatus(){
    finalCredits = attendenceCredits + performenceCredits;
    if (finalCredits>=10){
        return "GOLD";
    }else if (finalCredits>=8){
        return "SILVER";
    }else {
        return "YOU NEED TO IMPROVE";
    }
}

// Trainer rating
int addBonus;
public int trainerRatings(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Trainers Training (1 - 5)");
    trainerRatings = sc.nextInt();
    if (trainerRatings==5) {
        return addBonus+=5000;
    }else{
        return addBonus+=0;
    }

 }

}


