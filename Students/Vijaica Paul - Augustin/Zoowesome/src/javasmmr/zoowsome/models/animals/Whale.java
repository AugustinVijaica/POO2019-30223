package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic {
	public Whale (){
		setNumberOfLegs(0);
		setName("Balaenopteridae");
		setAvgSwimDepth(500);
		setWaterType(WaterType.SALTWATER);
	}
	
	public Whale(
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
