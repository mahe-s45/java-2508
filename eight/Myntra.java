package eight;

public class Myntra {

    String name;
    String fullName;
    String mobileNumber;
    String emailId;
    String location;

    // Hover on profile
    public Myntra(){
        name = "Ravi";
    }

    // Click On Profile
    public Myntra(String fullName, String mobileNumber, String emailId,String location){
        this.fullName =fullName;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.location = location;
    }
    public static void main(String[] args) {
        
        // Hover -> Object should be intialiazed with only name
        Myntra hover = new Myntra();
        System.out.println("Hovering: "+hover.name);


        // Click -> Object should be intialized with only fullName, mobileNumber, emailID etc
        Myntra click = new Myntra("Mahesh", "8796354221", "siliverumahesh@gmail.com", "Hyderabad");
        System.out.println("When Clicked");
        System.out.println(click.fullName);
        System.out.println(click.mobileNumber);
        System.out.println(click.emailId);
        System.out.println(click.location);
        
    }
}
