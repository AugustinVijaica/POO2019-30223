package javasmmr.zoowsome.models.animals;

public class Seahorse extends Aquatic {
	public Seahorse() {
		setNumberOfLegs(0);
		setName("Hippocampus");
		setAvgSwimDepth(30);
		setWaterType(WaterType.FRESHWATER);
	}
	
	public Seahorse(
            Integer numberOfLegs,
            String name,
            Integer avgSwimDepth,
            WaterType waterType) {
        setNumberOfLegs(numberOfLegs);
        setName(name);
        setAvgSwimDepth(avgSwimDepth);
        setWaterType(waterType);
    }
}
