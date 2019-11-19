package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Snake;

public class ReptileFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Reptiles.Crocodile.equals(type)) {
            return new Crocodile(4.1,0.91);
        } else if (Constants.Animals.Reptiles.Lizard.equals(type)) {
            return new Lizard(5.4,0.54);
        } else if (Constants.Animals.Reptiles.Snake.equals(type)) {
            return new Snake(4.9,0.69);
        } else {
            return null;
        }
    }
} 