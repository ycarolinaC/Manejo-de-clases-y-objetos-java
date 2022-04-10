/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carolina
 */
public class Manned extends Spaceships{
    private int capacitePeople;

    public Manned(String propulsionSystem, String fuel, float mainThrust) {
        super(propulsionSystem, fuel, mainThrust);
        this.mainThrust =  mainThrust;
        this.velocity = 10000;
        capacitePeople = 3;
    }

        
    

    @Override
    public void accelerateSpaceship() {
        this.velocity = this.velocity + (float)16000;
    }
}
