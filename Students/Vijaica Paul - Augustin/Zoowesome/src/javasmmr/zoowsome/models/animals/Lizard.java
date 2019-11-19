package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile{
	public Lizard(double maintenanceCost,double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		setNumberOfLegs(4);
		setName("Podarcis siculus");
		setEggs(true);
	}

	public Lizard(
            Integer numberOfLegs,
            String name,
            Boolean laysEggs,
            double maintenanceCost,double dangerPerc) {
		super(maintenanceCost,dangerPerc);
        setNumberOfLegs(numberOfLegs);
        setName(name);
        setEggs(laysEggs);
    }
}

