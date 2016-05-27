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
public class Uld extends MyObject{
    
    
    private String name;
    private Airport depAirport;
    private Airport destAirpost;
    private int weight;
    private int value;

    public Uld(String name, Airport depAirport, Airport destAirpost, int weight, int value) {
        this.name = name;
        this.depAirport = depAirport;
        this.destAirpost = destAirpost;
        this.weight = weight;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Airport getDepAirport() {
        return depAirport;
    }

    public void setDepAirport(Airport depAirport) {
        this.depAirport = depAirport;
    }

    public Airport getDestAirpost() {
        return destAirpost;
    }

    public void setDestAirpost(Airport destAirpost) {
        this.destAirpost = destAirpost;
    }

    @Override
    public String toString() {
        return "Uld{" + "name=" + name + ", weight=" + weight + ", depAirport=" + depAirport + ", destAirpost=" + destAirpost + '}';
    }
 
    
}
