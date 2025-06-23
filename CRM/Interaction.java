package CRM;

public class Interaction {

    public static void main (String[] args) {

        int interactionId = 2586;
        String interactionType = "In - person Meeting";
        String description = "Client requested a live demo at Office";
        String interactionDate = "19-06-2025";
        String interactionTime = "10:30 AM";
        String handledBy = "Support";
        boolean followUpRequired = true;

        System.out.println("Interaction ID: "+interactionId);
        System.out.println("Interaction Type: "+interactionType);
        System.out.println("Description: "+description);
        System.out.println("Date: "+interactionDate);
        System.out.println("Time: "+interactionTime);
        System.out.println("Handled By: "+handledBy);
        System.out.println("Follow-Up Required: "+followUpRequired);

    }

}
