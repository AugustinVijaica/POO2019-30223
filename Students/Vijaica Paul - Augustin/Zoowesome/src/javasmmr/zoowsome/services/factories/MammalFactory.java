package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Tiger;

public class MammalFactory extends SpeciesFactory {

    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Mammals.Cow.equals(type)) {
            return new Cow(5.4,0.03);
        } else if (Constants.Animals.Mammals.Monkey.equals(type)) {
            return new Monkey(2.5,0.05);
        } else if (Constants.Animals.Mammals.Tiger.equals(type)) {
            return new Tiger(4.9,0.73);
        } else {
            return null;
        }
    }
}