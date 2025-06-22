package CRM;

import java.time.LocalDate;

public class Customer {

    public static void main(String[] args) {

        int customerID = 465145;
        String firstName = "Madhu";
        String LastName = "Siliveru";
        char gender = 'M';
        byte age = 23;
        String email = "madhusiliveru459@gmail.com";
        String phoneNumber = "9846280675";
        String address = "plot no: 297, main street, Delhi";
        String country = "India";
        long pincode = 516477;
        LocalDate date = LocalDate.of(2024, 6, 24);
        boolean isActive = true;

        System.out.println("Customer ID: "+customerID);
        System.out.println("First Name: "+firstName+" "+LastName);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Email: "+email);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Full Address: "+address+", "+country+", "+pincode);
        System.out.println("Date: "+date);
        System.out.println("Active or Not: "+isActive);
    }

}
