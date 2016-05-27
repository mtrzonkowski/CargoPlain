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
public class Position {
    
    private Airplain airplain;
    
    private String positionName;
    private Integer maxPositionWeight;
    private Double positionIndex;
    private boolean doorPosition;

    public Position(Airplain airplain,String positionName, Integer maxPositionWeight,Double positionIndex, boolean doorPosition) {
        this.airplain=airplain;
        this.positionName = positionName;
        this.maxPositionWeight = maxPositionWeight;
        this.positionIndex=positionIndex;
        this.doorPosition = doorPosition;
    }

    public Airplain getAirplain(){
        return this.airplain;
    }
    
    public void setAirplain(Airplain airplain){
        this.airplain=airplain;
    }
    
    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public int getMaxPositionWeight() {
        return maxPositionWeight;
    }

    public void setMaxPositionWeight(int maxPositionWeight) {
        this.maxPositionWeight = maxPositionWeight;
    }

    public Double getPositionIndex() {
        return positionIndex;
    }

    public void setPositionIndex(Double positionIndex) {
        this.positionIndex = positionIndex;
    }

    public boolean isDoorPosition() {
        return doorPosition;
    }

    public void setDoorPosition(boolean doorPosition) {
        this.doorPosition = doorPosition;
    }
    
    
}
