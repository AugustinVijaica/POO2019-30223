package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.*;

public class AquaticFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Aquatics.Dolphin.equals(type)) {
            return new Dolphin();
        } else if (Constants.Animals.Aquatics.Whale.equals(type)) {
            return new Whale();
        } else if (Constants.Animals.Aquatics.Seahorse.equals(type)) {
            return new Seahorse();
        } else {
           return null;
        }
    }
}