package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	public Monkey() {
		setNumberOfLegs(4);
		setName("Patyrrhini");
		setBodyTemp((float)34.8);
		setBodyCov((float)99.3);
	}
	
	 public Monkey(
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
