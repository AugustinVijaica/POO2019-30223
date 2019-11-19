package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect  {
	public Cockroach(double maintenanceCost,double dangerPerc) {
		super(maintenanceCost,dangerPerc);
	setNumberOfLegs(6);
    setName("Blattella germanica");
    setFly(false);
    setDangerous(false);
}

public Cockroach(
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
