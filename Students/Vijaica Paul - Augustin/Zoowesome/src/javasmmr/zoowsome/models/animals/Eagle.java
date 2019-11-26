package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Eagle extends Bird {
	public Eagle() {
		setMaintenanceCost(4.5);
	    setDangerPerc(0.45);
		setNumberOfLegs(2);
		setName("Aquila pennata");
		setMigrates(true);
		setAvgFlightAltitude(1000);
	}
	public Eagle(
            Integer numberOfLegs,
            String name,
            Boolean migrates,
            Integer avgFlightAltitude,
            double maintenanceCost,double dangerPerc) {
		setMaintenanceCost(maintenanceCost);
	    setDangerPerc(dangerPerc);
        setNumberOfLegs(numberOfLegs);
        setName(name);
        setMigrates(migrates);
        setAvgFlightAltitude(avgFlightAltitude);
    }
	

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException
	{
	super.encodeToXml(eventWriter);
	createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,Constants.Animals.Birds.Eagle);
	}

}
