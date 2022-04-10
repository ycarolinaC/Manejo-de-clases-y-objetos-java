/**
 *
 * @author Carolina
 */
public  abstract class Spaceships {
    
    public String propulsionSystem;
    public float power;
    public float velocity;
    public String fuel;

    public Spaceships(String propulsionSystem, String fuel){
        this.propulsionSystem =propulsionSystem;
        this.power=0;
        this.velocity=0;
        this.fuel =fuel;
    }

    public abstract void accelerateSpaceship();
    
    public void escapeVelocity(){
        this.velocity= (float)11.2;
        
    }
    
    
}
