
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


/**
 *Request full name, date of birth and height, print the age in years
 * @author Carolina
 */
public class Persons {
    /**
     * attributes
     */
    private String name;
    private String  lastName1;
    private String  lastName2;
    private String dateBirthS;
    private float height;
    private Scanner input;
    private Period age;
    
    /** Initializes the input variable and calls the functions personalData and calculateAge
     * constructor 
     */
    public Persons() {
        input = new Scanner(System.in);
        personalData();
        calculateAge(); 
    }
    /**
     * Receives a string
     * @ input Float
     */
    private float solicitFloat(){   
        return Float.parseFloat(input.nextLine());
    }
    /**
     * Receives a string
     * @ input String
     */
    private String solicitString(){   
        return input.nextLine();
    }
    /**
     * Request personal data
     */
    private void personalData(){
        System.out.println("Enter your name");
        name = solicitString();
        System.out.println("Enter your first last name");
        lastName1 = solicitString();
        System.out.println("Enter your second last name");
        lastName2 = solicitString();
        System.out.println("Enter your date of birth dd/ww/yyyy");
        dateBirthS = solicitString();
        System.out.println("Enter your date of height in meters");
        height = solicitFloat();
    }
    /**
     * Calculate age with date of birth and current date
     */
    private void calculateAge(){
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateBirth = LocalDate.parse(dateBirthS, formatDate);
        LocalDate dateNow = LocalDate.now();
        age = Period.between(dateBirth, dateNow);    
        System.out.printf("Your age: %s years", age.getYears());
                    
    }
    
    /*
    *Access modifiers
    */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getDateBirth() {
        return dateBirthS;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirthS = dateBirth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    
}
