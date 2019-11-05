package javasmmr.zoowsome.models.animals;

public class Swallow extends Bird{
	public Swallow() {
		setNumberOfLegs(2);
		setName("Hirundinidae");
		setMigrates(true);
		setAvgFlightAltitude(200);
	}
	
	public Swallow(
            Integer numberOfLegs,
            String name,
            Boolean migrates,
            Integer avgFlightAltitude) {
        setNumberOfLegs(numberOfLegs);
        setName(name);
        setMigrates(migrates);
        setAvgFlightAltitude(avgFlightAltitude);
    }

}
