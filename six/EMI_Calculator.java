package six;

import java.util.*;

public class EMI_Calculator {
    double car_price;
    double down_payment;
    double rate_of_intrest;
    byte tenure;
    double total_loan_amunt;
    double payable_amount;
    double emi;
    public void calcuation(){
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter On-Road Price: ");
        car_price = ab.nextDouble();
        System.out.println("Enter Down Payment: ");
        down_payment = ab.nextDouble();
        System.out.println("Enter rate of intrest: ");
        rate_of_intrest = ab.nextDouble();
        System.out.println("Enter Loan Period(in years): ");
        tenure = ab.nextByte();
        total_loan_amunt = car_price - down_payment;
        double r = (rate_of_intrest/12*100);
        int n = tenure*12;
        emi = ((total_loan_amunt)*(r)*(Math.pow(1+r, n)))/(Math.pow((1+r),n) - 1);
        payable_amount = n * emi;

        System.out.println("======CALCULATE EMI OF THE CAR ======");
        System.out.println("On Road Price of a Car: "+car_price);
        System.out.println("Down Payment: "+down_payment);
        System.out.println("Rate Of Intrest: "+rate_of_intrest);
        System.out.println("Total Loan Amount: "+total_loan_amunt);
        System.out.println("Total Payable Amount After Tenure: "+ payable_amount);
        System.out.println("MOnthly Emi: "+emi);
    }

}
