
import java.util.ArrayList;


/**
 *
 * @author Carolina
 */
public class Fruits {
    
    private String name;
    private float averageWeight;
    private ArrayList<String> colors;

    public Fruits(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
    
    
}
