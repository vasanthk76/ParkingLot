package models;

import java.util.Date;

public class Ticket extends BaseModel{
    private String number;
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSpot vehicleSpot;
    private Gate gate;
    private Operator operator;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getVehicleSpot() {
        return vehicleSpot;
    }

    public void setVehicleSpot(ParkingSpot vehicleSpot) {
        this.vehicleSpot = vehicleSpot;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}