package javasmmr.zoowsome.repositories;

import org.w3c.dom.*;


import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class AnimalRepository extends EntityRepository<Animal> {

	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}

	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Animals.Reptiles.Crocodile:
			Animal crocodile = new Crocodile();
			crocodile.decodeFromXml(element);
			return crocodile;
		case Constants.Animals.Reptiles.Lizard:
			Animal lizard = new Lizard();
			lizard.decodeFromXml(element);
			return lizard;
		case Constants.Animals.Reptiles.Snake:
			Animal snake = new Snake();
			snake.decodeFromXml(element);
			return snake;
		case Constants.Animals.Insects.Bee:
			Animal bee = new Bee();
			bee.decodeFromXml(element);
			return bee;
		case Constants.Animals.Insects.Cockroach:
			Animal cockroach = new Cockroach();
			cockroach.decodeFromXml(element);
			return cockroach;
		case Constants.Animals.Insects.Spider:
			Animal spider = new Spider();
			spider.decodeFromXml(element);
			return spider;
		case Constants.Animals.Mammals.Tiger:
			Animal tiger = new Tiger();
			tiger.decodeFromXml(element);
			return tiger;
		case Constants.Animals.Mammals.Cow:
			Animal cow = new Cow();
			cow.decodeFromXml(element);
			return cow;
		case Constants.Animals.Mammals.Monkey:
			Animal monkey = new Monkey();
			monkey.decodeFromXml(element);
			return monkey;
		case Constants.Animals.Aquatics.Seahorse:
			Animal seahorse = new Seahorse();
			seahorse.decodeFromXml(element);
			return seahorse;
		case Constants.Animals.Aquatics.Dolphin:
			Animal dolphin = new Dolphin();
			dolphin.decodeFromXml(element);
			return dolphin;
		case Constants.Animals.Aquatics.Whale:
			Animal whale = new Whale();
			whale.decodeFromXml(element);
			return whale;
		case Constants.Animals.Birds.Eagle:
			Animal eagle = new Eagle();
			eagle.decodeFromXml(element);
			return eagle;
		case Constants.Animals.Birds.Parrot:
			Animal parrot = new Parrot();
			parrot.decodeFromXml(element);
			return parrot;
		case Constants.Animals.Birds.Swallow:
			Animal swallow = new Swallow();
			swallow.decodeFromXml(element);
			return swallow;
			default:
				break;
		}

		return null;
	}

}
