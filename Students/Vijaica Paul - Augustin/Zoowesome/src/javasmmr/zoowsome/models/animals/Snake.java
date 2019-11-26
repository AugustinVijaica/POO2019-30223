package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Snake extends Reptile {

    public Snake() {
    	setMaintenanceCost(4.9);
	    setDangerPerc(0.69);
        setNumberOfLegs(0);
        setName("Python molurus");
        setEggs(true);
    }

    public Snake(
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
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Reptiles.Snake);
	}
} 


