package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class InsectFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Insects.Bee.equals(type)) {
            return new Bee(2.1,0.04);
        } else if (Constants.Animals.Insects.Cockroach.equals(type)) {
            return new Cockroach(1.1,0.01);
        } else if (Constants.Animals.Insects.Spider.equals(type)) {
            return new Spider(3.6,0.44);
        } else {
            return null;
        }
    }
}