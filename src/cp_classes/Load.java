/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp_classes;

import java.util.ArrayList;

/**
 *
 * @author Michał
 */
public class Load {
    
    private Flight flight;
    private Uld uld;
    private Position position;

    public Load(Flight flight, Uld uld, Position position) {
        this.flight = flight;
        this.uld = uld;
        this.position = position;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Uld getUld() {
        return uld;
    }

    public void setUld(Uld uld) {
        this.uld = uld;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    
    
    
    
}
