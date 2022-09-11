import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinMember> cabinMembers;
    private Plane plane;
    private String flightNumber;
    private String departure;
    private String destination;
    private String departureTime;

    public Flight(Pilot pilot, ArrayList<CabinMember> cabinMembers, Plane plane, String flightNumber, String departure, String destination, String departureTime) {
        this.pilot = pilot;
        this.cabinMembers = cabinMembers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public int getNumberOfSeats(){
        return this.plane.getCapacity();
    }

    public void bookPassenger(Passenger passenger){
        this.plane.bookPassenger(passenger);
    }

    public void bookPassenger(ArrayList passengers){
        this.plane.bookPassenger(passengers);
    }

    public void bookPassenger(Passenger[] passengers){
        this.plane.bookPassenger(passengers);
    }

    public int getNumberOfPassengers() {
        return this.plane.getPassengersOnBoard();
    }

    public String flyPlane() {
        return this.pilot.flyPlane();
    }

    public String talk() {
        return this.cabinMembers.get(0).talk();
    }

    public Pilot getPilot() {
        return pilot;
    }

    public int getCabinMembers() {
        return cabinMembers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int reserveForPassengersBaggage(){
        int wheightOfBaggage = 0;
        for(Passenger passenger: this.plane.getPassengerList()){
          wheightOfBaggage += passenger.getBaggageWieght();
        }
        return wheightOfBaggage / this.plane.getCurrentPlaneCapacity();
    }

    public boolean canPlaneTakeOff(){
        int totalWeightOfBaggage = reserveForPassengersBaggage();
        if(this.plane.isPlaneHalfFull(totalWeightOfBaggage)){
            return true;
        } else {
            return false;
        }
    }


    public int howManyBagsTillHalfFull() {
        return this.plane.howMuchToHalfFull() / 15;
    }

    public int howManyBagsPerPassenger(){
        return howManyBagsTillHalfFull() / this.plane.getCurrentPlaneCapacity();
    }

    public int weightOfPlane(){
        return this.plane.howMuchDoesThePlaneWeight();
    }

    public int weightRemains(){
        int currentWeight = this.plane.howMuchDoesThePlaneWeight();
        return this.plane.getTotalWeightCapacity() - currentWeight;
    }
}
