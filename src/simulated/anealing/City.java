/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulated.anealing;

/**
 *
 * @author Simon
 */
public class City {
    private String cityName; // represent name of the city 
    private double coordinateX;
    private double coordinateY;

    public City(String cityName, double coordinateX, double coordinateY) {
        this.cityName = cityName;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }
    
    //Eucledian distance , calculated distance between two cities
    public double distance(City city){
        double xDistance =Math.abs(this.coordinateX-city.getCoordinateX());
        double yDistance =Math.abs(this.coordinateY-city.getCoordinateY());
        
        double distance =Math.sqrt((xDistance*xDistance)+(yDistance*yDistance));
        return distance;
    }
    
    @Override
    public String toString(){
        return this.cityName;
    }
}
