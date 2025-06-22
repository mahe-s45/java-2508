package CRM;

public class SalesLead {

    public static void main(String[] args) {
        
        int leadId = 541865123;
        String lead_firstName = "Olive";
        String lead_lastName = "Pope";
        byte leadAge = 32;
        char gender = 'M';
        String email = "pope2348@gmail.com";
        long phoneNumber = 733526430;
        String companyName = "Flash";
        String leadSource = "Online Advertising";
        String leadStatus = "Active";
        String leadIndustry = "Technology";

        System.out.println("Sales Lead ID: "+leadId);
        System.out.println("Full Name: "+lead_firstName+" "+lead_lastName);
        System.out.println("Age: "+leadAge);
        System.out.println("Gender: "+gender);
        System.out.println("Email Address: "+email);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Company Name: "+companyName);
        System.out.println("Sales Lead Source: "+leadSource);
        System.out.println("Sales Lead Status: "+leadStatus);
        System.out.println("Sales Lead Industry: "+leadIndustry);  

    }

}
