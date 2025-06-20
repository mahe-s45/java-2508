package second;

public class LMSData {

    public static void main(String[] args) {
      // Data for LMS Student Entity
      int studentID = 456;
      String studentName = "Mahesh";
      byte studentAge = 24;
      char studentGender = 'M';
      float studentRating = 4.5f;
      boolean isInstructor = false;
      String courseName = "Java";
      short courseID = 126;

    //Concatenation
      System.out.println("ID is " +studentID);
      System.out.println("Name is "+studentName);
      System.out.println("Age is "+studentAge);
      System.out.println("Gender is "+studentGender);
      System.out.println("Rating is "+studentRating);
      System.out.println("Is Trainer "+isInstructor);
      System.out.println("Course is "+courseName);
      System.out.println("Course ID "+courseID);

    //Arithemetic Operations
    System.out.println("Sun of courseID & studentID "+(courseID+studentID));
    }
    
}
