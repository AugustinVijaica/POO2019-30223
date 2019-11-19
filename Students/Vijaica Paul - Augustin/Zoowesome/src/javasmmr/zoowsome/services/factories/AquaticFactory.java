package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Aquatics.Dolphin.equals(type)) {
            return new Dolphin(3.1,0.35);
        } else if (Constants.Animals.Aquatics.Whale.equals(type)) {
            return new Whale(4.7,0.67);
        } else if (Constants.Animals.Aquatics.Seahorse.equals(type)) {
            return new Seahorse(2.1,0.02);
        } else {
           return null;
        }
    }
}