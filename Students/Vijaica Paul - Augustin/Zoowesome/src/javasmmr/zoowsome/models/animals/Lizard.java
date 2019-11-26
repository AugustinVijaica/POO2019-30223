package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Lizard extends Reptile{
	public Lizard() {
		setMaintenanceCost(5.4);
	    setDangerPerc(0.54);
		setNumberOfLegs(4);
		setName("Podarcis siculus");
		setEggs(true);
	}

	public Lizard(
            Integer numberOfLegs,
            String name,
            Boolean laysEggs,
            double maintenanceCost,double dangerPerc) {
		setMaintenanceCost(maintenanceCost);
	    setDangerPerc(dangerPerc);
        setNumberOfLegs(numberOfLegs);
        setName(name);
        setEggs(laysEggs);
    }
	

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Reptiles.Lizard);
	}
}

