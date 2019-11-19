package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic {
	public Whale (double maintenanceCost,double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		setNumberOfLegs(0);
		setName("Balaenopteridae");
		setAvgSwimDepth(500);
		setWaterType(WaterType.SALTWATER);
	}
	
	public Whale(
            Integer numberOfLegs,
            String name,
            Integer avgSwimDepth,
            WaterType waterType,
            double maintenanceCost,double dangerPerc) {
		super(maintenanceCost,dangerPerc);
        setNumberOfLegs(numberOfLegs);
        setName(name);
        setAvgSwimDepth(avgSwimDepth);
        setWaterType(waterType);
    }

}
