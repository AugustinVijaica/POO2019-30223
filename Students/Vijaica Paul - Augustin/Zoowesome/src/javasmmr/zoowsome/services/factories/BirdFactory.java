package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Birds.Parrot.equals(type)) {
            return new Parrot(2.1,0.01);
        } else if (Constants.Animals.Birds.Swallow.equals(type)) {
            return new Swallow(1.1,0.01);
        } else if (Constants.Animals.Birds.Eagle.equals(type)) {
            return new Eagle(4.5,0.45);
        } else {
            return null;
        }
    }
}