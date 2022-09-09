public class Pilot extends CabinMember{

    private String licenceNumber;

    public Pilot(String name, CrewRank rank, String licenceNumber) {
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getPilotLicence() {
        return this.licenceNumber;
    }

    public String flyPlane(){
        return "Departed and landed";
    }
}
