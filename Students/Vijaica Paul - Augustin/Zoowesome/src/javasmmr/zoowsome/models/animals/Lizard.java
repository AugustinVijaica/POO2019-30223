package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile{
	public Lizard() {
		setNumberOfLegs(4);
		setName("Podarcis siculus");
		setEggs(true);
	}

	public Lizard(
            Integer numberOfLegs,
            String name,
            Boolean laysEggs) {
        setNumberOfLegs(numberOfLegs);
        setName(name);
        setEggs(laysEggs);
    }
}

