package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	
	public Tiger() {
		setNumberOfLegs(4);
		setName("Panthera tigris");
		setBodyTemp((float)35.5);
		setBodyCov((float)98.5);
	}
	
	 public Tiger(
	            Integer numberOfLegs,
	            String name,
	            Float normBodyTemp,
	            Float percBodyCov) {
	        setNumberOfLegs(numberOfLegs);
	        setName(name);
	        setBodyTemp(normBodyTemp);
	        setBodyCov(percBodyCov);
	 }

}
