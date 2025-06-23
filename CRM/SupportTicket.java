package CRM;

public class SupportTicket {
    public static void main(String[] args) {
        
        int ticketID = 419465;
        int userID = 985264;
        String subject = "Registration issue";
        String description = "User cannot receive security code.";
        String priority = "High";
        String ticketRiseDate = "19-06-2025";
        String status = "Active";
        String resolvedDate = "";
        String assignedTo = "Technical Team";
        boolean isResolved = false;

        System.out.println("Ticket ID: "+ticketID);
        System.out.println("User ID: "+userID);
        System.out.println("Subject: "+subject);
        System.out.println("Description: "+description);
        System.out.println("Priority: "+priority);
        System.out.println("Ticket Rise Date: "+ticketRiseDate);
        System.out.println("Status: "+status);
        System.out.println("Resolved Date: "+resolvedDate);
        System.out.println("Assigned to: "+assignedTo);
        System.out.println("Resolved: "+isResolved);
        
    }

}
