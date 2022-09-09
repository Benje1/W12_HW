public class Passenger {

    private static int baggage = 15;
    private final String name;
    private final int baggageWieght;


    public Passenger(String name, int numberOfBags) {
        this.baggageWieght = baggage * numberOfBags;
        this.name = name;
    }

    public int getBaggageWieght() {
        return baggageWieght;
    }

    public String getName() {
        return name;
    }
}
