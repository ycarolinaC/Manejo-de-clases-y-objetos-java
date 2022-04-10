
/**
 *
 * @author Carolina
 */
public class Athlete {
    public String name;
    public String sport;
    public int trainingHours;
    public int trainingDays;

    public Athlete(String name, String sport, int trainingHours, int trainingDays) {
        this.name = name;
        this.sport = sport;
        this.trainingHours = trainingHours;
        this.trainingDays = trainingDays;
    }
    
    
    
    public void jogging(){
        System.out.println(this.name + " like to jog.");
    }
    
    public void skating(){
        System.out.println(this.name + " like to skate.");
        
    }
    public void swim(){
        System.out.println(this.name + " like to swin.");
    }
}
