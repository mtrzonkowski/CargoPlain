/*
 * Autor: Michał Trzonkowski
 *          S10340
 */
package cp_classes;

import java.util.ArrayList;

/**
 *
 * @author Michał
 */
public class Airport {
    
    private String fullName;    //pełna nazwa lotniska;
    private float latitude;     //szerokość geograficzna lotniska
    private float longitude;    //długość geograficzna lotniska
    private String icao;        //kod lotniska według notacji ICAO
    private String iata;        //kod lotniska według notacji IATA

    public Airport(String fullName, float latitude, float longitude, String icao, String iata) {
        this.fullName = fullName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.icao = icao;
        this.iata = iata;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    @Override
    public String toString() {
        return  iata;
    }

    
    
}
