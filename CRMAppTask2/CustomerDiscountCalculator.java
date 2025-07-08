package CRMAppTask2;

public class CustomerDiscountCalculator {
    public static void main(String[] args) {
        
        int customerId = 456;
        String customerName = "John";
        boolean isPremium = true;
        int yearsPartnership = 3;
        String dealStage = "Proposal";
        double dealValue = 35000;

        double baseDiscount = 0.0;
        double extraDiscount = 0.0;


        if (isPremium) {
            baseDiscount = 10.0;            
        } else if (yearsPartnership >= 3){
            baseDiscount = 5.0;
        } else {
            baseDiscount = 0.0;
        }

        switch (dealStage) {
            case "Proposal":
                extraDiscount = 2.0;
                break;
            case "Negotiation":
                extraDiscount = 3.0;
                break;
            case " Closed":
                extraDiscount = 5.0;
                break;
            default:
                extraDiscount = 0.0;
        }

        double totalDiscount = baseDiscount + extraDiscount;
        double finalDealValue = dealValue - (dealValue * totalDiscount/100);

        System.out.println("Customer ID: "+customerId);
        System.out.println("Customer Name: "+ customerName);
        System.out.println("Premium Customer: "+isPremium);
        System.out.println("Years of PartnerShip: "+yearsPartnership);
        System.out.println("Deal Stage: "+dealStage);
        System.out.println("Default Amount: "+dealValue);
        System.out.println("Base Discount: "+baseDiscount+" %");
        System.out.println("Extra Discount: "+extraDiscount+" %");
        System.out.println("Total Discount: "+totalDiscount+" %");
        System.out.println("Final Deal Value: "+finalDealValue+" %");

    }

}
