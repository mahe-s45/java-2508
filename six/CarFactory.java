package six;

public class CarFactory {
    public static void main(String[] args) {
        Car mahindraCar = new Car(); // allocate memory to store mahindraCar info
        mahindraCar.carBrand = "Mahindra";
        mahindraCar.carModel = "Thar";
        mahindraCar.carColor = "Royal Blue";
        mahindraCar.carPrice = 17.62;
        mahindraCar.carOffer = 7.5;
        System.out.println("============= MAHINDRA THAR ===========");
        mahindraCar.displayCarInfoBanner();
        mahindraCar.displayCarInfoPage();
    }

}
