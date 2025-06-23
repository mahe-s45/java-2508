package CRM;

public class SalesOpportunity {
    public static void main(String[] args) {
        
        int opportunityID = 487546;
        String opportunityName = "Process Executive";
        String eligibility = "B.E/B.Tech, Degree";
        double expectedRevenue = 25000.00;
        String track = "Proposal Sent";
        String lastDate = "22-06-2025";
        String assignedto = "Manager";
        boolean isActive = true;

        System.out.println("Opportunity ID: "+opportunityID);
        System.out.println("Position: "+opportunityName);
        System.out.println("Eligibility: "+eligibility);
        System.out.println("Expected Revenue: "+expectedRevenue);
        System.out.println("Application Track: "+track);
        System.out.println("Deadline :"+lastDate);
        System.out.println("Assigned to: "+assignedto);
        System.out.println("Status: "+isActive);

    }

}
