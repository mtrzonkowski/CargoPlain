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
public class Airplain {
    
    
    private String sign;

    private Integer aveSpeed;
    private Double dryOperationIndex;
    private Double minOperationIndex;
    private Double maxOperationIndex;
    
    private Double singleTimeCost;
    private Integer maxTotalTraficWeight;
    private ArrayList<Position> positions;

    public Airplain(String sign, Integer aveSpeed, Double dryOperationIndex, Double minOperationIndex, Double maxOperationIndex, Double singleTimeCost, Integer maxTotalTraficWeight, ArrayList<Position> positions) {
        this.sign = sign;
        this.aveSpeed = aveSpeed;
        this.dryOperationIndex = dryOperationIndex;
        this.minOperationIndex = minOperationIndex;
        this.maxOperationIndex = maxOperationIndex;
        this.singleTimeCost = singleTimeCost;
        this.maxTotalTraficWeight = maxTotalTraficWeight;
        this.positions = positions;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Integer getAveSpeed() {
        return aveSpeed;
    }

    public void setAveSpeed(Integer aveSpeed) {
        this.aveSpeed = aveSpeed;
    }

    public Double getDryOperationIndex() {
        return dryOperationIndex;
    }

    public void setDryOperationIndex(Double dryOperationIndex) {
        this.dryOperationIndex = dryOperationIndex;
    }

    public Double getMinOperationIndex() {
        return minOperationIndex;
    }

    public void setMinOperationIndex(Double minOperationIndex) {
        this.minOperationIndex = minOperationIndex;
    }

    public Double getMaxOperationIndex() {
        return maxOperationIndex;
    }

    public void setMaxOperationIndex(Double maxOperationIndex) {
        this.maxOperationIndex = maxOperationIndex;
    }

    public Double getSingleTimeCost() {
        return singleTimeCost;
    }

    public void setSingleTimeCost(Double singleTimeCost) {
        this.singleTimeCost = singleTimeCost;
    }

    public Integer getMaxTotalTraficWeight() {
        return maxTotalTraficWeight;
    }

    public void setMaxTotalTraficWeight(Integer maxTotalTraficWeight) {
        this.maxTotalTraficWeight = maxTotalTraficWeight;
    }

    public ArrayList<Position> getPositions() {
        return positions;
    }

    public void setPositions(ArrayList<Position> positions) {
        this.positions = positions;
    }
    
    
}
