package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect  {
	public Cockroach() {
	setNumberOfLegs(6);
    setName("Blattella germanica");
    setFly(false);
    setDangerous(false);
}

public Cockroach(
        Integer numberOfLegs,
        String name,
        Boolean canFly,
        Boolean dangerous) {
    setNumberOfLegs(numberOfLegs);
    setName(name);
    setFly(canFly);
    setDangerous(dangerous);

}
}
