/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carolina
 */
public class Shuttle  extends Spaceships{
    
    public Shuttle(String propulsionSystem, String fuel,float mainThrust ){
        super(propulsionSystem, fuel, mainThrust );
        this. mainThrust = 1600000;
        this.velocity = (float)11.2;
    }

    
    
    @Override
    public void accelerateSpaceship() {
        this.velocity = this.velocity + (float)11.2;
    }
    
}
