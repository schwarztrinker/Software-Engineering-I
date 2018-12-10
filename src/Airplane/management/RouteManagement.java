package Airplane.management;

import java.util.ArrayList;

public class RouteManagement implements IRouteManagement {
    String manufacturer;
    String type;
    String id;
    boolean isOn;
    ArrayList<CheckPoint> checkPointList;
    double costIndex;

    public RouteManagement(String manufacturer, String type, String id, boolean isOn, ArrayList<CheckPoint> checkPointList, double costIndex) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = id;
        this.isOn = isOn;
        this.checkPointList = checkPointList;
        this.costIndex = costIndex;
    }

    @Override
    public String version() {
        return null;
    }

    @Override
    public void on() {

    }

    @Override
    public void add(CheckPoint checkPoint) {

    }

    @Override
    public void remove(CheckPoint checkPoint) {

    }

    @Override
    public void printCheckPoints() {

    }

    @Override
    public void setCostIndex(int value) {

    }

    @Override
    public void off() {

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public ArrayList<CheckPoint> getCheckPointList() {
        return checkPointList;
    }

    public void setCheckPointList(ArrayList<CheckPoint> checkPointList) {
        this.checkPointList = checkPointList;
    }

    public double getCostIndex() {
        return costIndex;
    }

    public void setCostIndex(double costIndex) {
        this.costIndex = costIndex;
    }
}
