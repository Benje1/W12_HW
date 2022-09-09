public enum PlaneType {

    BOEING747(100, 15, 50),
    BOEING737(70, 6, 40),
    BOEINGAIRBUS(200, 20, 90);

    private final int capacity;
    private final int totalWeight;
    private final int totalWeightCapacity;

    PlaneType(int capacity, int totalWeight, int totalWeightCapacity){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
        this.totalWeightCapacity = totalWeightCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight * 1000;
    }

    public int getTotalWeightCapacity() {
        return totalWeightCapacity * 1000;
    }
}
