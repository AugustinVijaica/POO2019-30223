package javasmmr.zoowsome.models.animals;

public class Dolphin extends Aquatic {
	public Dolphin (double maintenanceCost,double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		setNumberOfLegs(0);
		setName("Actinopterygii");
		setAvgSwimDepth(350);
		setWaterType(WaterType.FRESHWATER);
	}
	
	public Dolphin(
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
