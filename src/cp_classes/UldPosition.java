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
public class UldPosition {
    
    private String name;
    private int maxUldWeight;
    private boolean doorPosition;

    public UldPosition(String name, int maxUldWeight, boolean doorPosition) {
        this.name = name;
        this.maxUldWeight = maxUldWeight;
        this.doorPosition = doorPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxUldWeight() {
        return maxUldWeight;
    }

    public void setMaxUldWeight(int maxUldWeight) {
        this.maxUldWeight = maxUldWeight;
    }

    public boolean isDoorPosition() {
        return doorPosition;
    }

    public void setDoorPosition(boolean doorPosition) {
        this.doorPosition = doorPosition;
    }
    
    
}
