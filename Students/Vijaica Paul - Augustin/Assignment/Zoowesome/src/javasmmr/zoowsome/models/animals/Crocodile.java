package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile{
	public Crocodile() {
		setNumberOfLegs(4);
		setName("Crocodylus niloticus");
		setEggs(true);
	}
	 public Crocodile(
	            Integer numberOfLegs,
	            String name,
	            Boolean laysEggs) {
	        setNumberOfLegs(numberOfLegs);
	        setName(name);
	        setEggs(laysEggs);
	    }
}
