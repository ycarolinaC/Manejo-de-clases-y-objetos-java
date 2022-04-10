
/**
 *
 * @author Carolina
 */
public class Bankaccount {
    
    private int accountNumbre;
    private boolean activated;

    public Bankaccount(int accountNumbre, boolean activated) {
        this.accountNumbre = accountNumbre;
        this.activated = activated;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
    
    
}
