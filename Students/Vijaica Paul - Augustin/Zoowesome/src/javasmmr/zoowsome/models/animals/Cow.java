package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {
	
	public Cow(double maintenanceCost,double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		setNumberOfLegs(4);
		setName("Bos taurus");
		setBodyTemp((float)34.3);
		setBodyCov((float)96.3);
	}
	
	public Cow(Integer numberOfLegs,
	            String name,
	            Float normBodyTemp,
	            Float percBodyCov,
	            double maintenanceCost,double dangerPerc) {
		super(maintenanceCost,dangerPerc);
			setNumberOfLegs(numberOfLegs);
			setName(name);
			setBodyTemp(normBodyTemp);
			setBodyCov(percBodyCov);
	}
}
