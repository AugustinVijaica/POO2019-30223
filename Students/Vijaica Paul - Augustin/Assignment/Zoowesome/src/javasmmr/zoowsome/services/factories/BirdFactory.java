package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class BirdFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Birds.Parrot.equals(type)) {
            return new Parrot();
        } else if (Constants.Animals.Birds.Swallow.equals(type)) {
            return new Swallow();
        } else if (Constants.Animals.Birds.Eagle.equals(type)) {
            return new Eagle();
        } else {
            return null;
        }
    }
}