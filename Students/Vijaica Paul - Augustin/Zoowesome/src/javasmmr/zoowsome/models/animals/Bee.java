package javasmmr.zoowsome.models.animals;

public class Bee extends Insect {
	public Bee(double maintenanceCost,double dangerPerc) {
		super(maintenanceCost,dangerPerc);
		setNumberOfLegs(6);
	    setName("Anthophila");
	    setFly(true);
	    setDangerous(false);
	}

	public Bee(
	        Integer numberOfLegs,
	        String name,
	        Boolean canFly,
	        Boolean dangerous,
	        double maintenanceCost,double dangerPerc) {
		super(maintenanceCost,dangerPerc);
	    setNumberOfLegs(numberOfLegs);
	    setName(name);
	    setFly(canFly);
	    setDangerous(dangerous);

	}

}
