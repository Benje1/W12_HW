public class CabinMember {

    protected String name;
    protected CrewRank rank;

    public CabinMember(String name, CrewRank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public CrewRank getRank() {
        return rank;
    }

    public String talk() {
        return "Here is your lunch";
    }
}
