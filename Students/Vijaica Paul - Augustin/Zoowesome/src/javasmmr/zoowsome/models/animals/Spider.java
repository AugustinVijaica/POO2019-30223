package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {

    public Spider(double maintenanceCost,double dangerPerc) {
		super(maintenanceCost,dangerPerc);
        setNumberOfLegs(8);
        setName("Latrodectus apicalis");
        setFly(false);
        setDangerous(true);
    }

    public Spider(
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