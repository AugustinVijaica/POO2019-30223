package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {

    public Snake() {
        setNumberOfLegs(0);
        setName("Python molurus");
        setEggs(true);
    }

    public Snake(
            Integer numberOfLegs,
            String name,
            Boolean laysEggs) {
        setNumberOfLegs(numberOfLegs);
        setName(name);
        setEggs(laysEggs);
    }
} 


