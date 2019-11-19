package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {

    public Snake(double maintenanceCost,double dangerPerc) {
		super(maintenanceCost,dangerPerc);
        setNumberOfLegs(0);
        setName("Python molurus");
        setEggs(true);
    }

    public Snake(
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


