package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird {
	public Parrot() {
		setNumberOfLegs(2);
		setName("Psittacines");
		setMigrates(true);
		setAvgFlightAltitude(100);
	}
	
	public Parrot(
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
