package models;

import java.util.List;

public class ParkingLot extends BaseModel{

    private List<ParkingFloor> ParkingFloors;
    private List<Gate> gates;
    private List<VehicleType> supportedVehicleType;
    private ParkingLotStatus parkingLotStatus;

    public List<ParkingFloor> getParkingFloors() {
        return ParkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        ParkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public List<VehicleType> getSupportedVehicleType() {
        return supportedVehicleType;
    }

    public void setSupportedVehicleType(List<VehicleType> supportedVehicleType) {
        this.supportedVehicleType = supportedVehicleType;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }
}
