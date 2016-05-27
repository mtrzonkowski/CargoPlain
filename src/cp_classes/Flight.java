/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp_classes;

/**
 *
 * @author Michał
 */
public class Flight extends MyObject{
    
    private Airport startDrom;
    private Airport landingDrom;

    public Flight(Airport startDrom, Airport landingDrom) {
        this.startDrom = startDrom;
        this.landingDrom = landingDrom;
    }

    public Airport getStartDrom() {
        return startDrom;
    }

    public void setStartDrom(Airport startDrom) {
        this.startDrom = startDrom;
    }

    public Airport getLandingDrom() {
        return landingDrom;
    }

    public void setLandingDrom(Airport landingDrom) {
        this.landingDrom = landingDrom;
    }
    
    
    
}
