import java.util.ArrayList;
import java.util.Arrays;

public class Plane {

    private PlaneType planeType;
    private ArrayList<Passenger> passengerList;
    private int planeCapacity;
    private int planeWeight;
    private int totalWeightCapacity;

    public Plane(PlaneType planeType) {
        this.planeType = planeType;
        this.passengerList = new ArrayList<>();
        this.planeCapacity = this.planeType.getCapacity();
        this.planeWeight = this.planeType.getTotalWeight();
        this.totalWeightCapacity = this.planeType.getTotalWeightCapacity();
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }

    public int getCapacity(){
        return this.planeType.getCapacity();
    }

    public int getTotalWeight(){
        return this.planeType.getTotalWeight();
    }

    public int getTotalWeightCapacity() {
        return totalWeightCapacity;
    }

    public int getCurrentPlaneCapacity(){
        return this.planeCapacity - this.passengerList.size();
    }

    public int getCurrentPlaneWeight() {
        return planeWeight;
    }

    public void addPassenger(Passenger passenger) {
        this.passengerList.add(passenger);
    }

    public void addPassenger(ArrayList passengers){
        this.passengerList.addAll(passengers);
    }

    public void addPassenger(Passenger[] passenger){
        ArrayList<Passenger> passengers = new ArrayList<>(Arrays.asList(passenger));
        this.passengerList.addAll(passengers);

    }

    public boolean checkIfFull(){
        int currentPassengers = this.passengerList.size();
        int totalCapacity = this.planeType.getCapacity();
        if(currentPassengers > totalCapacity|| this.passengerList.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    public void bookPassenger(Passenger passenger){
        if(checkIfFull()){
            addPassenger(passenger);
        }
    }
    public void bookPassenger(ArrayList passengers){
        if(checkIfFull()){
            addPassenger(passengers);
        }
    }
    public void bookPassenger(Passenger[] passengers){
        if(checkIfFull()){
            addPassenger(passengers);
        }
    }

    public int getPassengersOnBoard() {
        return this.passengerList.size();
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public boolean isPlaneHalfFull(int weightOfBaggage){
        if(this.planeWeight + weightOfBaggage < this.totalWeightCapacity / 2){
            return true;
        } else {
            return false;
        }
    }

    public int howMuchToHalfFull(){
        int planeWeight = this.planeWeight;
        int halfCapacity = this.totalWeightCapacity / 2;
        return halfCapacity - planeWeight;
    }
}
