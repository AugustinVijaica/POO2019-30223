package javasmmr.zoowsome.models.animals;

public class Eagle extends Bird {
	public Eagle() {
		setNumberOfLegs(2);
		setName("Aquila pennata");
		setMigrates(true);
		setAvgFlightAltitude(1000);
	}
	public Eagle(
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
