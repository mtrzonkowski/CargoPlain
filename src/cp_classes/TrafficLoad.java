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
public class TrafficLoad {
    
    private Airport depDrom;
    private Airport destDrom;
    private ArrayList load;

    public TrafficLoad(Airport depDrom, Airport destDrom, ArrayList load) {
        this.depDrom = depDrom;
        this.destDrom = destDrom;
        this.load=new ArrayList();
        this.load = load;
    }

    public Airport getDepDrom() {
        return depDrom;
    }

    public void setDepDrom(Airport depDrom) {
        this.depDrom = depDrom;
    }

    public Airport getDestDrom() {
        return destDrom;
    }

    public void setDestDrom(Airport destDrom) {
        this.destDrom = destDrom;
    }

    public ArrayList getLoad() {
        return load;
    }

    public void setLoad(ArrayList load) {
        this.load = load;
    }
    
    
    
}
