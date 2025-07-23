package six;

public class Car {

    // data of a car --> Data
    String carBrand;
    String carModel;
    double carPrice;
    String carColor;
    double carOffer;

    // behaviour of car
    public void displayCarInfoBanner() {
        System.out.println("Car Brand: "+carBrand);
        System.out.println("Car Model: "+carModel);
        System.out.println("Car Price: "+carPrice);
    }

    // behaviour of long description of car
    public void displayCarInfoPage(){
        System.out.println("Car Brand: "+carBrand);
        System.out.println("Car Model: "+carModel);
        System.out.println("Car Price: "+carPrice);
        System.out.println("Car Colour: "+carColor);
        System.out.println("Car Offer"+carOffer);
    }

}
