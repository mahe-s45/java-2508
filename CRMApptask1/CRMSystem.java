package CRMApptask1;

public class CRMSystem {
    public static void main(String[] args) {
        
        //Customer
        int customerId = 156;
        String customerName = "Mick";
        double totalPurchase = 1500.00;
        int interactionCount = 5;

        //Sales Lead
        int leadId = 7564;
        double leadBudget = 2500.00;
        boolean isContacted = true;

        // Sales Oppurchunity
        double opportunityValue = 5500.00;
        boolean isClosed = false;

        // Arithemetic : Average Purchase Value
        int numberOfPurchases = 5;
        double averagePurchase = totalPurchase / numberOfPurchases;

        // Relational : High Value oppurchunity check
        boolean isHighValue = opportunityValue > 5000;

        // logical : Should prioritize lead
        boolean shouldPrioritize = (leadBudget > 3000) && (!isContacted);

        // Increment: New interaction happens
        interactionCount++;

        System.out.println("=== Customer Details ===");
        System.out.println("Customer ID: "+customerId);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Total Purchase: "+totalPurchase);
        System.out.println("Average Purchase: "+averagePurchase);
        System.out.println("Interactions After Update: "+interactionCount);

        System.out.println("=== Sales Lead ===");
        System.out.println("Lead ID: "+leadId);
        System.out.println("Lead Budget: "+leadBudget);
        System.out.println("Contacted: "+isContacted);
        System.out.println("Should Prioritize: "+shouldPrioritize);

        System.out.println("=== Sales Oppurchunity ===");
        System.out.println("Opporchunity Value: "+opportunityValue);
        System.out.println("Oppochunity Closed: "+isClosed);
        System.out.println("Is High Value Oppourchunity: "+isHighValue);


    }

}
