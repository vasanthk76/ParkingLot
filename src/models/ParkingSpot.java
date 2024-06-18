package models;

import java.util.List;

public class ParkingSpot extends BaseModel{
    private int spotNumber;
    private List<VehicleType> supportedVehicleTypes;
    private ParkingFloor parkingFloor;
    private ParkingSpotStatus parkingSpotStatus;


}
