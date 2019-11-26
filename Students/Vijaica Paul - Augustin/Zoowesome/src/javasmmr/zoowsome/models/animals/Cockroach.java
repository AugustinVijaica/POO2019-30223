package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cockroach extends Insect  {
	public Cockroach() {
		setMaintenanceCost(1.1);
		setDangerPerc(0.01);
	setNumberOfLegs(6);
    setName("Blattella germanica");
    setFly(false);
    setDangerous(false);
}

public Cockroach(
        Integer numberOfLegs,
        String name,
        Boolean canFly,
        Boolean dangerous,
        double maintenanceCost,double dangerPerc) {
    setNumberOfLegs(numberOfLegs);
    setName(name);
    setFly(canFly);
    setDangerous(dangerous);
    setMaintenanceCost(maintenanceCost);
    setDangerPerc(dangerPerc);
}
public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
{
super.encodeToXml(eventWriter);
createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Insects.Cockroach);
}
}
