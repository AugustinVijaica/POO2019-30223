package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile{
	public Crocodile(double maintenanceCost,double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		setNumberOfLegs(4);
		setName("Crocodylus niloticus");
		setEggs(true);
	}
	 public Crocodile(
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
