

import java.time.Period;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Carolina
 */
public class Chronometer {
    public String color;
    public String modelo;
    public Period timeM ;
    
    private boolean on(){
        boolean state = true;
        return state;
    }
    
    private boolean off(){
        boolean state = false;
        return state;
    }
    

}
