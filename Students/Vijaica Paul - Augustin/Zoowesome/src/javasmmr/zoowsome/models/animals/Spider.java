package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Spider extends Insect {

    public Spider() {
		setMaintenanceCost(3.6);
		setDangerPerc(0.44);
        setNumberOfLegs(8);
        setName("Latrodectus apicalis");
        setFly(false);
        setDangerous(true);
    }

    public Spider(
            Integer numberOfLegs,
            String name,
            Boolean canFly,
            Boolean dangerous,
            double maintenanceCost,double dangerPerc) {
        setNumberOfLegs(numberOfLegs);
        setName(name);
        setFly(canFly);
        setDangerous(dangerous);
        setDangerPerc(dangerPerc);
        setMaintenanceCost(maintenanceCost);
    }
    public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Insects.Spider);
	}
}